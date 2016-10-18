package puzzle15;
import java.awt.*;
import java.awt.event.*;
import java.util.*;
import javax.swing.*;
 
public class puzzle15 extends JPanel {
    final static int num_cajas = 15;
    final static int lado = 4;
    public JLabel ncan,tcan;
    public int con=0,fo=0;
 
    int[] cajas = new int[num_cajas+ 1];
	int[] gana = new int[num_cajas+ 1];
    int tam_caja, pos_vacia, tam_cua,pos_gan;
 
    public puzzle15() {
    	ncan=new JLabel("Movimientos: ");
    	tcan=new JLabel("0");
    	
        tam_caja=480/lado;
        tam_cua=tam_caja*lado;
 
        setPreferredSize(new Dimension(480, 530));
        setBackground(new Color(0x909c95));
        setForeground(new Color(0x356248)); 
        setFont(new Font("SansSerif", Font.BOLD, 60));
 
        addMouseListener(new accion_clic(this));
        
        add(ncan);add(tcan);
    }
     
    final void barajar(int[] arrini) {        
    	
		for(int i=0;i<cajas.length;i++){
			cajas[i]=arrini[i];
			if(arrini[i]==0){
				pos_vacia=i;
			}
		}
		repaint();
		con=0;
		tcan.setText("0");
		        
}

    public void ganar(int[] arrfin){
    	for(int i=0;i<gana.length;i++){
    		gana[i]=arrfin[i];
    		if(arrfin[i]==0){
    			pos_gan=i;
    		}
    	}
    }
 
     
    void drawGrid(Graphics2D g) {
        for (int i = 0; i < cajas.length; i++) {
            if (cajas[i] == 0)
                continue;
 
            int r=i/ lado;
            int c=i%lado;
            int x=c*tam_caja;
            int y=50+r*tam_caja;
 
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
 
}