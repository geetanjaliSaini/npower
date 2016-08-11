/*
 * Tutorial for Chapters1 to 3
 */
package chapters1to3tutorial;


// Provides the collections framework, formatted printing and scanning, array manipuate
import java.util.Scanner;   // core library
/**
 *
 * @author Geet
 */
public class Chapters1To3Tutorial {  // classes start with capital letter

    /**
     * @param args the command line arguments
     */
    private static int option=0;
    
    public void dislpayMenu(){
        // methods starts with lower case
        //Display menu for user
        System.out.println("*********************");
        System.out.println("The Awesome Resturant");
        System.out.println("Your food option");
        System.out.println("1. Pizza Slice - $1.00");
        System.out.println("2. Sushi (Dynamite) - $5.00");
        System.out.println("3. Kabobs (2 per plate) - $3.00");
        
    }
    
    public static void main(String[] args) { //This is the starting point
        // TODO code application logic here
        
        double price; // variable to store the item cost
           // variable to store customers selection
        
        /* This line calls the library to store an object of input from user */
        Scanner input = new Scanner(System.in); // Calling the scanner object
        // created an object called input
        // this object is waiting to receive input from the user.
        
        /* The next  lines are for prompting user to enter option again */
        String more ="";
        
        
        //how to get it from the user?
        
        
        
        
        // nest switch in while loop {}
        do{
        
              System.out.println("Please Enter your option: ");
              option = input.nextInt(); 
        /* nextDouble(); , nextFloat(); what is the next value you are entering.7
        Assigns input from user to option variable */  
        switch (option){
            case 1:
                    System.out.println(" You Ordered a Pizza");
                    System.out.println("Would you like to order more? Y or N");
                    more = input.next();
                        if (more.equals("y") ){
                            System.out.println("Entered Correctly");
                        }
                        else if(more =="n" || more == "N"){
                            System.out.println("sorry Try Again");
                            break;
                       }
                        
                        else {
                                System.out.println("What you doing? you idiot !!!");
                                }
                    break;
            case 2:
                    System.out.println(" You Ordered a Sushi");
                    break;
            case 3:
                    System.out.println(" You Ordered a Kabobs");
                    break;
            default: 
                    System.out.println("Sorry Inccorect option");
                    //to make program to continuesly ask the question?
                    
            }

        }
        while ( option <1 || option > 3) ;
        //Switch is great for small menus.
        
           
        
    }
    
}
