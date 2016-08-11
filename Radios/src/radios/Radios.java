/*
 The purpose of this program is to display radio buttons 
 */
package radios;
import javax.swing.*;

public class Radios extends JFrame {

    JPanel pnl = new JPanel();
    JRadioButton rad1 = new JRadioButton("Red", true);
    JRadioButton  rad2 = new JRadioButton("Blue");
    JRadioButton rad3 = new JRadioButton("green");
    
    ButtonGroup crayons = new ButtonGroup(); // created the object for the group
    //JSlider slide1 = new JSlider(_);
    
    public Radios(){
    super ("Swing Window"); //inheriting a title label
    setSize(500, 200); //width and height in pixels
    setDefaultCloseOperation(EXIT_ON_CLOSE);// all capital in Java means its a constant Value.
    add(pnl);  
    crayons.add(rad1);
    crayons.add(rad2);
    crayons.add(rad3);
    pnl.add(rad1);
    pnl.add(rad2);
    pnl.add(rad3);
    
    setVisible(true);
    }
    public static void main(String[] args) {
        
        Radios gui = new Radios();
    }
    
}
