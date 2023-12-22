import java.awt.*;

import javax.swing.ImageIcon;
import javax.swing.JFrame;

public class MyFrame extends JFrame {

 MyFrame() {

  this.setVisible(true);
  this.setSize(420,420);
  this.setTitle("JFrame");
  this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
  this.setResizable(false);
  this.getContentPane().setBackground(new Color(123,50,250));
  
ImageIcon image = new ImageIcon("logo.png");
 this.setIconImage(image.getImage());

 }
}