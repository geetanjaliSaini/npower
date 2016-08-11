/*
 We are going to create a new java file that includes JButton which allows a user to interactwith the program
 
Every time you are adding a GUI objects/components to the screen
1) Initialize them assign them to a Variable
2) Create them
3) Display them to the Screen
*/
package buttons;
import javax.swing.*;

public class Buttons extends JFrame{
    JPanel pnl = new JPanel();
    
    //create a variable to store imaage
    ImageIcon tick = new ImageIcon("src/buttons/tick.png");
    ImageIcon cross = new ImageIcon("src/buttons/cross.png");
    
    JButton btn = new JButton("Click me!"); 
    //creating a button object and passing an Image object
    JButton tickBtn = new JButton(tick);
    JButton crossBtn = new JButton(cross);
//Constructor
    public Buttons(){
     super ("Swing Window"); //inheriting a title label
    setSize(500, 200); //width and height in pixels
    setDefaultCloseOperation(EXIT_ON_CLOSE);// all capital in Java means its a constant Value.
    add(pnl); //draw a panel to the window   
    setVisible(true);
    pnl.add(btn);
    pnl.add(tickBtn);
    pnl.add(crossBtn);
    }
 public static void main(String[] args) {
       Buttons gui = new Buttons(); // it is creating the entire object in memory & storing it there.
    }
    
}
