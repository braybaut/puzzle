package puzzle15;
import java.awt.BorderLayout;
import javax.swing.*;

public class frame_puzzle extends JFrame{
	public frame_puzzle(){
		puzzle15 puz=new puzzle15();
		puzzle_inicial puzi=new puzzle_inicial();
		puzzle_final puzf=new puzzle_final();
		boton_iniciar bi=new boton_iniciar();
		
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
		
	}
}
