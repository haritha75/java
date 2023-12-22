import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class MyFrameEx extends JFrame implements ActionListener{

  JButton button;
  JLabel label;

  MyFrameEx() {

 
    ImageIcon img = new ImageIcon("finger.jpg");
    ImageIcon img1 = new ImageIcon("Label.jpeg");

    label = new JLabel();
    label.setIcon(img1);
    label.setBounds(250,250,150,150);
    label.setVisible(false);



    button = new JButton();
    button.setBounds(100,100,250,100);   
    button.setText("I am button");
    button.setFocusable(false);
    button.setIcon(img);
    button.setHorizontalTextPosition(JButton.CENTER);
    button.setVerticalTextPosition(JButton.BOTTOM);
    button.setFont(new Font("Comic Sans",Font.BOLD,25));
    button.setIconTextGap(-15);
    button.setBackground(Color.lightGray);
    button.setForeground(Color.cyan);
    button.setBorder(BorderFactory.createEtchedBorder());
   
    
    button.addActionListener(this);
    // button.addActionListener(e -> System.out.println("poo"));

    this.setVisible(true);
    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    this.setSize(500,500);
    this.setLayout(null);
    this.add(button);
    this.add(label);


  }
  @Override 
  public void actionPerformed(ActionEvent e) {

    if(e.getSource() ==  button) {

      System.out.println("poo");
      // button.setEnabled(false);
      label.setVisible(true);


    }
     
  }

}