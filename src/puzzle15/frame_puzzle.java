package puzzle15;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class frame_puzzle extends JFrame{
	puzzle15 puz;
	puzzle_inicial puzi;
	puzzle_final puzf;
	boton_iniciar bi;
	ayuda ay;
	movimientos mov;
	accion_clic ac;
	public frame_puzzle(){
		puz=new puzzle15();
		puzi=new puzzle_inicial();
		puzf=new puzzle_final();
		bi=new boton_iniciar();
		ay=new ayuda();
		mov=new movimientos();
		ac=new accion_clic(this);
		
		JPanel izq=new JPanel();
		izq.setLayout(new BoxLayout(izq, BoxLayout.Y_AXIS));
		izq.add(puzi);
		izq.add(puzf);
		izq.add(bi);
		JPanel der=new JPanel();
		der.setLayout(new BoxLayout(der, BoxLayout.Y_AXIS));
		der.add(mov);
		der.add(ay);
		setTitle("Puzzle 15");
        setResizable(false);
        add(puz,BorderLayout.CENTER);
        pack();
        add(izq,BorderLayout.WEST);
        pack();
        add(der,BorderLayout.EAST);
        pack();
        
        setLocationRelativeTo(null);
        puz.addMouseListener(ac);
        bi.iniciar.addActionListener(new accion_boton(this));
		
	}
}
