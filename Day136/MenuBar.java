import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

public class MenuBar {

  public static void main(String[] args) {

    MyFrame6 frame = new MyFrame6();
    
  }
  
}
class MyFrame6 extends JFrame implements ActionListener {

  JMenuItem loadItem ,saveItem,exitItem;
  MyFrame6() {

    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    this.setSize(500,500);
    this.setLayout(new FlowLayout());

    JMenuBar menu = new JMenuBar();

    JMenu fileMenu = new JMenu("file");
    JMenu editMenu = new JMenu("edit");
    JMenu helpMenu = new JMenu("Help");

    menu.add(fileMenu);
    menu.add(editMenu);
    menu.add(helpMenu);

    loadItem = new JMenuItem("Load");
    saveItem = new JMenuItem("Save");
    exitItem = new JMenuItem("Exit");

    fileMenu.add(loadItem);
    fileMenu.add(saveItem);
    fileMenu.add(exitItem);

// if ypu want add icons also to the items 

    fileMenu.setMnemonic(KeyEvent.VK_F); //alt + f for file
    editMenu.setMnemonic(KeyEvent.VK_E); //alt + e for edit
    helpMenu.setMnemonic(KeyEvent.VK_H); //alt + h for help
    loadItem.setMnemonic(KeyEvent.VK_L); // l for load
    saveItem.setMnemonic(KeyEvent.VK_S); // s for save
    exitItem.setMnemonic(KeyEvent.VK_E); // e for exit

    loadItem.addActionListener(this);
    saveItem.addActionListener(this);
    exitItem.addActionListener(this);




    
    

    this.setJMenuBar(menu);
    this.setVisible(true);

  }

  @Override 
  public void actionPerformed(ActionEvent e) {

    if(e.getSource() == loadItem ) {
      System.out.println("your file loaded");
    }
    else if(e.getSource() == saveItem) {
      System.out.println("you are file save");
    }
    else {
      System.out.println("Exited from the file");
    }

  }
}
