import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JComboBox;
import javax.swing.JFrame;

public class ComboBox {

  public static void main(String[] args) {
    MyFrame4 frame4 = new MyFrame4();
    
  }
  
}
class MyFrame4 extends JFrame implements ActionListener {
 
  JComboBox comboBox; 
  MyFrame4() {

    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    this.setLayout(new FlowLayout());

    String animals[] = {"dog","cat","bird"};
  
    comboBox = new JComboBox(animals);
    comboBox.addActionListener(this);

    // comboBox.setEditable(true); //we can type the text in the drop down manu
    // System.out.println(comboBox.getItemCount()); //it print number of items
    // comboBox.addItem("horse"); // it add item to the combox
    // comboBox.insertItemAt("pig", 0); 
    // comboBox.setSelectedIndex(0);
    // comboBox.removeItem("cat");
    // comboBox.removeItemAt(1);
    // comboBox.removeAll(); //it clear all the items in combobox
    
    // use wrapper classes in array type


    this.add(comboBox);
    this.pack();
    this.setVisible(true);


  }
    @Override 
  public void actionPerformed(ActionEvent e) {


     if(e.getSource() ==comboBox ) {

     System.out.println(comboBox.getSelectedItem());
     System.out.println(comboBox.getSelectedIndex());
  
  }
}

}