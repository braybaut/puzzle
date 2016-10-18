package puzzle15;
import java.awt.BorderLayout;
import javax.swing.*;

public class frame_puzzle extends JFrame{
	public frame_puzzle(){
		puzzle15 puz=new puzzle15();
		puzzle_inicial puzi=new puzzle_inicial();
		setTitle("Puzzle 15");
        setResizable(false);
        add(puz,BorderLayout.CENTER);
        pack();
        add(puzi,BorderLayout.WEST);
        pack();
        setLocationRelativeTo(null);
		
	}
}
