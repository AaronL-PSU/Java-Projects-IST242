package flags;

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JComponent;

public class FlagComponentG extends JComponent
{
   public void paintComponent(Graphics g)
   {
      g.setColor(Color.BLACK);
      g.fillRect(100, 100, 150, 30);
      g.setColor(Color.RED);
      g.fillRect(100, 130, 150, 30);
      g.setColor(Color.YELLOW);
      g.fillRect(100, 160, 150, 30);
      
      g.setColor(Color.RED);
      g.fillRect(100, 220, 150, 30);
      g.setColor(Color.WHITE);
      g.fillRect(100, 250, 150, 30);
      g.setColor(Color.GREEN);
      g.fillRect(100, 280, 150, 30);
   }
}

