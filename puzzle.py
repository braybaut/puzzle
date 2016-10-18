from random import randint


class Puzzle:
    def __init__(self):
        self.items = {}
        self.position = None

    def main_frame(self):
        d = self.items
        print('+-----+-----+-----+-----+')
        print('|%s|%s|%s|%s|' % (d[1], d[2], d[3], d[4]))
        print('+-----+-----+-----+-----+')
        print('|%s|%s|%s|%s|' % (d[5], d[6], d[7], d[8]))
        print('+-----+-----+-----+-----+')
        print('|%s|%s|%s|%s|' % (d[9], d[10], d[11], d[12]))
        print('+-----+-----+-----+-----+')
        print('|%s|%s|%s|%s|' % (d[13], d[14], d[15], d[16]))
        print('+-----+-----+-----+-----+')

    def format(self, ch):
        ch = ch.strip()
        if len(ch) == 1:
            return '  ' + ch + '  '
        elif len(ch) == 2:
            return '  ' + ch + ' '
        elif len(ch) == 0:
            return '     '

    def change(self, to):
        fro = self.position
        for a, b in self.items.items():
            if b == self.format(str(to)):
                to = a
                break
        self.items[fro], self.items[to] = self.items[to], self.items[fro]
        self.position = to

    def build_board_manual(self):
        i = 1
        while i < 17:
            pos = input("Digite el número que va en la posición {} \n".format(i))
            try:
                pos = int(pos)
                if pos > 0 and pos < 17:
                    if pos == 16:
                        self.items[i] = '     '
                        self.position = i
                    else:
                        self.items[i] = self.format(str(pos))
                    i += 1
                else:
                    print("número invalido rango {} en {}".format(pos, i))
                    print("i: {}".format(i))
            except:
                print("número invalido tipo {} en {}".format(pos, i))
                print("i: {}".format(i))

    def build_board(self, difficulty):
        for i in range(1, 17):
            self.items[i] = self.format(str(i))
        tmp = 0
        for a, b in self.items.items():
            if b == '  16 ':
                self.items[a] = '     '
                tmp = a
                break
        self.position = tmp
        if difficulty == 0:
            diff = 10
        elif difficulty == 1:
            diff = 50
        else:
            diff = 100
        for _ in range(diff):
            lst = self.valid_moves()
            lst1 = []
            for j in lst:
                lst1.append(int(j.strip()))
            self.change(lst1[randint(0, len(lst1)-1)])

    def valid_moves(self):
        pos = self.position
        if pos in [6, 7, 10, 11]:
            return self.items[pos - 4], self.items[pos - 1],\
                   self.items[pos + 1], self.items[pos + 4]
        elif pos in [5, 9]:
            return self.items[pos - 4], self.items[pos + 4],\
                   self.items[pos + 1]
        elif pos in [8, 12]:
            return self.items[pos - 4], self.items[pos + 4],\
                   self.items[pos - 1]
        elif pos in [2, 3]:
            return self.items[pos - 1], self.items[pos + 1], self.items[pos + 4]
        elif pos in [14, 15]:
            return self.items[pos - 1], self.items[pos + 1],\
                  self.items[pos - 4]
        elif pos == 1:
            return self.items[pos + 1], self.items[pos + 4]
        elif pos == 4:
            return self.items[pos - 1], self.items[pos + 4]
        elif pos == 13:
            return self.items[pos + 1], self.items[pos - 4]
        elif pos == 16:
            return self.items[pos - 1], self.items[pos - 4]

    def game_over(self):
        flag = False
        for a, b in self.items.items():
            print("a: {} - b: {}".format(a, b.strip()))
            if b == '     ':
                if a == 16:
                    flag = True
                else:
                    flag = False
                    break
            elif a == int(b.strip()):
                flag = True
            else:
                flag = False
                break
        return flag


g = Puzzle()
g.build_board_manual()
#g.build_board(int(input('Ingresa nivel de dificultad: 0 1 2\n2 ''=> Mas alto     0=> Mas bajo\n')))
g.main_frame()
print('Presiona  0 Para salir')
while True:
    print('Hello :\nPara cambiar la posición, introduce el numero, cerca de este.')
    lst = g.valid_moves()
    lst1 = []
    for i in lst:
        lst1.append(int(i.strip()))
        print(i.strip(), '\t', end='')
    print()
    x = int(input())
    if x == 0:
        break
    elif x not in lst1:
        print('Movimiento incorrecto')
    else:
        g.change(x)
    g.main_frame()
    if g.game_over():
        print('Ganaste')
        break
