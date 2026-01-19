/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;
import modelo.*;
import vista.*;

/**
 *
 * @author Nestor y Asociados
 */
public class Controller {
    private Tablero tab;
    private Tabla t;

    public Controller(Tablero tab, Tabla t) {
        this.tab = tab;
        this.t = t;
        t.setVisible(true);
    }
    
    
    
}
