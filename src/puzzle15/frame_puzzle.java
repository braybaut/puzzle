package puzzle15;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class frame_puzzle extends JFrame{
	puzzle15 puz;
	puzzle_inicial puzi;
	puzzle_final puzf;
	botones bi;
	ayuda ay;
	movimientos mov;
	accion_clic ac;
	evento_random ran;
	accion_boton bot;
	tiempo ti;
	public frame_puzzle(){
		puz=new puzzle15();
		puzi=new puzzle_inicial();
		puzf=new puzzle_final();
		bi=new botones();
		ay=new ayuda();
		mov=new movimientos();
		ac=new accion_clic(this);
		ran=new evento_random(this);
		bot=new accion_boton(this);
		ti=new tiempo();
		
		JPanel izq=new JPanel();
		izq.setLayout(new BoxLayout(izq, BoxLayout.Y_AXIS));
		izq.add(puzi);
		izq.add(puzf);
		izq.add(bi);
		JPanel der=new JPanel();
		der.setLayout(new BoxLayout(der, BoxLayout.Y_AXIS));
		der.add(mov);
		der.add(ay);
		der.add(ti);
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
        bi.iniciar.addActionListener(bot);
        bi.aleatorio.addActionListener(ran);
        
        puzi.t0.addFocusListener(new seleccion_cajastexto(this));
        puzi.t1.addFocusListener(new seleccion_cajastexto(this));
        puzi.t2.addFocusListener(new seleccion_cajastexto(this));
        puzi.t3.addFocusListener(new seleccion_cajastexto(this));
        puzi.t4.addFocusListener(new seleccion_cajastexto(this));
        puzi.t5.addFocusListener(new seleccion_cajastexto(this));
        puzi.t6.addFocusListener(new seleccion_cajastexto(this));
        puzi.t7.addFocusListener(new seleccion_cajastexto(this));
        puzi.t8.addFocusListener(new seleccion_cajastexto(this));
        puzi.t9.addFocusListener(new seleccion_cajastexto(this));
        puzi.t10.addFocusListener(new seleccion_cajastexto(this));
        puzi.t11.addFocusListener(new seleccion_cajastexto(this));
        puzi.t12.addFocusListener(new seleccion_cajastexto(this));
        puzi.t13.addFocusListener(new seleccion_cajastexto(this));
        puzi.t14.addFocusListener(new seleccion_cajastexto(this));
        puzi.t15.addFocusListener(new seleccion_cajastexto(this));
        
        puzf.tf0.addFocusListener(new seleccion_cajastexto(this));
        puzf.tf1.addFocusListener(new seleccion_cajastexto(this));
        puzf.tf2.addFocusListener(new seleccion_cajastexto(this));
        puzf.tf3.addFocusListener(new seleccion_cajastexto(this));
        puzf.tf4.addFocusListener(new seleccion_cajastexto(this));
        puzf.tf5.addFocusListener(new seleccion_cajastexto(this));
        puzf.tf6.addFocusListener(new seleccion_cajastexto(this));
        puzf.tf7.addFocusListener(new seleccion_cajastexto(this));
        puzf.tf8.addFocusListener(new seleccion_cajastexto(this));
        puzf.tf9.addFocusListener(new seleccion_cajastexto(this));
        puzf.tf10.addFocusListener(new seleccion_cajastexto(this));
        puzf.tf11.addFocusListener(new seleccion_cajastexto(this));        
        puzf.tf12.addFocusListener(new seleccion_cajastexto(this));
        puzf.tf13.addFocusListener(new seleccion_cajastexto(this));
        puzf.tf14.addFocusListener(new seleccion_cajastexto(this));
        puzf.tf15.addFocusListener(new seleccion_cajastexto(this));
		
	}
}
