/*
 oracle.com - layout.good 
The purpose of this program is to demonstrate how to use layouts specifically 
 Gridlayouts*/
package layout;
import javax.swing.*;
import java.awt.*;
//import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class Layout extends JFrame {

    JPanel pnl = new JPanel();
    JPanel grid = new JPanel(new GridLayout(2,2)); // entire panel will ingerit grid layout
    Container contentPane = getContentPane();
    public Layout(){
       super("This is the Demo of Layouts");
       setSize(500, 200);
       setDefaultCloseOperation(EXIT_ON_CLOSE);
       add(pnl);
       
       pnl.add(new JButton("yes"));
       pnl.add(new JButton("no"));
       pnl.add(new Button("Cancel"));
       
      grid.add(new JButton("1"));
      grid.add(new JButton("2"));
      grid.add(new JButton("3"));
      
      contentPane.add("North", pnl);
      contentPane.add("Center", grid);
      contentPane.add("West", new JButton ("west"));
      
      setVisible(true);
    }
    
  
    public static void main(String[] args) {
     Layout gui = new Layout();  
    }
    
}
