package puzzle15;
import javax.swing.*;
import java.awt.event.*;
import java.util.Random;

public class accion_clic extends MouseAdapter{
	frame_puzzle puzzle;
	public int pos0,ale;
	private Random rand=new Random();
	private boolean b;
	public accion_clic(frame_puzzle puzzle){
		this.puzzle=puzzle;
	}
	public void mousePressed(MouseEvent e){
		
		int ex = e.getX();
        int ey = e.getY();

        if (ey < 0 || ey > puzzle.puz.tam_cua)
            return;

        int c1=ex/puzzle.puz.tam_caja;
        int r1=ey/puzzle.puz.tam_caja;
        int c2=puzzle.puz.pos_vacia % puzzle.puz.lado;
        int r2=puzzle.puz.pos_vacia / puzzle.puz.lado;

        if ((c1 == c2 && Math.abs(r1 - r2) == 1)
                || (r1 == r2 && Math.abs(c1 - c2) == 1)) {

            int pos_clic = r1 * puzzle.puz.lado + c1;
            puzzle.puz.cajas[puzzle.puz.pos_vacia] = puzzle.puz.cajas[pos_clic];
            puzzle.puz.cajas[pos_clic] = 0;
            puzzle.puz.pos_vacia = pos_clic;
            puzzle.puz.con++;
            puzzle.mov.tmov.setText(""+puzzle.puz.con);
        }
        puzzle.repaint();
        ayuda();
        verifica();
	}
	
	public void verifica(){
		for(int i=0;i<puzzle.puz.cajas.length;i++){
            if(puzzle.puz.cajas[i]==puzzle.puz.gana[i]){
            	puzzle.puz.fo++;                	
            	}            
        }
            if(puzzle.puz.fo==16){
            	puzzle.ay.tayu.setText("");
            	if(puzzle.puz.con==1){
            		JOptionPane.showMessageDialog(null, "¡Felicitaciones! Has ganado\nLo has logrado en "+puzzle.puz.con+" movimiento"
            				+ "\nEn un tiempo de "+puzzle.ti.hor+"H-"+puzzle.ti.min+"M-"+puzzle.ti.seg+"S","GANASTE",1);            	
            	}else{
            		JOptionPane.showMessageDialog(null, "¡Felicitaciones! Has ganado\nLo has logrado en "+puzzle.puz.con+" movimientos"
            				+ "\nEn un tiempo de "+puzzle.ti.hor+"H-"+puzzle.ti.min+"M-"+puzzle.ti.seg+"S","GANASTE",1);
            	}
            	
            	puzzle.puz.barajar(puzzle.puz.cajas);
            	puzzle.mov.tmov.setText(""+puzzle.puz.con);
            	puzzle.puz.barajar(puzzle.bot.arrini);
            	ayuda();
            	puzzle.ti.reiniciar();
            	
            	
            }
        puzzle.puz.fo=0;
	}
	
