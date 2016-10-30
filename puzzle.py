import time
import datetime
import os
from random import randint


class Puzzle:
    def __init__(self):
        self.items = {}
        self.items2 = {}
        self.position = None

    def cls(self):
        os.system('cls' if os.name=='nt' else 'clear')

    def main_frame(self):
        print ('Tablero inicial')
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

    def main_frame2(self):
        print ('Tablero Final')
        d = self.items2
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
        print ("Tablero inicial")
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

    def final_build_board_manual(self):
        print ("Tablero Final")
        i = 1
        while i < 17:
            pos = input("Digite el número que va en la posición {} \n".format(i))
            try:
                pos = int(pos)
                if pos > 0 and pos < 17:
                    if pos == 16:
                        self.items2[i] = '     '
                        self.position = i
                    else:
                        self.items2[i] = self.format(str(pos))
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

    def game_over_manual(self):
        flag = False
        if self.items == self.items2:
            flag = True
            return flag
        else:
            flag = False
            return flag
#g.cls()

g = Puzzle()
g.cls()
typeboard = {'1': g.build_board_manual, '2': g.build_board}
flag2 = True
while flag2:
    option=input("1 si quiere el tablero manual o 2 si quiere el tablero automatico:  ")
    try:
        board=typeboard[option]
        if option=='2':
            flag3 = True
            while flag3:
                boardf=input("Tablero final: 1 si quiere automatico, 2 si quiere manual")
                if boardf =='2':
                    print ("manual")
                    g.final_build_board_manual()
                    break
                elif boardf == '1':
                    break
                else:
                    print ("opcion incorrecta vuelva a intentar")
            board(int(input('Ingresa nivel de dificultad: 0 1 2\n2 ''=> Mas alto     0=> Mas bajo\n')))
            g.cls()
            break
        else:
            board()
            g.cls()
            g.final_build_board_manual()
            #g.main_frame2()
            #input=('Enter para continuar')
            g.cls()
            break
    except:
        input('opcion incorrecta vuelva a intentar')
        g.cls()
#g.build_board(int(input('Ingresa nivel de dificultad: 0 1 2\n2 ''=> Mas alto     0=> Mas bajo\n')))
g.main_frame()
if option == '1' or boardf == '2':
    g.main_frame2()

init_time = time.time()
print('Presiona  0 Para salir')
while True:
    print('Hola :\nPara cambiar la posición, introduce el numero, cerca de este.')
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
    if option == '1' or boardf == '2':
        g.main_frame2()
    g.main_frame()
    if option == '1' or boardf=='2':
        if g.game_over_manual():
            end_time = time.time()
            print('Ganaste')
            total_time = end_time - init_time
            print("Tiempo total: {} segundos".format(total_time))
            break
    else:
        if g.game_over():
            end_time = time.time()
            print('Ganaste')
            total_time = end_time - init_time
            print("Tiempo total: {} segundos".format(total_time))
            break
