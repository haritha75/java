//import java.awt.*;
//import java.awt.event.ActionEvent;
//import java.awt.event.ActionListener;
//import java.util.Timer;
//import javax.swing.*;
//import java.awt.event.*;
//
//public class TwoDAnimation {
//  public static void main(String[] args) {
//    MyPanel1 panel = new MyPanel1();
//  }
//
//}
//
//class MyFrame14 extends JFrame {
//
//   MyPanel1 panel;
//  MyFrame14() {
//
//    panel = new MyPanel1();
//
//    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//    this.setSize(500,500);
//    this.setLocationRelativeTo(null); //it set the location paint middle
//
//    this.add(panel);
//    this.pack();
//    this.setVisible(true);
//
//
//  }
//
//}
//class MyPanel1 extends JPanel implements ActionListener {
//
//  final int PANEL_WIDTH = 500;
//  final int PANEL_HEIGHT = 500;
//  Image img1,img2;
//  Timer timer;
//  int xVelocity = 1,yVelocity=1,x=0,y=0;
//
//  MyPanel1() {
//
//    this.setPreferredSize(new Dimension(PANEL_WIDTH,PANEL_HEIGHT));
//    this.setBackground(Color.black);
//    img1 = new ImageIcon("finger.jpg").getImage();
//    img2  = new ImageIcon("logo.png").getImage();
//    timer = new javax.swing.Timer(10,this); //it delay 10milliseconds
//    timer.start();
//
//  }
//  public void paint(Graphics g) {
//    super.paint(g); //paint background
//    Graphics g2d = (Graphics2D) g;
//
//
//    g2d.drawImage(img2,0,0,null);
//    g2d.drawImage(img1,x,y,null);
//
//  }
//
//
//public void actionPerformed(ActionEvent e) {
//
//   if(x>=PANEL_WIDTH - img1.getWidth(null) ||  x<0) { //whenever that img pointing to the panel width it return back based width
//     xVelocity = xVelocity  * -1;
//   }
//   x= x+xVelocity;
//   repaint();
//
//  if(y>=PANEL_HEIGHT - img1.getHeight(null) ||  y<0) { //whenever that img pointing to the panel width it return back based on the height
//    yVelocity = yVelocity  * -1;
//  }
//  y= y+yVelocity;
//  repaint();
//
//}
//
//
//}