package puzzle15;
import javax.swing.*;

import java.awt.*;

public class puzzle_inicial extends JPanel{
	public JTextField t0,t1,t2,t3,t4,t5,t6,t7,t8,t9,t10,t11,t12,t13,t14,t15;
	private JLabel l0,l1,l2,l3,l4,l5,l6,l7,l8,l9,l10,l11,l12,l13,l14,l15;
	public puzzle_inicial(){
		setPreferredSize(new Dimension(350, 140));
		setLayout(null);
		setBorder(BorderFactory.createTitledBorder(BorderFactory.createEtchedBorder(), "Puzzle Inicial"));
		
		t0=new JTextField("15");
		t1=new JTextField("14");
		t2=new JTextField("13");
		t3=new JTextField("12");
		t4=new JTextField("11");
		t5=new JTextField("10");
		t6=new JTextField("9");
		t7=new JTextField("8");
		t8=new JTextField("7");
		t9=new JTextField("6");
		t10=new JTextField("5");
		t11=new JTextField("4");
		t12=new JTextField("3");
		t13=new JTextField("2");
		t14=new JTextField("1");
		t15=new JTextField("0");
		
		l0=new JLabel("1:");
		l1=new JLabel("2:");
		l2=new JLabel("3:");
		l3=new JLabel("4:");
		l4=new JLabel("5:");
		l5=new JLabel("6:");
		l6=new JLabel("7:");
		l7=new JLabel("8:");
		l8=new JLabel("9:");
		l9=new JLabel("10:");
		l10=new JLabel("11:");
		l11=new JLabel("12:");
		l12=new JLabel("13:");
		l13=new JLabel("14:");
		l14=new JLabel("15:");
		l15=new JLabel("16:");
		
		t0.setBounds(50, 30, 30, 20);				
		t1.setBounds(130, 30, 30, 20);
		t2.setBounds(210, 30, 30, 20);
		t3.setBounds(290, 30, 30, 20);
		t4.setBounds(50, 60, 30, 20);				
		t5.setBounds(130, 60, 30, 20);
		t6.setBounds(210, 60, 30, 20);
		t7.setBounds(290, 60, 30, 20);
		t8.setBounds(50, 90, 30, 20);				
		t9.setBounds(130, 90, 30, 20);
		t10.setBounds(210, 90, 30, 20);
		t11.setBounds(290, 90, 30, 20);
		t12.setBounds(50, 120, 30, 20);				
		t13.setBounds(130, 120, 30, 20);
		t14.setBounds(210, 120, 30, 20);
		t15.setBounds(290, 120, 30, 20);		
		
		l0.setBounds(10, 30, 30, 20);
		l1.setBounds(90, 30, 30, 20);
		l2.setBounds(170, 30, 30, 20);
		l3.setBounds(250, 30, 30, 20);
		l4.setBounds(10, 60, 30, 20);
		l5.setBounds(90, 60, 30, 20);
		l6.setBounds(170, 60, 30, 20);
		l7.setBounds(250, 60, 30, 20);
		l8.setBounds(10, 90, 30, 20);
		l9.setBounds(90, 90, 30, 20);
		l10.setBounds(170, 90, 30, 20);
		l11.setBounds(250, 90, 30, 20);
		l12.setBounds(10, 120, 30, 20);
		l13.setBounds(90, 120, 30, 20);
		l14.setBounds(170, 120, 30, 20);
		l15.setBounds(250, 120, 30, 20);
		
		t0.addKeyListener(new numeros());
		t1.addKeyListener(new numeros());
		t2.addKeyListener(new numeros());
		t3.addKeyListener(new numeros());
		t4.addKeyListener(new numeros());
		t5.addKeyListener(new numeros());
		t6.addKeyListener(new numeros());
		t7.addKeyListener(new numeros());
		t8.addKeyListener(new numeros());
		t9.addKeyListener(new numeros());
		t10.addKeyListener(new numeros());
		t11.addKeyListener(new numeros());
		t12.addKeyListener(new numeros());
		t13.addKeyListener(new numeros());
		t14.addKeyListener(new numeros());
		t15.addKeyListener(new numeros());
		
		add(t0);add(t1);add(t2);add(t3);add(t4);add(t5);add(t6);add(t7);
		add(t8);add(t9);add(t10);add(t11);add(t12);add(t13);add(t14);add(t15);
		add(l0);add(l1);add(l2);add(l3);add(l4);add(l5);add(l6);add(l7);
		add(l8);add(l9);add(l10);add(l11);add(l12);add(l13);add(l14);add(l15);
		
	}
}
