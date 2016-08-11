/*
Change the apperance of the text on the screen.
 */
package custom;
import javax.swing.*; //widgets- buttons,etc. 
import java.awt.*; /* graphical - styling. Fonts, colors,etc. Included in the library are attributes to change color and other attributes simpliar to css*/
import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class Custom extends JFrame{

    JPanel pnl = new JPanel();
    JLabel lbl1 = new JLabel ("Custom Background");
    JLabel lbl2 = new JLabel ("Custom Foreground");
    JLabel lbl3 = new JLabel ("Custom Font");
    
    Font customFont = new Font("Serif", Font.PLAIN, 32);
public Custom(){
    super ("Swing Window"); //inheriting a title label
    setSize(500, 200); //width and height in pixels
    setDefaultCloseOperation(EXIT_ON_CLOSE);// all capital in Java means its a constant Value.
    add(pnl);
    
    pnl.add(lbl1);
    lbl1.setOpaque(true);
    lbl1.setBackground(Color.YELLOW);
    
    pnl.add(lbl2);
    lbl2.setForeground(Color.RED);
    
    pnl.add(lbl3);
    lbl3.setFont(customFont);
    
    setVisible(true);
}    

    public static void main(String[] args) {
       
        Custom gui = new Custom();
    }
    
}
