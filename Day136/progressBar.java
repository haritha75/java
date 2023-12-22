import java.awt.Color;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JProgressBar;

public class progressBar {
  public static void main(String[] args) {

    ProgressBarDemo demo = new ProgressBarDemo();
    
  }
  
}
class ProgressBarDemo {

  JFrame frame = new JFrame();
  JProgressBar bar = new JProgressBar(0,500); //min =0 max =500 

  ProgressBarDemo() {

    bar.setValue(0);
    bar.setBounds(0,0,420,50);
    bar.setStringPainted(true); //it set like this 0%
    bar.setFont(new Font("MV Boli",Font.BOLD,20));
    bar.setForeground(Color.RED);
    bar.setBackground(Color.BLACK);

    frame.add(bar);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setSize(420,420);
    frame.setLayout(null);
    frame.setVisible(true); 

    fill();
  }
  public void fill() {

    int counter = 0;

    while(counter<=100) { //whenver progress bar reach 100 it will print done
      bar.setValue(counter);

      try {
         Thread.sleep(50);
      }
      catch(InterruptedException e) {
        e.printStackTrace();
      }
      counter +=1;
     
    }
    bar.setString("Done! :"); //after complete the loop it shows Done! :

  }

}