/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package p11.pkg3;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

/**
 *
 * @author Aaron
 */
public class ColorFrame extends JFrame{
   private JRadioButton redButton;
   private JRadioButton greenButton;
   private JRadioButton blueButton;
   private JPanel colorPanel;
   
   public ColorFrame(){
       
     redButton = new JRadioButton("Red"); 
     greenButton = new JRadioButton("Green");
     blueButton = new JRadioButton("Blue");
     
       JPanel southPanel = new JPanel();
       southPanel.add(redButton);
       southPanel.add(greenButton);
       southPanel.add(blueButton);
       add(southPanel, BorderLayout.SOUTH);
       
       
        JPanel colorPanel = new JPanel();
        add(colorPanel, BorderLayout.CENTER);  

              ActionListener listener = new ColorListener();
              redButton.addActionListener(listener);
              greenButton.addActionListener(listener);
              blueButton.addActionListener(listener);
              
                     ButtonGroup group = new ButtonGroup();
                     group.add(redButton);
                     group.add(greenButton);
                     group.add(blueButton);
                     redButton.setSelected(true);
}
    class ColorListener implements ActionListener {

        public void actionPerformed(ActionEvent event) {
            if (redButton.isSelected()) {
             colorPanel.setBackground(Color.RED);
            } else if (greenButton.isSelected()) {
               colorPanel.setBackground(Color.GREEN);
            }
            else if (blueButton.isSelected()) {
                colorPanel.setBackground(Color.BLUE);
            }
        }

    }
}
