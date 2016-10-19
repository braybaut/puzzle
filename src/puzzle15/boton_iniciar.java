package puzzle15;
import javax.swing.*;
import java.awt.*;

public class boton_iniciar extends JPanel{
	public JButton iniciar;
	public boton_iniciar(){
		setPreferredSize(new Dimension(340, 150));
		setLayout(null);
		iniciar=new JButton("Empezar Juego");
		
		iniciar.setBounds(100, 30, 140, 30);		
		
		add(iniciar);
	}
}
