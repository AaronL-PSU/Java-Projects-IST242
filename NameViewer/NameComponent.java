/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nameviewer;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import javax.swing.JComponent;

/**
 *
 * @author Aaron
 */
public class NameComponent extends JComponent{
      public void paintComponent(Graphics g)
   {
      g.setColor(Color.BLUE);
      g.fillRect(100, 100, 150, 75);
      g.setColor(Color.RED);
      Font currentFont = g.getFont();
      Font newFont = currentFont.deriveFont(currentFont.getSize()*3F);
      g.setFont(newFont);
      g.drawString("Aaron", 125, 150);

      
   }
}
