package puzzle15;
import javax.swing.*;

import java.awt.Dimension;
import java.awt.event.*;

public class accion_boton implements ActionListener{
	public int[] arrini=new int[16];
	public int[] arrfin=new int[16];
	boolean b;
	frame_puzzle panel;
	public accion_boton(frame_puzzle panel){
		this.panel=panel;
	}
	
	public void actionPerformed(ActionEvent e){
		if(!panel.puzi.t0.getText().isEmpty() && !panel.puzi.t1.getText().isEmpty() && !panel.puzi.t2.getText().isEmpty() && !panel.puzi.t3.getText().isEmpty() && 
				!panel.puzi.t4.getText().isEmpty() && !panel.puzi.t5.getText().isEmpty() && !panel.puzi.t6.getText().isEmpty() && !panel.puzi.t7.getText().isEmpty() && 
				!panel.puzi.t8.getText().isEmpty() && !panel.puzi.t9.getText().isEmpty() && !panel.puzi.t10.getText().isEmpty() && !panel.puzi.t11.getText().isEmpty() && 
				!panel.puzi.t12.getText().isEmpty() && !panel.puzi.t13.getText().isEmpty() && !panel.puzi.t14.getText().isEmpty() && !panel.puzi.t15.getText().isEmpty()
				&& !panel.puzf.tf0.getText().isEmpty() && !panel.puzf.tf1.getText().isEmpty() && !panel.puzf.tf2.getText().isEmpty() && !panel.puzf.tf3.getText().isEmpty() && 
				!panel.puzf.tf4.getText().isEmpty() && !panel.puzf.tf5.getText().isEmpty() && !panel.puzf.tf6.getText().isEmpty() && !panel.puzf.tf7.getText().isEmpty() && 
				!panel.puzf.tf8.getText().isEmpty() && !panel.puzf.tf9.getText().isEmpty() && !panel.puzf.tf10.getText().isEmpty() && !panel.puzf.tf11.getText().isEmpty() && 
				!panel.puzf.tf12.getText().isEmpty() && !panel.puzf.tf13.getText().isEmpty() && !panel.puzf.tf14.getText().isEmpty() && !panel.puzf.tf15.getText().isEmpty()){
			
			
			b=true;
			arrini[0]=Integer.parseInt(panel.puzi.t0.getText());
			arrini[1]=Integer.parseInt(panel.puzi.t1.getText());
			arrini[2]=Integer.parseInt(panel.puzi.t2.getText());
			arrini[3]=Integer.parseInt(panel.puzi.t3.getText());
			arrini[4]=Integer.parseInt(panel.puzi.t4.getText());
			arrini[5]=Integer.parseInt(panel.puzi.t5.getText());
			arrini[6]=Integer.parseInt(panel.puzi.t6.getText());
			arrini[7]=Integer.parseInt(panel.puzi.t7.getText());
			arrini[8]=Integer.parseInt(panel.puzi.t8.getText());
			arrini[9]=Integer.parseInt(panel.puzi.t9.getText());
			arrini[10]=Integer.parseInt(panel.puzi.t10.getText());
			arrini[11]=Integer.parseInt(panel.puzi.t11.getText());
			arrini[12]=Integer.parseInt(panel.puzi.t12.getText());
			arrini[13]=Integer.parseInt(panel.puzi.t13.getText());
			arrini[14]=Integer.parseInt(panel.puzi.t14.getText());
			arrini[15]=Integer.parseInt(panel.puzi.t15.getText());
			
			for(int i=0;i<arrini.length-1;i++){
				for(int j=i+1;j<arrini.length;j++){
					if(arrini[i]==arrini[j]){
						JOptionPane.showMessageDialog(null, "Existe un valor repetido en puzzle incial: \nPosiciones: "+ (i+1) +" y "+ (j+1),"ERROR",0 );
						b=false;
						continue;						
					}
				}
			}
			
			for(int i=0;i<arrini.length;i++){
				if(arrini[i]>15){
					JOptionPane.showMessageDialog(null, "No se admiten números mayores a 15\nPuzzle inicial. Posición: "+(i+1),"ERROR",0);
					b=false;
					continue;
				}
			}
			
			
			arrfin[0]=Integer.parseInt(panel.puzf.tf0.getText());
			arrfin[1]=Integer.parseInt(panel.puzf.tf1.getText());
			arrfin[2]=Integer.parseInt(panel.puzf.tf2.getText());
			arrfin[3]=Integer.parseInt(panel.puzf.tf3.getText());
			arrfin[4]=Integer.parseInt(panel.puzf.tf4.getText());
			arrfin[5]=Integer.parseInt(panel.puzf.tf5.getText());
			arrfin[6]=Integer.parseInt(panel.puzf.tf6.getText());
			arrfin[7]=Integer.parseInt(panel.puzf.tf7.getText());
			arrfin[8]=Integer.parseInt(panel.puzf.tf8.getText());
			arrfin[9]=Integer.parseInt(panel.puzf.tf9.getText());
			arrfin[10]=Integer.parseInt(panel.puzf.tf10.getText());
			arrfin[11]=Integer.parseInt(panel.puzf.tf11.getText());
			arrfin[12]=Integer.parseInt(panel.puzf.tf12.getText());
			arrfin[13]=Integer.parseInt(panel.puzf.tf13.getText());
			arrfin[14]=Integer.parseInt(panel.puzf.tf14.getText());
			arrfin[15]=Integer.parseInt(panel.puzf.tf15.getText());
			
			for(int i=0;i<arrfin.length-1;i++){
				for(int j=i+1;j<arrfin.length;j++){
					if(arrfin[i]==arrfin[j]){
						JOptionPane.showMessageDialog(null, "Existe un valor repetido en puzzle final: \nPosiciones: "+ (i+1) +" y "+ (j+1),"ERROR",0 );
						b=false;
						continue;						
					}
				}
			}
			
			for(int i=0;i<arrfin.length;i++){
				if(arrfin[i]>15){
					JOptionPane.showMessageDialog(null, "No se admiten números mayores a 15\nPuzzle final. Posición: "+(i+1),"ERROR",0);
					b=false;
					continue;
				}
			}
			
			if(b){	
		        panel.puz.barajar(arrini);
		        panel.puz.ganar(arrfin);
		        panel.mov.tmov.setText("0");
				
			}
			
		}else{
			JOptionPane.showMessageDialog(null, "Rellene todos los campos","Aviso",1);
		}
	
	}
}
