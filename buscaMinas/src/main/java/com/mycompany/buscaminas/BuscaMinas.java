/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.buscaminas;

import controlador.Controller;
import java.util.List;
import modelo.Tablero;
import vista.Tabla;

/**
 *
 * @author Nestor y Asociados
 */
public class BuscaMinas {

    public static void main(String[] args) {
        
        Tablero t = new Tablero();
        Tabla ta = new Tabla();
        
        List lista = t.MontarTablero(10, 10);
        ta.crearTabla(lista);
        Controller c = new Controller(t,ta);
    }
}
