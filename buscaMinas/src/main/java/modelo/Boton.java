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
    private int x;
    private int y;

    public Boton(Espacio e) {
        super("-");
        this.e = e;
    }

    public Espacio getE() {
        return e;
    }

    public void setE(Espacio e) {
        this.e = e;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    @Override
    public String toString() {
        return "Boton{" + "e=" + e + ", x=" + x + ", y=" + y + '}';
    }

    
    
}
