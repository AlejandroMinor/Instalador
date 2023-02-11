/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package instalador2021;

import javax.swing.JLabel;

/**
 *
 * @author Alejandro
 */
public class cambioColor {
    
        public void cambiarColorIcono(JLabel nombreElemento) {
        String rutaImg =  nombreElemento.getIcon().toString();
        
        if (rutaImg.contains("B.png")){
        }
        else {
        rutaImg = rutaImg.replace(".png", "B.png");
        
        String nuevaRutaImg = rutaImg.substring(rutaImg.lastIndexOf("img/"  ));
        nuevaRutaImg = nuevaRutaImg.replace("img/", "/img/");
        nombreElemento.setIcon(new javax.swing.ImageIcon(getClass().getResource(nuevaRutaImg))); 
        //JOptionPane.showMessageDialog(null, nuevaRutaImg);
        }
    }
    
    public void RegresarColorIcono(JLabel nombreElemento) {
        String rutaImg =  nombreElemento.getIcon().toString();
        if (rutaImg.contains("B.png")){
        rutaImg = rutaImg.replace("B.png", ".png");
        String nuevaRutaImg = rutaImg.substring(rutaImg.lastIndexOf("img/"  ));
        nuevaRutaImg = nuevaRutaImg.replace("img/", "/img/");
        nombreElemento.setIcon(new javax.swing.ImageIcon(getClass().getResource(nuevaRutaImg)));
        //JOptionPane.showMessageDialog(null, nuevaRutaImg);
        
        }
    }
    
}
