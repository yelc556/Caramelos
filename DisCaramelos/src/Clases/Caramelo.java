
package Clases;

import javax.swing.JOptionPane;

/**
 *
 * @yelc556
 */
public class Caramelo {
    float total=0;

    public Caramelo() {
    }
    
    public float getTotal(){
        return total;
    }
    
    public void setTotal(float moneda){
 			total=total+moneda;
                       
    }

    public void Comprar_Caramelo(){
             if (total>=1.5)
             total=total-(float)1.5;
    }   
    
    public void Vuelto(){
        
        if (total!=0){
        JOptionPane opcion = new JOptionPane();
           opcion.showMessageDialog(null,"Su vuelto es:"+ this.getTotal());
           System.exit(0);
        }
        else
            System.exit(0);
    }
}
