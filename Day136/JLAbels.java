import java.awt.Color;
import java.awt.Font;

import javax.swing.*;
import javax.swing.border.Border;


public class JLAbels {

  public static void main(String[] args) {
    
    JLabel label = new JLabel();
    label.setText("Enter Your Name:");

    ImageIcon img = new ImageIcon("Label.jpeg");
    label.setIcon(img);

    Border border = BorderFactory.createLineBorder(Color.green,3);

    label.setHorizontalTextPosition(JLabel.CENTER);
    label.setVerticalTextPosition(JLabel.TOP);
    label.setForeground(new Color(0x00FFF00));
    label.setFont(new Font("MV Boli",Font.ITALIC,20));
    label.setIconTextGap(10);
    label.setBackground(Color.black);
    label.setOpaque(true);
    label.setBorder(border);
    label.setVerticalAlignment(JLabel.CENTER);
    label.setHorizontalAlignment(JLabel.CENTER);
    // label.setBounds(0,0,250,250); //set x,y position within frame as well as dimensions
    



    JFrame frame = new JFrame();
    frame.setVisible(true);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setSize(420,420);
    // frame.setResizable(false);
    frame.add(label);
    // frame.setLayout(null);
    frame.pack(); //it set the layout based on the content that means required layout created

  }
  
}
