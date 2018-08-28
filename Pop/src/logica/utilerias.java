/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logica;

import javax.swing.ImageIcon;
import javax.swing.JInternalFrame;

/**
 *
 * @author Carba
 */
public class utilerias {
    
    public void icono(JInternalFrame frame, String ruta){ //le pone un ícono al JInternalFrame
        frame.setFrameIcon(new ImageIcon(ruta));
    }
}
