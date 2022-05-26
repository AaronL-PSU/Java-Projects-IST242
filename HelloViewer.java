/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package helloviewer;

import javax.swing.JFrame;

/**
 *
 * @author Aaron
 */
public class HelloViewer {
   public static void main(String[] args) {
      JFrame frame = new HelloFrame();
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      frame.setTitle("HelloViewer");
      frame.setVisible(true);
   }
}
