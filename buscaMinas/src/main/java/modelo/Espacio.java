/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

import java.util.Map;
import java.util.HashMap;

/**
 *
 * @author Nestor y Asociados
 */
public class Espacio {
    private boolean mina;
    private int numMinas;

    public Espacio() {
        this.mina = false;
    }
    
    public void colocarMina(){
        this.mina = true;
    }
    
    public void minaCerca(){
        //direcciones.put(posicion, true);
        numMinas++;
    }

    @Override
    public String toString() {
        String aux = "";
        
        if(mina){
            aux = "X";
        }else{
            aux = numMinas+"";
        }
        
        return aux;
    }
    
    
}
