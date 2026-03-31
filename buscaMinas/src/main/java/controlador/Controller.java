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

    public Controller(Tablero tab, Tabla t, Death d, List tablero) {
        this.tab = tab;
        this.t = t;
        this.d = d;
        
        crearTablero(t.getjPanel1(), tablero, t, d);
        t.setVisible(true);
    }

    public void crearTablero(JPanel jp, List dim, Tabla tab, Death d){
        int ext = dim.size();
        
        jp.setLayout(new GridLayout(ext,ext));
        for (Object fila : dim) {
            for (Espacio esp : (List<Espacio>)fila) {
                JButton jb = new JButton("-");
                jb.addActionListener(new ActionListener(){
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        System.out.println(esp.toString());
                        comprobar(esp.toString(), tab, d, jb);
                    }
                });
                jp.add(jb);
            }
        }
        tab.pack();
    }
    
    public void comprobar(String bot, Tabla tab, Death d, JButton jb){
        if(bot.equalsIgnoreCase("X")){
            d.setVisible(true);
            tab.setVisible(false);
        }else{
            jb.setText(bot);
        }
    }
}

