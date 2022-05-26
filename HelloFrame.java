/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package helloviewer;

import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ButtonGroup;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

/**
 *
 * @author Aaron
 */
public class HelloFrame extends JFrame{
       private String message;
   private JLabel label;
   
   private static int FRAME_WIDTH = 300;
   private static int FRAME_HEIGHT = 300;
   private static int DEFAULT_SIZE = 20;
   private JRadioButton helloButton;
   private JRadioButton goodbyeButton;
   private JCheckBox cruelCheckBox;
   public HelloFrame() {
      message = "Hello, World!";
      label = new JLabel(message);
      label.setFont(new Font("Serif", Font.PLAIN, DEFAULT_SIZE));
      add(label, BorderLayout.CENTER);
      
      setSize(FRAME_WIDTH, FRAME_HEIGHT);
      helloButton = new JRadioButton("Hello"); 
      goodbyeButton = new JRadioButton("Goodbye");
      
       JPanel southPanel = new JPanel();
       southPanel.add(helloButton);
       southPanel.add(goodbyeButton);
       add(southPanel, BorderLayout.SOUTH);
       
       ButtonGroup group = new ButtonGroup();
       group.add(helloButton);
       group.add(goodbyeButton);
       helloButton.setSelected(true);
       
       ActionListener listener = new MessageListener();
       helloButton.addActionListener(listener);
       goodbyeButton.addActionListener(listener);
       
       cruelCheckBox = new JCheckBox("Cruel");
       cruelCheckBox.addActionListener(listener);
       southPanel.add(cruelCheckBox);
   }
   
    class MessageListener implements ActionListener {

        public void actionPerformed(ActionEvent event) {
            String message = "";
            if (helloButton.isSelected()) {
                message = "Hello,";
            } else if (goodbyeButton.isSelected()) {
                message = "Goodbye,";
            }
            if (cruelCheckBox.isSelected()){
                message = message + " Cruel";
            }
            message = message + " World!";
            label.setText(message);
            label.repaint();
        }
        
    }
}

