/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package panelrunner;

/**
 *
 * @author Aaron
 */
import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.Color;
import java.awt.Dimension;
public class PanelRunner
{
   /**
      Creates and displays the application frame.
   */
   public static void main(String[] args) 
   {
      JFrame frame = new JFrame("Color Panels");
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      frame.setSize(1250, 1000);
      JPanel panel = new JPanel();
      panel.setPreferredSize(new Dimension(1000, 500));
      
      JPanel subpanel1 = new JPanel();
      subpanel1.setBackground(Color.RED);
      subpanel1.setPreferredSize(new Dimension(200, 1000));
        panel.add(subpanel1);

      JPanel subpanel2 = new JPanel();
      subpanel2.setBackground(Color.BLUE);
      subpanel2.setPreferredSize(new Dimension(200, 1000));
        panel.add(subpanel2);;
        
      JPanel subpanel3 = new JPanel();
      subpanel3.setBackground(Color.YELLOW);
      subpanel3.setPreferredSize(new Dimension(200, 1000));
          panel.add(subpanel3);
        
      JPanel subpanel4 = new JPanel();
      subpanel4.setBackground(Color.GREEN);
      subpanel4.setPreferredSize(new Dimension(200, 1000));
        panel.add(subpanel4);
        
      JPanel subpanel5 = new JPanel();
      subpanel5.setBackground(Color.ORANGE);
      subpanel5.setPreferredSize(new Dimension(200, 1000));
       panel.add(subpanel5);

       
       frame.add(panel);
      frame.setVisible(true);
   }
}
