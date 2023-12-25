import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JColorChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Colorchooser {

  public static void main(String[] args) {
    MyFrame8 frame = new MyFrame8();
    
  }
  
}
class MyFrame8  extends JFrame implements ActionListener {

  JButton button;
  JLabel label;
  MyFrame8() {

    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    this.setLayout(new FlowLayout());

    button = new JButton("pick a color");
    button.addActionListener(this);

    label = new JLabel();
    label.setBackground(Color.white); //here we are setting background color
    label.setOpaque(true); //to display backgound color we can this one
    label.setText("This is Text");
    label.setFont(new Font("MV Boli",Font.ITALIC,100));

    this.add(button);
    this.add(label);
    this.pack();
    this.setVisible(true);

  }
  @Override
  public void actionPerformed(ActionEvent e) {

    if(e.getSource() == button) {
      JColorChooser colorChooser = new JColorChooser();

      Color color = JColorChooser.showDialog(null, "pic a color....", Color.BLACK);
      label.setForeground(color);
    } 

  }
}