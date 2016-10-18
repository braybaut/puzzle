package puzzle15;
import javax.swing.*;
import java.awt.*;

public class puzzle_inicial extends JPanel{
	public JTextField t0,t1,t2,t3,t4,t5,t6,t7,t8,t9,t10,t11,t12,t13,t14,t15;
	private JLabel l0,l1,l2,l3,l4,l5,l6,l7,l8,l9,l10,l11,l12,l13,l14,l15;
	public puzzle_inicial(){
		setPreferredSize(new Dimension(340, 140));
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
		
		t0.setBounds(50, 20, 30, 20);				
		t1.setBounds(130, 20, 30, 20);
		t2.setBounds(210, 20, 30, 20);
		t3.setBounds(290, 20, 30, 20);
		t4.setBounds(50, 50, 30, 20);				
		t5.setBounds(130, 50, 30, 20);
		t6.setBounds(210, 50, 30, 20);
		t7.setBounds(290, 50, 30, 20);
		t8.setBounds(50, 80, 30, 20);				
		t9.setBounds(130, 80, 30, 20);
		t10.setBounds(210, 80, 30, 20);
		t11.setBounds(290, 80, 30, 20);
		t12.setBounds(50, 110, 30, 20);				
		t13.setBounds(130, 110, 30, 20);
		t14.setBounds(210, 110, 30, 20);
		t15.setBounds(290, 110, 30, 20);		
		
		l0.setBounds(10, 20, 30, 20);
		l1.setBounds(90, 20, 30, 20);
		l2.setBounds(170, 20, 30, 20);
		l3.setBounds(250, 20, 30, 20);
		l4.setBounds(10, 50, 30, 20);
		l5.setBounds(90, 50, 30, 20);
		l6.setBounds(170, 50, 30, 20);
		l7.setBounds(250, 50, 30, 20);
		l8.setBounds(10, 80, 30, 20);
		l9.setBounds(90, 80, 30, 20);
		l10.setBounds(170, 80, 30, 20);
		l11.setBounds(250, 80, 30, 20);
		l12.setBounds(10, 110, 30, 20);
		l13.setBounds(90, 110, 30, 20);
		l14.setBounds(170, 110, 30, 20);
		l15.setBounds(250, 110, 30, 20);
		
		add(t0);add(t1);add(t2);add(t3);add(t4);add(t5);add(t6);add(t7);
		add(t8);add(t9);add(t10);add(t11);add(t12);add(t13);add(t14);add(t15);
		add(l0);add(l1);add(l2);add(l3);add(l4);add(l5);add(l6);add(l7);
		add(l8);add(l9);add(l10);add(l11);add(l12);add(l13);add(l14);add(l15);
		
	}
}
