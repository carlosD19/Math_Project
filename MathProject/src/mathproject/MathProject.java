/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mathproject;

import javax.swing.JFrame;

/**
 *
 * @author pc
 */
public class MathProject {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       View view = new View();
       view.setLocationRelativeTo(null);
       view.setVisible(true);
       view.setExtendedState(JFrame.MAXIMIZED_BOTH);
    }
    
}
