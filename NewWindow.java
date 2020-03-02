 import java.awt.*;
import javax.swing.*;

public class TopLevelWindow() {
  private static void createwindow() {
    Jframe frame = new Jframe("Simple GUI");
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    JLabel testLabel = new Jlabel("ready to start",SwingConstats.CENTER);
    textLabel.setPreferredSize(new Dimension(300,100;
    frame.getcontentPane().add(textLabel, BorderLayout.CENTER);
    
    frame.setLocationRelativeTo(null);
    frame.pack();
    frame.setVisible(true);
  }
  public static void main(String[] args) {
    createWindow();
  }
}
