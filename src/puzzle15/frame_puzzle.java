package puzzle15;
import java.awt.BorderLayout;
import javax.swing.*;

public class frame_puzzle extends JFrame{
	public frame_puzzle(){
		setTitle("Puzzle 15");
        setResizable(false);
        add(new puzzle15(), BorderLayout.CENTER);
        pack();
        setLocationRelativeTo(null);
		
	}
}
