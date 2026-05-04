/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;
import java.awt.Component;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import modelo.*;
import vista.*;

/**
 *
 * @author Nestor y Asociados
 */
public class Controller {
    private Tablero tab;
    private Tabla t;
    private Death d;
    private List<List> listaBotones;

    public Controller(Tablero tab, Tabla t, Death d, List tablero) {
        this.tab = tab;
        this.t = t;
        this.d = d;
        listaBotones = new ArrayList<>();
        
        crearTablero(t.getjPanel1(), tablero, t, d);
        t.setVisible(true);
    }

    public void crearTablero(JPanel jp, List dim, Tabla tab, Death d){
        int ext = dim.size();
        
        jp.setLayout(new GridLayout(ext,ext));
        for (Object fila : dim) {
            for (Espacio esp : (List<Espacio>)fila) {
//                JButton jb = new JButton("-");
                Boton jb = new Boton(esp);
                jp.add(jb);
            }
        }
        
        List<Component> aux = Arrays.asList(jp.getComponents());
        List<Component> aux2 = new ArrayList<>();
        int cont = 0;
        for (int i = 0; i < aux.size(); i++) {
            
            ((Boton)aux.get(i)).setY(aux2.size());
            ((Boton)aux.get(i)).setX(listaBotones.size());
            
            aux2.add(aux.get(i));
            if(cont < ext){
                cont++;
            }else{
                listaBotones.add(new ArrayList<>(aux2));
                aux2.clear();
                cont = 0;
            }
        }
        //No se les esta asociando el evento.
        for (List llb : listaBotones) {
            for (Object lb : llb) {
                if(lb instanceof Boton){
  //                ((Boton) lb).setIndice(i);
                    Boton b = (Boton) lb;

                    b.addActionListener(new ActionListener(){
                        @Override
                        public void actionPerformed(ActionEvent e) {
                            comprobar(tab, d, b, ext);
                        }
                    });  
                }  
            }
        }
        tab.pack();
    }
    
    public void comprobar(Tabla tab, Death d, Boton jb, int dim){
        String bot = jb.getE().toString();
        if(bot.equalsIgnoreCase("X")){
            d.setVisible(true);
            tab.setVisible(false);
        }else if(bot.equalsIgnoreCase("0")){
            jb.setText(bot);
            compruebaMina(tab, d, jb, dim);
        }else{
            jb.setText(bot);
        }
    }
    
    public void compruebaMina(Tabla tab, Death d, Boton jb, int dim){
        int x = jb.getX();
        int y = jb.getY();
        System.out.println("X: "+ x);
        System.out.println("Y: "+ y);
        for (int i = -1; i <= 1; i++) {
            for (int j = -1 ; j <= 1; j++) {
                try{
                    if(i != 0 && j != 0){
                        Boton jbl = (Boton) listaBotones.get(x+i).get(y+j);
                        if(jbl.getText().equalsIgnoreCase("-")){
                            comprobar(tab, d, jbl, dim);  
                        }
                        
                    }
                }catch(IndexOutOfBoundsException e){
                }
            }
        }
    }
}

