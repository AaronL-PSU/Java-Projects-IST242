/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package panelrunner1.pkg2;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author Aaron
 */
public class PanelRunner12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     JFrame frame = new JFrame("Color Panels");
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      frame.setSize(1250, 1000);
      JPanel panel = new JPanel();
      panel.setLayout(new GridLayout(3,2));
      panel.setPreferredSize(new Dimension(1000, 500));
      
      JPanel subpanel1 = new JPanel();
      subpanel1.setBackground(Color.RED);
      subpanel1.setPreferredSize(new Dimension(200, 200));


      JPanel subpanel2 = new JPanel();
      subpanel2.setBackground(Color.WHITE);
      subpanel2.setPreferredSize(new Dimension(200, 200));

        
      JPanel subpanel3 = new JPanel();
      subpanel3.setBackground(Color.BLUE);
      subpanel3.setPreferredSize(new Dimension(200, 200));

        
      JPanel subpanel4 = new JPanel();
      subpanel4.setBackground(Color.GREEN);
      subpanel4.setPreferredSize(new Dimension(200, 200));

        
      JPanel subpanel5 = new JPanel();
      subpanel5.setBackground(Color.YELLOW);
      subpanel5.setPreferredSize(new Dimension(200, 200));
      
       JPanel subpanel6 = new JPanel();
      subpanel6.setBackground(Color.ORANGE);
      subpanel6.setPreferredSize(new Dimension(200, 200));

      panel.add(subpanel1);
      panel.add(subpanel2);
      panel.add(subpanel3);
      panel.add(subpanel4);
      panel.add(subpanel5);
      panel.add(subpanel6);

       
       frame.add(panel);
      frame.setVisible(true);
   }
}
