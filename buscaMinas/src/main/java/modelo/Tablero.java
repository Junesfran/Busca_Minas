/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

import java.util.ArrayList;
import java.util.List;

public class Tablero {

    private List<List> tabla;

    public Tablero() {
        tabla = new ArrayList<>();
    }
//    public Tablero(int dimensiones, int numeroMinas) {
//        tabla = new ArrayList<>();
//
//        for (int i = 0; i < dimensiones; i++) {
//            List<Espacio> fila = new ArrayList<Espacio>();
//            for (int j = 0; j < dimensiones; j++) {
//                fila.add(new Espacio());
//            }
//            tabla.add(fila);
//        }
//        posicionMinas(dimensiones, numeroMinas);
//    }
    
    public List MontarTablero(int dimensiones, int numeroMinas){
        for (int i = 0; i < dimensiones; i++) {
            List<Espacio> fila = new ArrayList<Espacio>();
            for (int j = 0; j < dimensiones; j++) {
                fila.add(new Espacio());
            }
            tabla.add(fila);
        }
        posicionMinas(dimensiones, numeroMinas);
        
        return tabla;
    }

    private void posicionMinas(int dim, int numMinas){
        for (int i = 0; i < numMinas; i++) {
            int x = (int)(Math.random() * dim);
            int y = (int)(Math.random() * dim);
            
            Espacio e = (Espacio) tabla.get(x).get(y);
            e.colocarMina();
            sumarMinas(x,y);
        }
    }
    
    private void sumarMinas(int x, int y){
        ((Espacio) tabla.get(x).get(y)).minaCerca();
        for (int i = -1; i <= 1; i++) {
            for (int j = -1; j <= 1; j++) {
                try{
                    ((Espacio) tabla.get(x+i).get(y+j)).minaCerca();
                }catch(IndexOutOfBoundsException e){
                    
                }
            }
        }
        
    }
    
    @Override
    public String toString() {
        String aux = "";
        for (List list : tabla) {
            for (Object object : list) {
                aux += object.toString() +", ";
            }
            aux += "\n";
        }
        return aux;
    }
}
