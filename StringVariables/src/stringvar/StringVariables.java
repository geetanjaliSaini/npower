
package stringvar;

import java.util.Scanner; //Import statement

public class StringVariables {

    
    public static void main(String[] args) {
     
        Scanner First_name= new Scanner(System.in);
        String abc, xyz;
        System.out.println("Enter Your First Name: ");
        abc=First_name.next();
        
        Scanner Last_name= new Scanner(System.in);
        System.out.println("Enter Your Last Name:  ");
        xyz= Last_name.next();
        System.out.println("Your Full Name is " + ""+ abc + " "+ xyz);
        
    }
    
}
