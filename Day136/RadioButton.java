import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JRadioButton;

public class RadioButton {

  public static void main(String[] args) {
    MyFrame3 frame = new MyFrame3();
  }
  
}
class MyFrame3 extends JFrame implements ActionListener {
  JRadioButton pizzaButton;
   JRadioButton hamburButton;
   JRadioButton hotdogButton;
   ImageIcon pizzaioc,humburicon,hotdog;
  MyFrame3() {

    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    this.setLayout(new FlowLayout());

    //pizzaioc = new ImageIcon("pizza.jpg");
       // humburiconioc = new ImageIcon("humbur.jpg");
          // hotdogioc = new ImageIcon("hotdog.jpg");



    pizzaButton = new JRadioButton("pizza");
    hamburButton = new JRadioButton("hamburger");
    hotdogButton = new JRadioButton("hotdog");

    ButtonGroup group = new ButtonGroup();
    group.add(pizzaButton);
    group.add(hamburButton);
    group.add(hotdogButton);

    pizzaButton.addActionListener(this);
    hamburButton.addActionListener(this);
    hotdogButton.addActionListener(this);

    // pizzaButton.setIcon(pizzaioc);
    // hamburButton.setIcon(humburicon);
    // hotdogButton.setIcon(hotdog);

    this.add(pizzaButton);
    this.add(hamburButton);
    this.add(hotdogButton);
    this.pack();
    this.setVisible(true);


  }
    @Override 
  public void actionPerformed(ActionEvent e) {


    if(e.getSource() == pizzaButton) {
  
      System.out.println("you ordered pizza!");

    }
    else if(e.getSource() == hamburButton) {
      System.out.println("you ordered hamburger");
    }
    else {
      System.out.println(" you are ordered hot dog");
    }
   
  
  }
}