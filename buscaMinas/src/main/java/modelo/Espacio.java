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
    private Map<String, Boolean> direcciones;
    private boolean mina;
    private int numMinas;

    public Espacio() {
        direcciones = new HashMap<String, Boolean>();
        this.mina = false;
        minasIniciales();
    }
    
    private void minasIniciales(){
        direcciones.put("Izquierda", false);
        direcciones.put("Derecha", false);
        direcciones.put("Arriba", false);
        direcciones.put("Abajo", false);
        
        //Diagonales
        direcciones.put("ArribaIzq", false);
        direcciones.put("ArribaDer", false);
        direcciones.put("AbajoIzq", false);
        direcciones.put("AbajoDer", false);
    }
    
    public void colocarMina(){
        this.mina = true;
    }
    
    public void minaCerca(String posicion){
        direcciones.put(posicion, true);
        numMinas++;
    }

    @Override
    public String toString() {
        String aux = "";
        
        if(mina){
            aux = 1+"";
        }else{
            aux = 0+"";
        }
        return aux;
    }
    
    
}
