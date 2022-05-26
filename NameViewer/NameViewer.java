package nameviewer;

import javax.swing.JComponent;
import javax.swing.JFrame;
public class NameViewer {

    public static void main(String[] args) {
     JFrame frame = new JFrame();

      frame.setSize(400, 500);
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

      JComponent component = new NameComponent();
      frame.add(component);

      frame.setVisible(true);
    }
    
}
