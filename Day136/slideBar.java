import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSlider;
import javax.swing.SwingConstants;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class slideBar {

  public static void main(String[] args) {

    sliderDemo demo = new sliderDemo();
    
  }
  
}
class sliderDemo extends JFrame implements ChangeListener {
  
  JFrame frame;
  JPanel panel;
  JLabel label;
  JSlider slider;
  sliderDemo() {

   frame = new JFrame("Slider demo");
   panel = new JPanel();
   label = new JLabel();
   slider = new JSlider(0,100,50); //slider rang 0 100 it start with 50


  slider.setPreferredSize(new Dimension(400,200)); //width and height
  slider.setPaintTicks(true);
  slider.setMinorTickSpacing(10);

  slider.setPaintTrack(true);
  slider.setMajorTickSpacing(25);

  slider.setPaintLabels(true); // to set values
  slider.setFont(new Font("MV Boli",Font.BOLD,15));

  label.setFont(new Font("MV Boli",Font.BOLD,20));

  slider.setOrientation(SwingConstants.VERTICAL);
  
    label.setText("°C = "+slider.getValue());
    slider.addChangeListener(this);


   panel.add(slider);
   panel.add(label);
   frame.add(panel);
   frame.setSize(420,420);
   frame.setVisible(true);


  }
    @Override 
  public void stateChanged(ChangeEvent e) {

  label.setText("°C = "+slider.getValue());

   
  
  }
}