package puzzle15;
import java.awt.Dimension;
import java.awt.Font;

import javax.swing.*;

public class ayuda extends JPanel{
	public JLabel nayu,tayu;
	public ayuda(){
		setPreferredSize(new Dimension(350, 140));
		setLayout(null);
		setBorder(BorderFactory.createTitledBorder(BorderFactory.createEtchedBorder(), "Ayuda"));
		
		nayu=new JLabel("Puedes mover la ficha:");
		tayu=new JLabel("");
		
		nayu.setBounds(75, 20, 200, 30);
		tayu.setBounds(75, 70, 200, 50);
		
		tayu.setFont(new Font("SansSerif", Font.PLAIN, 50));
		
		nayu.setHorizontalAlignment(JLabel.CENTER);
		tayu.setHorizontalAlignment(JLabel.CENTER);
		
		add(nayu);add(tayu);
				
		
	}
}
