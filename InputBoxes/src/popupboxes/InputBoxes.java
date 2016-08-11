
package popupboxes;

import javax.swing.JOptionPane;
public class InputBoxes {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        String First_name;
        First_name= JOptionPane.showInputDialog( "Enter your First Name");
        
        String Last_name;
        Last_name= JOptionPane.showInputDialog("Enter your Last Name");
        
        String Full_name = First_name + Last_name;
        
        JOptionPane.showMessageDialog(null,"Name="+Full_name"", JOptionPane.ERROR_MESSAGE);
        System.exit(0);
    }
    
}
