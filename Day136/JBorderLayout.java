import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class JBorderLayout {

  public static void main(String[] args) {
    

    //  layoout manager = defines the natural layout for components within a container

  JFrame frame = new JFrame();

  frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
  frame.setVisible(true);
  frame.setSize(500,500);
  frame.setLayout(new BorderLayout(10,10)); //10 px of margin height and width

  JPanel panel1 = new JPanel();
  JPanel panel2 = new JPanel();
  JPanel panel3 = new JPanel();
  JPanel panel4 = new JPanel();
  JPanel panel5 = new JPanel();
  JPanel panel6 = new JPanel();
  JPanel panel7 = new JPanel();


  panel1.setBackground(Color.red);
  panel2.setBackground(Color.green);
  panel3.setBackground(Color.yellow);
  panel4.setBackground(Color.magenta);
  panel5.setBackground(Color.blue);
  panel6.setBackground(Color.black);
  panel7.setBackground(Color.PINK);
  panel5.setLayout(new BorderLayout());

  panel1.setPreferredSize(new Dimension(100,100));
  panel2.setPreferredSize(new Dimension(100,100));
  panel3.setPreferredSize(new Dimension(100,100));
  panel4.setPreferredSize(new Dimension(100,100));
  panel5.setPreferredSize(new Dimension(100,100));
  panel6.setPreferredSize(new Dimension(30,30));
  panel7.setPreferredSize(new Dimension(30,30));


  frame.add(panel1,BorderLayout.NORTH);
  frame.add(panel2,BorderLayout.WEST);
  frame.add(panel3,BorderLayout.EAST);
  frame.add(panel4,BorderLayout.SOUTH);
  frame.add(panel5,BorderLayout.CENTER);

  panel5.add(panel6,BorderLayout.NORTH);
  panel5.add(panel7,BorderLayout.SOUTH);




  }

 
  
  
}
