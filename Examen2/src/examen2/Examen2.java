
package examen2;

import javax.swing.JOptionPane;

public class Examen2 {

   
    public static void main(String[] args) {
        
        JOptionPane.showMessageDialog(null,"NO QUITES NINGUNA PESTAÑA!!");
        JOptionPane.showMessageDialog(null,"ACOMODA LAS PESTAÑAS ANTES DE COMENZAR");
        JOptionPane.showMessageDialog(null,"LOS DATOS DEL JUEGO SE PERDERAN CUANDO SE CIERREN LAS PESTAÑAS");

        
        Tabla1 T=new Tabla1();
        T.setVisible(true);
    
        Ventanap V =new Ventanap();
        
        V.setVisible(true);
        
        
    }
    
}
