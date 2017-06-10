package Clases;
import javax.swing.JProgressBar;
/**
 *
 * @yelc
 */
public class TiempoEspera  extends Thread{
    JProgressBar  progreso;
    public TiempoEspera(JProgressBar  progreso){
        super();
        this.progreso=progreso;
    }
            
    public void run(){
        for(int i=0;i<=100;i++){
            progreso.setValue(i);
            pausa(30);
        }  
    }
    
    public void pausa(int mlseg){
    try{
        Thread.sleep(mlseg);
    }catch (Exception e){
    
    }
    }
}
