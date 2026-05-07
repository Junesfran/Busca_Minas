/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;
import javax.swing.JButton;
import javax.swing.JPanel;
import modelo.*;
import vista.*;
/**
 *
 * @author Nestor y Asociados
 */
public class Controller {
    
    private List lista;
    private Vista v;
    private Tabla t;
    private Death d;
    
    public Controller(List lista, Vista v, Tabla t, Death d){
        this.lista = lista;
        this.v = v;
        this.t = t;
        this.d = d;
        
        insertarTablero(lista);
        chuleta(lista);
    }
    
    private void insertarTablero(List lista){
        int dimen = lista.size();
        
        t.setLayout(new GridLayout(dimen, dimen));
        for (Object fila : lista) {
            for (Espacio e : (List<Espacio>)fila) {
                Boton jb = new Boton(e);
                jb.addActionListener(new ActionListener(){
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        desvelar(jb);
                    }
                }); 
                t.add(jb);
            }
        }
        
        this.t.setVisible(true);
        //Reajustar el tamaño
        this.t.pack();
    }
    
    private void desvelar(Boton jb){
        String b = jb.getE().toString();
        
        if(jb.getText().equalsIgnoreCase("-")){
            if(b.equalsIgnoreCase("X")){
                d.setVisible(true);
                t.setVisible(false);
            }else{
                jb.setText(b.toString());
            }
        }
    }
    
    private void chuleta(List lista){
        for (Object object : lista) {
            v.mostrarTexto(object.toString());
        }
    }
    
}
