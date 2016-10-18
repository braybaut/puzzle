package puzzle15;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class frame_puzzle extends JFrame{
	puzzle15 puz;
	puzzle_inicial puzi;
	puzzle_final puzf;
	boton_iniciar bi;
	public frame_puzzle(){
		puz=new puzzle15();
		puzi=new puzzle_inicial();
		puzf=new puzzle_final();
		bi=new boton_iniciar();
		
		JPanel izq=new JPanel();
		izq.setLayout(new BoxLayout(izq, BoxLayout.Y_AXIS));
		izq.add(puzi);
		izq.add(puzf);
		izq.add(bi);
		setTitle("Puzzle 15");
        setResizable(false);
        add(puz,BorderLayout.CENTER);
        pack();
        add(izq,BorderLayout.WEST);
        pack();
        
        setLocationRelativeTo(null);
        puz.addMouseListener(new accion_clic(this));
        bi.iniciar.addActionListener(new accion_boton(this));
		
	}
}
