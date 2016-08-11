/*
 We are creating a Window.
 The purpose of this program is to create a Window in Java Swing 
 to demonstrate how a frame and window work togather. 
 */
package window;
import javax.swing.*; /* package contains classes for
                        a varity of componebts native to the OS. */
//JFrame = window inside a frame. eg. picture inside a frame.
//Using inheritence to ingerit all features from JFrame.
public class Window extends JFrame {
    JPanel pnl = new JPanel(); //creating a panel object
    //A constuctor build things in Java. Constuctor is used to build window components.
    public Window(){
    //width, height, close button
    super ("Swing Window"); //inheriting a title label
    setSize(500, 200); //width and height in pixels
    setDefaultCloseOperation(EXIT_ON_CLOSE);// all capital in Java means its a constant Value.
    add(pnl); //draw a panel to the window
    setVisible(true); //used to show on your display
    }
    public static void main(String[] args) {
       //create a window object
       Window gui = new Window();
    }
    
}
