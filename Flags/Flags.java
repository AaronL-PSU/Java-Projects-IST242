package flags;

import javax.swing.JComponent;
import javax.swing.JFrame;

public class Flags
{
   public static void main(String[] args)
   {
      JFrame frame = new JFrame();

      frame.setSize(400, 500);
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

      JComponent component = new FlagComponentG();
      frame.add(component);

      frame.setVisible(true);
   }
}