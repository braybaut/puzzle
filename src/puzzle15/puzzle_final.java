package puzzle15;
import javax.swing.*;

import java.awt.*;

public class puzzle_final extends JPanel{
	public JTextField tf0,tf1,tf2,tf3,tf4,tf5,tf6,tf7,tf8,tf9,tf10,tf11,tf12,tf13,tf14,tf15;
	private JLabel lf0,lf1,lf2,lf3,lf4,lf5,lf6,lf7,lf8,lf9,lf10,lf11,lf12,lf13,lf14,lf15;
	public puzzle_final(){
		setPreferredSize(new Dimension(350, 140));
		setLayout(null);
		setBorder(BorderFactory.createTitledBorder(BorderFactory.createEtchedBorder(), "Puzzle Final"));
		
		tf0=new JTextField("15");
		tf1=new JTextField("14");
		tf2=new JTextField("13");
		tf3=new JTextField("12");
		tf4=new JTextField("11");
		tf5=new JTextField("10");
		tf6=new JTextField("9");
		tf7=new JTextField("8");
		tf8=new JTextField("7");
		tf9=new JTextField("6");
		tf10=new JTextField("5");
		tf11=new JTextField("0");
		tf12=new JTextField("3");
		tf13=new JTextField("2");
		tf14=new JTextField("1");
		tf15=new JTextField("4");
		
		lf0=new JLabel("1:");
		lf1=new JLabel("2:");
		lf2=new JLabel("3:");
		lf3=new JLabel("4:");
		lf4=new JLabel("5:");
		lf5=new JLabel("6:");
		lf6=new JLabel("7:");
		lf7=new JLabel("8:");
		lf8=new JLabel("9:");
		lf9=new JLabel("10:");
		lf10=new JLabel("11:");
		lf11=new JLabel("12:");
		lf12=new JLabel("13:");
		lf13=new JLabel("14:");
		lf14=new JLabel("15:");
		lf15=new JLabel("16:");
		
		tf0.setBounds(50, 30, 30, 20);				
		tf1.setBounds(130, 30, 30, 20);
		tf2.setBounds(210, 30, 30, 20);
		tf3.setBounds(290, 30, 30, 20);
		tf4.setBounds(50, 60, 30, 20);				
		tf5.setBounds(130, 60, 30, 20);
		tf6.setBounds(210, 60, 30, 20);
		tf7.setBounds(290, 60, 30, 20);
		tf8.setBounds(50, 90, 30, 20);				
		tf9.setBounds(130, 90, 30, 20);
		tf10.setBounds(210, 90, 30, 20);
		tf11.setBounds(290, 90, 30, 20);
		tf12.setBounds(50, 120, 30, 20);				
		tf13.setBounds(130, 120, 30, 20);
		tf14.setBounds(210, 120, 30, 20);
		tf15.setBounds(290, 120, 30, 20);		
		
		lf0.setBounds(10, 30, 30, 20);
		lf1.setBounds(90, 30, 30, 20);
		lf2.setBounds(170, 30, 30, 20);
		lf3.setBounds(250, 30, 30, 20);
		lf4.setBounds(10, 60, 30, 20);
		lf5.setBounds(90, 60, 30, 20);
		lf6.setBounds(170, 60, 30, 20);
		lf7.setBounds(250, 60, 30, 20);
		lf8.setBounds(10, 90, 30, 20);
		lf9.setBounds(90, 90, 30, 20);
		lf10.setBounds(170, 90, 30, 20);
		lf11.setBounds(250, 90, 30, 20);
		lf12.setBounds(10, 120, 30, 20);
		lf13.setBounds(90, 120, 30, 20);
		lf14.setBounds(170, 120, 30, 20);
		lf15.setBounds(250, 120, 30, 20);
		
		tf0.addKeyListener(new numeros());
		tf1.addKeyListener(new numeros());
		tf2.addKeyListener(new numeros());
		tf3.addKeyListener(new numeros());
		tf4.addKeyListener(new numeros());
		tf5.addKeyListener(new numeros());
		tf6.addKeyListener(new numeros());
		tf7.addKeyListener(new numeros());
		tf8.addKeyListener(new numeros());
		tf9.addKeyListener(new numeros());
		tf10.addKeyListener(new numeros());
		tf11.addKeyListener(new numeros());
		tf12.addKeyListener(new numeros());
		tf13.addKeyListener(new numeros());
		tf14.addKeyListener(new numeros());
		tf15.addKeyListener(new numeros());
		
		add(lf0);add(lf1);add(lf2);add(lf3);add(lf4);add(lf5);add(lf6);add(lf7);
		add(lf8);add(lf9);add(lf10);add(lf11);add(lf12);add(lf13);add(lf14);add(lf15);
		add(tf0);add(tf1);add(tf2);add(tf3);add(tf4);add(tf5);add(tf6);add(tf7);
		add(tf8);add(tf9);add(tf10);add(tf11);add(tf12);add(tf13);add(tf14);add(tf15);
	}
}
