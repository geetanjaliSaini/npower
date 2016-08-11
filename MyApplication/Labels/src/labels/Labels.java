/*
To display labels in the form of text on the screen
 */
package labels;
import javax.swing.*;
import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class Labels extends JFrame{
    
    JPanel pnl = new JPanel();
    JLabel lb1 = new JLabel("Duke is a friendly mascot of Java Technology");
    
    JTextField txt = new JTextField(20);
    
    public Labels(){
    super ("Swing Window"); //inheriting a title label
    setSize(500, 200); //width and height in pixels
    setDefaultCloseOperation(EXIT_ON_CLOSE);// all capital in Java means its a constant Value.
    add(pnl); //drw a panel to the window
    
    pnl.add(lb1);
    pnl.add(txt);
    setVisible(true);
    }
    
    public static void main(String[] args) {
       Labels gui = new Labels();
    }
    
}
