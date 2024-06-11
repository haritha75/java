//import java.awt.Color;
//import java.awt.event.MouseEvent;
//import java.awt.event.MouseListener;
//
//import javax.swing.JFrame;
//import javax.swing.JLabel;
//
//public class MouseListenerEX {
//
//  public static void main(String[] args) {
//    MyFrame11 frame = new MyFrame11();
//
//  }
//
//}
//
//class MyFrame11 extends JFrame implements MouseListener{
//
//  JLabel label;
//   MyFrame11() {
//
//    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//    this.setSize(500,500);
//    this.setLayout(null);
//
//    label = new JLabel();
//    label.setBounds(0,0,100,100);
//    label.setBackground(Color.RED);
//    label.setOpaque(true);
//    label.addMouseListener(this);
//
//    this.add(label);
//    this.setVisible(true);
//  }
//  @Override
//
//  public void mouseClicked(MouseEvent e) {
//
//    // mouse button cliked or pressed on a compoenent
//    System.out.println("you clicked the mouse");
//
//    label.setBackground(Color.yellow);
//
//  }
//
//  public void mousePressed(MouseEvent e) {
//
//    // mouse button has been pressed on a component
//     System.out.println("you presssed the mouse");
//     label.setBackground(Color.blue);
//
//
//
//  }
//  public void mouseRelease(MouseEvent e) {
//
//        // invoked when the mouse button has been rlease on a compoenent
//         System.out.println("you released the mouse");
//         label.setBackground(Color.black);
//
//
//  }
//  public void mouseEntered(MouseEvent e) {
//
//    // invoked when the mouse enter a component
//     System.out.println("you entered component from mouse");
//     label.setBackground(Color.pink);
//
//  }
//  public void mouseExited(MouseEvent e) {
//    // it is used invoked when mouse exits a component
//         System.out.println("you exist from the label");
//         label.setBackground(Color.gray);
//
//
//  }
//
//}
