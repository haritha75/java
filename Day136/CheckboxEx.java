import java.awt.*;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class CheckboxEx {
  public static void main(String[] args) {
    MyFrame1 frame = new MyFrame1();
  }
  
}
class MyFrame1 extends JFrame implements ActionListener {
  JButton button;
  JCheckBox checkBox;
  ImageIcon icon1;
  ImageIcon icon2;
  MyFrame1() {

    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    this.setLayout(new FlowLayout());

    icon1 = new ImageIcon("Finger.jpg");
    icon2 = new ImageIcon("logo.png");

    button = new JButton();
    button.setText("submit");
    button.addActionListener(this);

    checkBox = new JCheckBox();
    checkBox.setText("I am not a roboot");
    checkBox.setFocusable(false);
    checkBox.setFont(new Font("Consolas",Font.PLAIN,35));
    checkBox.setIcon(icon1);
    checkBox.setSelectedIcon(icon2); //whenever select icon it will appear


    this.add(checkBox);
    this.add(button);
    this.pack();
    this.setVisible(true);


  }
    @Override 
  public void actionPerformed(ActionEvent e) {

    if(e.getSource() == button) {
      System.out.println(checkBox.isSelected());

    }

  
  }
}