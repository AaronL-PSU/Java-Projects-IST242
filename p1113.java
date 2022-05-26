/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package p11.pkg3;

import javax.swing.JFrame;

/**
 *
 * @author Aaron
 */
public class P113 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        JFrame frame = new ColorFrame();
        frame.setSize(500, 500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("ColorViewer");
        frame.setVisible(true);
    }
    
}
