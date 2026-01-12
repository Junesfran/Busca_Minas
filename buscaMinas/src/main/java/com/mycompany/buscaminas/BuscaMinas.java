/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.buscaminas;

import controlador.Controller;
import modelo.Tablero;

/**
 *
 * @author Nestor y Asociados
 */
public class BuscaMinas {

    public static void main(String[] args) {
        Tablero t = new Tablero(4,3);
        
        Controller c = new Controller(t);
    }
}
