import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class OpenNewGUIWINDOW {

  public static void main(String[] args) {
    LunchPage lunchPage = new LunchPage();

  }
  
}
class LunchPage implements ActionListener {

  JFrame frame = new JFrame();
  JButton button = new JButton("Button");

  LunchPage() {

    button.setBounds(100,160,300,40);
    button.setFocusable(false);
    button.addActionListener(this);
    

    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setSize(420,420);
    frame.setLayout(null);
    frame.add(button);

    frame.setVisible(true);
  }

  @Override 
  public void actionPerformed(ActionEvent e) {

   if(e.getSource() == button) {
    frame.dispose(); //whenver new window open previous frame will be closed.
    NewWindow mywindow = new NewWindow();

   }
  }

}

class NewWindow {

  JFrame frame = new JFrame();
  JLabel label = new JLabel("Hello!");
  NewWindow() {

    label.setBounds(0,0,100,50);
    label.setFont(new Font(null,Font.PLAIN,25));
   

    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setSize(420,420);
     frame.add(label);
    frame.setLayout(null);
    frame.setVisible(true);


  }
}