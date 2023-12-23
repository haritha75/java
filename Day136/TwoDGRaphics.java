import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class TwoDGRaphics {

  public static void main(String[] args) {
    MyFrame13 frame = new MyFrame13();
    

  }
  
}
class MyFrame13 extends JFrame {

  MyPanel panel;
  MyFrame13() {

    panel = new MyPanel();

    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    this.setSize(500,500);
    this.setLocationRelativeTo(null); //it set the location middle

    this.add(panel);
    this.pack();
    this.setVisible(true);

    
  }
 
}
class MyPanel extends JPanel {
  Image image;

  MyPanel() {
    image = new ImageIcon("logo.png").getImage();

    this.setPreferredSize(new Dimension(500,500));
  }
   public void paint(Graphics g) {
    Graphics2D g2d = (Graphics2D) g;

    g2d.setStroke(new BasicStroke(5)); //to set line dark
    g2d.setPaint(Color.blue);
    //g2d.drawLine(0, 0, 500, 500);
    // g2d.drawRect(0, 0, 100, 200);
    g2d.fillRect(0, 0, 100, 200);
  //  g2d.drawOval(0, 0, 100, 200);
     g2d.fillOval(0, 0, 100, 200);
    // g2d.drawArc(0, 0, 100, 100, 0, 180);
     g2d.fillArc(0, 0, 100, 100, 0, 180);
    // g2d.setPaint(Color.RED);
    // g2d.fillArc(0, 0, 100, 100, 180, 180);
   // int[] xpoint= {150,250,350};
    //int[] ypoint= {300,150,300};
    // g2d.drawPolygon(xpoint,ypoint,3);
       // g2d.fillPolygon(xpoint,ypoint,3);
     
    // g2d.drawString("U are awinner! :D",350,300); //string start 350 px  in x axis and y amix 300   

    g2d.drawImage(image,0,0,null);



    
  }

}