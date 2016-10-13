package puzzle;
import java.awt.*;
import java.awt.event.*;
import java.util.*;
import javax.swing.*;
 
public class puzzle extends JPanel {
    final static int num_cajas = 15;
    final static int lado = 4;
    private JLabel ncan,tcan;
    private int con=0,fo=0;
    private JButton re;
 
    Random rand = new Random();
    int[] cajas = new int[num_cajas+ 1];
    int tam_caja, pos_vacia, margen, tam_cua;
 
    public puzzle() {
    	ncan=new JLabel("Movimientos prueba: ");
    	tcan=new JLabel("0");
    	re=new JButton("Nuevo Juego");
    	
        final int dim = 640;
 
        margen = 80;
        tam_caja = (dim - 2 * margen) / lado;
        tam_cua = tam_caja * lado;
 
        setPreferredSize(new Dimension(dim, dim));
        setBackground(new Color(0x909c95));
        setForeground(new Color(0x356248)); 
        setFont(new Font("SansSerif", Font.BOLD, 60));
 
        addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                int ex = e.getX() - margen;
                int ey = e.getY() - margen;
 
                if (ex < 0 || ex > tam_cua || ey < 0 || ey > tam_cua)
                    return;
 
                int c1 = ex / tam_caja;
                int r1 = ey / tam_caja;
                int c2 = pos_vacia % lado;
                int r2 = pos_vacia / lado;
 
                if ((c1 == c2 && Math.abs(r1 - r2) == 1)
                        || (r1 == r2 && Math.abs(c1 - c2) == 1)) {
 
                    int pos_clic = r1 * lado + c1;
                    cajas[pos_vacia] = cajas[pos_clic];
                    cajas[pos_clic] = 0;
                    pos_vacia = pos_clic;
                    con++;
                    tcan.setText(""+con);
                }
                for(int i=0;i<15;i++){
                if(cajas[i]==i+1){
                	fo++;                	
                	}
                }
                if(fo==15){
                	JOptionPane.showMessageDialog(null, "¡Felicitaciones! Has ganado");
                }
                fo=0;
                repaint();
            }
        });
        
        re.addActionListener(new ActionListener(){
        	public void actionPerformed(ActionEvent e){
        		con=0;
        		tcan.setText(""+con);
        		 barajar();
        		 repaint();
        	}
        });
        add(ncan);add(tcan);add(re);
        barajar();
    }
     
    final void barajar() {
        do {
            reiniciar();
            int n = num_cajas;
            while (n > 1) {
                int r = rand.nextInt(n--);
                int tmp = cajas[r];
                cajas[r] = cajas[n];
                cajas[n] = tmp;
            }
        } while (!solucionado());
    }
 
    void reiniciar() {
        for (int i = 0; i < cajas.length; i++)
            cajas[i] = (i + 1) % cajas.length;
        pos_vacia = num_cajas;
    }
 
    boolean solucionado() {
        int cont = 0;
        for (int i = 0; i < num_cajas; i++) {
            for (int j = 0; j < i; j++) {
                if (cajas[j] > cajas[i])
                    cont++;
            }
        }
        return cont % 2 == 0;
    }
 
    void drawGrid(Graphics2D g) {
        for (int i = 0; i < cajas.length; i++) {
            if (cajas[i] == 0)
                continue;
 
            int r = i / lado;
            int c = i % lado;
            int x = margen + c * tam_caja;
            int y = margen + r * tam_caja;
 
            g.setColor(getForeground());
            g.fillRoundRect(x, y, tam_caja, tam_caja, 25, 25);
            g.setColor(Color.black);
            g.drawRoundRect(x, y, tam_caja, tam_caja, 25, 25);
            g.setColor(Color.white);
 
            drawCenteredString(g, String.valueOf(cajas[i]), x, y);
        }
    }
 
    void drawCenteredString(Graphics2D g, String s, int x, int y) {
        FontMetrics fm = g.getFontMetrics();
        int asc = fm.getAscent();
        int dec = fm.getDescent();
 
        x = x + (tam_caja - fm.stringWidth(s)) / 2;
        y = y + (asc + (tam_caja - (asc + dec)) / 2);
 
        g.drawString(s, x, y);
    }
 
    public void paintComponent(Graphics gg) {
        super.paintComponent(gg);
        Graphics2D g = (Graphics2D) gg;
        g.setRenderingHint(RenderingHints.KEY_ANTIALIASING,
                RenderingHints.VALUE_ANTIALIAS_ON);
 
        drawGrid(g);
    }
 
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            JFrame f = new JFrame();
            f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            f.setTitle("Puzzle 15");
            f.setResizable(false);
            f.add(new puzzle(), BorderLayout.CENTER);
            f.pack();
            f.setLocationRelativeTo(null);
            f.setVisible(true);
        });
    }
}
