/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

import javax.swing.JButton;

/**
 *
 * @author Nestor y Asociados
 */
public class Boton extends JButton{

    private Espacio e;
    
    public Boton(Espacio e){
        super("-");
        this.e = e;
    }

    public Espacio getE() {
        return e;
    }

    public void setE(Espacio e) {
        this.e = e;
    }
    
    
}
