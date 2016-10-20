package puzzle15;
import java.awt.event.*;
import java.util.*;

public class evento_random implements ActionListener{
	frame_puzzle frame;
	Random ran=new Random();
	private int[] arrini=new int[16];
	private int[] arrfin=new int[16];
	private int c=0;
	public evento_random(frame_puzzle frame){
		this.frame=frame;
	}
	public void actionPerformed(ActionEvent e){
		random();
		frame.puzi.t0.setText(""+arrini[0]);
		frame.puzi.t1.setText(""+arrini[1]);
		frame.puzi.t2.setText(""+arrini[2]);
		frame.puzi.t3.setText(""+arrini[3]);
		frame.puzi.t4.setText(""+arrini[4]);
		frame.puzi.t5.setText(""+arrini[5]);
		frame.puzi.t6.setText(""+arrini[6]);
		frame.puzi.t7.setText(""+arrini[7]);
		frame.puzi.t8.setText(""+arrini[8]);
		frame.puzi.t9.setText(""+arrini[9]);
		frame.puzi.t10.setText(""+arrini[10]);
		frame.puzi.t11.setText(""+arrini[11]);
		frame.puzi.t12.setText(""+arrini[12]);
		frame.puzi.t13.setText(""+arrini[13]);
		frame.puzi.t14.setText(""+arrini[14]);
		frame.puzi.t15.setText(""+arrini[15]);
		
		frame.puzf.tf0.setText(""+arrfin[0]);
		frame.puzf.tf1.setText(""+arrfin[1]);
		frame.puzf.tf2.setText(""+arrfin[2]);
		frame.puzf.tf3.setText(""+arrfin[3]);
		frame.puzf.tf4.setText(""+arrfin[4]);
		frame.puzf.tf5.setText(""+arrfin[5]);
		frame.puzf.tf6.setText(""+arrfin[6]);
		frame.puzf.tf7.setText(""+arrfin[7]);
		frame.puzf.tf8.setText(""+arrfin[8]);
		frame.puzf.tf9.setText(""+arrfin[9]);
		frame.puzf.tf10.setText(""+arrfin[10]);
		frame.puzf.tf11.setText(""+arrfin[11]);
		frame.puzf.tf12.setText(""+arrfin[12]);
		frame.puzf.tf13.setText(""+arrfin[13]);
		frame.puzf.tf14.setText(""+arrfin[14]);
		frame.puzf.tf15.setText(""+arrfin[15]);
		
	}
	
	public void random(){
		for(int i=0;i<frame.puz.cajas.length;i++){
			arrini[i]=i;
			arrfin[i]=i;
		}
		int n=frame.puz.num_cajas;
        while (n > 1) {
            int r = ran.nextInt(n--);
            int tmp = arrini[r];
            arrini[r] = arrini[n];
            arrini[n] = tmp;
        }
        n=frame.puz.num_cajas;
        while (n > 1) {
            int r = ran.nextInt(n--);
            int tmp = arrfin[r];
            arrfin[r] = arrfin[n];
            arrfin[n] = tmp;
        }
        for(int i=0;i<frame.puz.cajas.length;i++){
        if(arrini[i]==arrfin[i]){
        	c++;
        	}
        }
        if(c==16){
        	random();
        }
        c=0;
	}
}
