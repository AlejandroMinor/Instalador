package instalador2021;


import java.awt.Menu;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Aleja
 */
public class Instalador {
    
    
    public void instalar (String programa){
    
    try {
                Process process = Runtime.getRuntime().exec(programa);
            } catch (IOException ex) {
                JOptionPane.showMessageDialog(null, "Error al descomprimir" + ex,"ERROR", JOptionPane.WARNING_MESSAGE);
                //JOptionPane.showMessageDialog(null, "NO SE PUDO INSTALAR"+programa, "ERROR", JOptionPane.PLAIN_MESSAGE);
                Logger.getLogger(Menu.class.getName()).log(Level.SEVERE, null, ex);
                
            }
    }
    
    public void instalarTiempo (String programa,int tiempo){
    int segundos=1000;
        try {
                Process process = Runtime.getRuntime().exec(programa);
                Thread.sleep(segundos*tiempo);                
            } catch (IOException | InterruptedException ex) {
                JOptionPane.showMessageDialog(null, "Error al descomprimir" + ex,"ERROR", JOptionPane.WARNING_MESSAGE);
                Logger.getLogger(Menu.class.getName()).log(Level.SEVERE, null, ex);
                
            }
    }
    
    
}
