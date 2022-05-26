package buttonviewer1;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JFrame;

public class ButtonFrame extends JFrame {
    private JLabel label;
    private JButton button;
   
    public ButtonFrame() {
        createComponents();
        setSize(400,400);
    }
   
    private void createComponents() {
        label = new JLabel("Hello, World!", JLabel.CENTER);
        button = new JButton("Click here!");
        JPanel panel = new JPanel();
       
        panel.add(label);
        panel.add(button);
       
        add(panel);
       
        ActionListener listener = new ClickListener();
        button.addActionListener(listener);
    }
   
 
       class ClickListener implements ActionListener {
           public void actionPerformed(ActionEvent event) {
               label.setText("Date: " + new java.util.Date());
           }
  }
}
