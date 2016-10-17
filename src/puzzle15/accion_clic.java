package puzzle15;
import javax.swing.*;
import java.awt.event.*;

public class accion_clic extends MouseAdapter{
	puzzle15 puzzle;
	public accion_clic(puzzle15 puzzle){
		this.puzzle=puzzle;
	}
	public void mousePressed(MouseEvent e){
		int ex = e.getX();
        int ey = e.getY() - 50;

        if (ey < 0 || ey > puzzle.tam_cua)
            return;

        int c1 = ex / puzzle.tam_caja;
        int r1 = ey / puzzle.tam_caja;
        int c2 = puzzle.pos_vacia % puzzle.lado;
        int r2 = puzzle.pos_vacia / puzzle.lado;

        if ((c1 == c2 && Math.abs(r1 - r2) == 1)
                || (r1 == r2 && Math.abs(c1 - c2) == 1)) {

            int pos_clic = r1 * puzzle.lado + c1;
            puzzle.cajas[puzzle.pos_vacia] = puzzle.cajas[pos_clic];
            puzzle.cajas[pos_clic] = 0;
            puzzle.pos_vacia = pos_clic;
            puzzle.con++;
            puzzle.tcan.setText(""+puzzle.con);
        }
        /*for(int i=0;i<15;i++){
        if(puzzle.cajas[i]==i+1){
        	puzzle.fo++;                	
        	}
        }
        if(puzzle.fo==15){
        	JOptionPane.showMessageDialog(null, "¡Felicitaciones! Has ganado");
        }*/
        puzzle.fo=0;
        puzzle.repaint();
	}
}
