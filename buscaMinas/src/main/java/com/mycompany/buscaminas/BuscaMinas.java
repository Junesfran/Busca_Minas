/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.buscaminas;

import controlador.Controller;
import java.util.List;
import modelo.Tablero;
import vista.Death;
import vista.Tabla;
import vista.Vista;

/**
 *
 * @author Nestor y Asociados
 */
public class BuscaMinas {

    public static void main(String[] args) {
        
        Tablero t = new Tablero();
        List lista = t.MontarTablero(10, 10);
        
        Vista v = new Vista();
        Death d = new Death();
        Tabla ta = new Tabla();
        
        
        Controller c = new Controller(lista, v, ta, d);
    } 
}
