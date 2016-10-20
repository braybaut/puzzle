package puzzle15;
import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class botones extends JPanel{
	public JButton iniciar,aleatorio,salir;
	public botones(){
		setPreferredSize(new Dimension(340, 150));
		setLayout(null);
		iniciar=new JButton("Empezar Juego");
		aleatorio=new JButton("Generar Aleatoriamente");
		salir=new JButton("Salir");
		
		aleatorio.setBounds(65, 20, 210, 30);
		iniciar.setBounds(100, 60, 140, 30);
		salir.setBounds(120, 100, 100, 30);
		
		salir.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				System.exit(0);
			}
		});
		
		add(iniciar);add(aleatorio);add(salir);
		
		
	}
}
