import java.awt.BorderLayout;
import java.awt.Color;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class JavaPanels {

  public static void main(String[] args) {

    ImageIcon img = new ImageIcon("Label.jpeg");
    

    JLabel label = new JLabel();
    label.setText("Hi");
    label.setIcon(img);
    label.setVerticalAlignment(JLabel.BOTTOM);
    label.setHorizontalAlignment(JLabel.RIGHT);

    label.setBounds(0,0,75,75);

    JPanel redPanel = new JPanel(); //we can add panel to the frame
    redPanel.setBackground(Color.RED);
    redPanel.setBounds(0,0,250,250);

    JPanel bluePanel = new JPanel(); //we can add panel to the frame
    bluePanel.setBackground(Color.blue);
    bluePanel.setBounds(250,0,250,250);

    JPanel greenPanel = new JPanel(); //we can add panel to the frame
    greenPanel.setBackground(Color.green);
    greenPanel.setBounds(0,250,500,250);

    // greenPanel.setLayout(new BorderLayout());
    greenPanel.setLayout(null);

    
    JFrame frame = new JFrame();
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setLayout(null);
    frame.setSize(750,750);
    frame.setVisible(true);
    greenPanel.add(label);
    frame.add(redPanel);
    frame.add(bluePanel);
    frame.add(greenPanel);
  }
  
}