	public void ayuda(){
		b=true;
		for(int i=0;i<puzzle.puz.cajas.length;i++){
        	if(puzzle.puz.cajas[i]==0){
        		pos0=i;
        	}
        }
		
        if(pos0==0){
        	if(puzzle.puz.cajas[pos0+1]==puzzle.puz.gana[pos0] || puzzle.puz.cajas[pos0+4]==puzzle.puz.gana[pos0]){
        		ale=puzzle.puz.gana[pos0];
        	}else{
        	while(b){
        		ale=rand.nextInt(puzzle.puz.cajas.length);
        		if(puzzle.puz.cajas[pos0+1]==ale || puzzle.puz.cajas[pos0+4]==ale){
        			b=false;
        		}
        	}
        	}
        	puzzle.ay.tayu.setText("" + ale);
        }
        
        if(pos0==3){
        	if(puzzle.puz.cajas[pos0-1]==puzzle.puz.gana[pos0] || puzzle.puz.cajas[pos0+4]==puzzle.puz.gana[pos0]){
        		ale=puzzle.puz.gana[pos0];
        	}else{
        	while(b){
        		ale=rand.nextInt(puzzle.puz.cajas.length);
        		if(puzzle.puz.cajas[pos0-1]==ale || puzzle.puz.cajas[pos0+4]==ale){
        			b=false;
        		}
        	}
        	}
        	puzzle.ay.tayu.setText("" + ale);
        }
        
        if(pos0==12){
        	if(puzzle.puz.cajas[pos0+1]==puzzle.puz.gana[pos0] || puzzle.puz.cajas[pos0-4]==puzzle.puz.gana[pos0]){
        		ale=puzzle.puz.gana[pos0];
        	}else{
        	while(b){
        		ale=rand.nextInt(puzzle.puz.cajas.length);
        		if(puzzle.puz.cajas[pos0+1]==ale || puzzle.puz.cajas[pos0-4]==ale){
        			b=false;
        		}
        	}
        	}
        	puzzle.ay.tayu.setText("" + ale);
        }
        
        if(pos0==15){
        	if(puzzle.puz.cajas[pos0-1]==puzzle.puz.gana[pos0] || puzzle.puz.cajas[pos0-4]==puzzle.puz.gana[pos0]){
        		ale=puzzle.puz.gana[pos0];
        	}else{
        	while(b){
        		ale=rand.nextInt(puzzle.puz.cajas.length);
        		if(puzzle.puz.cajas[pos0-1]==ale || puzzle.puz.cajas[pos0-4]==ale){
        			b=false;
        		}
        	}
        	}
        	puzzle.ay.tayu.setText("" + ale);
        }
        
        if(pos0==1 || pos0==2){
        	if(puzzle.puz.cajas[pos0-1]==puzzle.puz.gana[pos0] || puzzle.puz.cajas[pos0+1]==puzzle.puz.gana[pos0] 
        			|| puzzle.puz.cajas[pos0+4]==puzzle.puz.gana[pos0]){
        		ale=puzzle.puz.gana[pos0];
        	}else{
        	while(b){
        		ale=rand.nextInt(puzzle.puz.cajas.length);
        		if(puzzle.puz.cajas[pos0-1]==ale || puzzle.puz.cajas[pos0+1]==ale || puzzle.puz.cajas[pos0+4]==ale){
        			b=false;
        		}
        	}
        	}
        	puzzle.ay.tayu.setText("" + ale);
        }
        
        if(pos0==4 || pos0==8){
        	if(puzzle.puz.cajas[pos0-4]==puzzle.puz.gana[pos0] || puzzle.puz.cajas[pos0+1]==puzzle.puz.gana[pos0] 
        			|| puzzle.puz.cajas[pos0+4]==puzzle.puz.gana[pos0]){
        		ale=puzzle.puz.gana[pos0];
        	}else{
        	while(b){
        		ale=rand.nextInt(puzzle.puz.cajas.length);
        		if(puzzle.puz.cajas[pos0-4]==ale || puzzle.puz.cajas[pos0+1]==ale || puzzle.puz.cajas[pos0+4]==ale){
        			b=false;
        		}
        	}
        	}
        	puzzle.ay.tayu.setText("" + ale);
        }
        
        if(pos0==7 || pos0==11){
        	if(puzzle.puz.cajas[pos0-4]==puzzle.puz.gana[pos0] || puzzle.puz.cajas[pos0-1]==puzzle.puz.gana[pos0] 
        			|| puzzle.puz.cajas[pos0+4]==puzzle.puz.gana[pos0]){
        		ale=puzzle.puz.gana[pos0];
        	}else{
        	while(b){
        		ale=rand.nextInt(puzzle.puz.cajas.length);
        		if(puzzle.puz.cajas[pos0-4]==ale || puzzle.puz.cajas[pos0-1]==ale || puzzle.puz.cajas[pos0+4]==ale){
        			b=false;
        		}
        	}
        	}
        	puzzle.ay.tayu.setText("" + ale);
        }
        	
        if(pos0==13 || pos0==14){
        	if(puzzle.puz.cajas[pos0-4]==puzzle.puz.gana[pos0] || puzzle.puz.cajas[pos0-1]==puzzle.puz.gana[pos0] 
        			|| puzzle.puz.cajas[pos0+1]==puzzle.puz.gana[pos0]){
        		ale=puzzle.puz.gana[pos0];
        	}else{
        	while(b){
        		ale=rand.nextInt(puzzle.puz.cajas.length);
        		if(puzzle.puz.cajas[pos0-4]==ale || puzzle.puz.cajas[pos0-1]==ale || puzzle.puz.cajas[pos0+1]==ale){
        			b=false;
        		}
        	}
        	}
        	puzzle.ay.tayu.setText("" + ale);
        }
        
        if(pos0==5 || pos0==6 || pos0==9 || pos0==10){
        	if(puzzle.puz.cajas[pos0-4]==puzzle.puz.gana[pos0] || puzzle.puz.cajas[pos0-1]==puzzle.puz.gana[pos0] 
        			|| puzzle.puz.cajas[pos0+1]==puzzle.puz.gana[pos0] || puzzle.puz.cajas[pos0+4]==puzzle.puz.gana[pos0]){
        		ale=puzzle.puz.gana[pos0];
        	}else{
        	while(b){
        		ale=rand.nextInt(puzzle.puz.cajas.length);
        		if(puzzle.puz.cajas[pos0-4]==ale || puzzle.puz.cajas[pos0-1]==ale || puzzle.puz.cajas[pos0+1]==ale || puzzle.puz.cajas[pos0+4]==ale){
        			b=false;
        		}
        	}
        	}
        	puzzle.ay.tayu.setText("" + ale);
        }
	}
}
