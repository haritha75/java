import javax.swing.*;

class JOptionPaneEx {

  public static void main(String[] args) {
    // it is used to pop up a standard dialog box that prompts users for a value
   // JOptionPane.showMessageDialog(null,"this is some info","title",JOptionPane.INFORMATION_MESSAGE);

//    JOptionPane.showMessageDialog(null,"this is some info","title",JOptionPane.PLAIN_MESSAGE);
//    JOptionPane.showMessageDialog(null,"this is some info","title",JOptionPane.QUESTION_MESSAGE);
//    JOptionPane.showMessageDialog(null,"this is some info","title",JOptionPane.WARNING_MESSAGE);
//    JOptionPane.showMessageDialog(null,"this is some info","title",JOptionPane.ERROR_MESSAGE);

//    JOptionPane.showConfirmDialog(null,"this is some info","title",JOptionPane.YES_NO_CANCEL_OPTION);
//    String name = JOptionPane.showInputDialog("What is your name?: ");
//    System.out.println("Hello "+name);


    String response[] = {" No, you are awesome","thankyou"};
    ImageIcon icon = new ImageIcon("finger.jpg");
    JOptionPane.showOptionDialog(null,"you are awesome","select message",JOptionPane.YES_NO_CANCEL_OPTION,JOptionPane.INFORMATION_MESSAGE,icon,response,0);


  }
  
}
