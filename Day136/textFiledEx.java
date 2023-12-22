import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

public class textFiledEx {

  public static void main(String[] args) {
    
    // it is used to add,set or get text

    MyFrame2 frame = new MyFrame2();
  }
  
}

class MyFrame2 extends JFrame implements ActionListener {
JTextField textField ;
JButton button ;
  MyFrame2() {

    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    this.setLayout(new FlowLayout());

     textField = new JTextField();
     textField.setPreferredSize(new Dimension(250,40));
     textField.setFont(new Font("Consolals",Font.PLAIN,35));
     textField.setForeground(Color.ORANGE);
     textField.setBackground(Color.black);
     textField.setText("UserName");
     //textField.setEditable(false); //default text will not remove

     button = new JButton("submit");
     button.addActionListener(this);

     this.add(button);

    this.add(textField);
    this.pack();
    this.setVisible(true);

  }
   @Override 
  public void actionPerformed(ActionEvent e) {

   if(e.getSource()== button) {
      System.out.println( textField.getText());
      button.setEnabled(false);
      textField.setEditable(false);

   }
  }
}