/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen2;

import javax.swing.JButton;

public class Cuadro extends JButton {
    
    private boolean Mina;
    public Cuadro(){
        
        super();
        double random = Math.random();
        if (random>0.9)
            Mina=true;
        else
            Mina=false;
    }
    public boolean EstaMinado(){
            
        return Mina;
    }
}
    
