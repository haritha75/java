import javax.swing.JFrame;
import javax.swing.JLabel;

import java.awt.Color;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class KeyListenerExample {

  public static void main(String[] args) {

    MyFrame9 frame = new MyFrame9();
    
  }
  
}

class MyFrame9 extends JFrame implements  KeyListener {

  JLabel label;
  MyFrame9() {

    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    this.setSize(500,500);
    this.setLayout(null);
    this.addKeyListener(this);


    label = new JLabel();
    label.setBounds(0,0,100,100);
    label.setBackground(Color.RED);
    label.setOpaque(true);

    this.add(label);
    this.setVisible(true);
  }
  @Override
  public void keyTyped(KeyEvent e) {

//    it used when key is typed, uses key char, char output
     switch(e.getKeyChar()) {
      case 'a':
         label.setLocation(label.getX()-10,label.getY()); //left
         break;

       case 'w':
         label.setLocation(label.getX(),label.getY()-10); //up
         break;   
       case 's':
         label.setLocation(label.getX(),label.getY()+10); //down
         break;    

       case 'd':
         label.setLocation(label.getX()+10,label.getY()); //right
         break;   

     }


  }
@Override
  public void keyPressed(KeyEvent e) {

//    invoked when a physical key is pressed down, uses keycode, int output

      switch(e.getKeyCode()) {
      case 37:
         label.setLocation(label.getX()-10,label.getY()); 
         break;

       case 38:
         label.setLocation(label.getX(),label.getY()-10); 
         break;   
       case 39:
         label.setLocation(label.getX()+10,label.getY()); 
         break;    

       case 40:
         label.setLocation(label.getX(),label.getY()+10); 
         break;   

     }
}
@Override

  public void keyReleased(KeyEvent e) {

//    called whenever a button is released

  System.out.println("Your released key char:" +e.getKeyChar());
    System.out.println("Your released key char:" +e.getKeyCode());

}

}