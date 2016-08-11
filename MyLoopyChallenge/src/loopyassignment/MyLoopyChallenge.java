
package loopyassignment;

/**
 *
 * @author Mira */

import javax.swing.JOptionPane; // import library

public class MyLoopyChallenge {

    public static void main(String[] args) {
        // Main Selection Menu
        System.out.println("******************************");
        System.out.println("Please Select a Planet");
        System.out.println("1. Mercury");
        System.out.println("2. Jupiter");
        System.out.println("3. Neptune");
        System.out.println("4. Venus");
        System.out.println("5. Saturn");
        System.out.println("6. Pluto");
        System.out.println("7. Mars");
        System.out.println("8. Uranus");
        System.out.println("9. <QUIT>");
        
        /* 
        JOptionPane class allows you to have input boxes.
        showInputDialog method will get input box that the user can type into */
        String second_choice = JOptionPane.showInputDialog("Do you want to Calculate Your Weight on Differnt Planets? Enter 1 for Yes or 2 for No");
        int sec_num=Integer.parseInt(second_choice);
        
        //Nesting switch inside if/else loop.
        if (sec_num == 1){ 
        
        String choice_num;
        choice_num= JOptionPane.showInputDialog("Please Enter Your Selection");
        
        String Weight;
        Weight= JOptionPane.showInputDialog("Please Enter Your Weight");
        
        /*Integer.parseInt(); convert string to integer */
        int choice= Integer.parseInt(choice_num);
        int weight = Integer.parseInt(Weight);
        double answer;
        
        
        switch(choice){
        case 1:
            answer = weight * 0.37;
            JOptionPane.showMessageDialog(null, "Your Weight of"+" "+ weight+ " "+"Pounds" +" "+"on Earth would be" +" "+ answer +" "+"pounds on Mercury", "Weight on Mercury", JOptionPane.PLAIN_MESSAGE);
            break;
        case 2:
            answer = weight * 2.64 ;
            JOptionPane.showMessageDialog(null, "Your Weight of"+" "+ weight+ " "+"Pounds" +" "+"on Earth would be" +" "+ answer +" "+"pounds on Jupiter", "Weight on Jupiter", JOptionPane.PLAIN_MESSAGE);
            break;
        case 3:
            answer = weight * 1.12;
            JOptionPane.showMessageDialog(null, "Your Weight of"+" "+ weight+ " "+"Pounds" +" "+"on Earth would be" +" "+ answer +" "+"pounds on Neptune", "Weight on Neptune", JOptionPane.PLAIN_MESSAGE);
            break;
        case 4:
            answer = weight * 0.8;
            JOptionPane.showMessageDialog(null, "Your Weight of"+" "+ weight+ " "+"Pounds" +" "+"on Earth would be" +" "+ answer +" "+"pounds on Venus", "Weight on Venus", JOptionPane.PLAIN_MESSAGE);
            break;
        case 5:
            answer = weight * 1.15;
            JOptionPane.showMessageDialog(null, "Your Weight of"+" "+ weight+ " "+"Pounds" +" "+"on Earth would be" +" "+ answer +" "+"pounds on Saturn", "Weight on Saturn", JOptionPane.PLAIN_MESSAGE);
            break;
        case 6:
            answer = weight * 0.04;
            JOptionPane.showMessageDialog(null, "Your Weight of"+" "+ weight+ " "+"Pounds" +" "+"on Earth would be" +" "+ answer +" "+"pounds on Pluto", "Weight on Pluto", JOptionPane.PLAIN_MESSAGE);
            break;
        case 7:
            answer = weight * 0.38;
            JOptionPane.showMessageDialog(null, "Your Weight of"+" "+ weight+ " "+"Pounds" +" "+"on Earth would be" +" "+ answer +" "+"pounds on Mars", "Weight on Mars", JOptionPane.PLAIN_MESSAGE);
            break;
        case 8:
            answer = weight * 1.15;
            JOptionPane.showMessageDialog(null, "Your Weight of"+" "+ weight+ " "+"Pounds" +" "+"on Earth would be" +" "+ answer +" "+"pounds on Uranus", "Weight on Uranus", JOptionPane.PLAIN_MESSAGE);
            break;
        case 9:
            System.exit(0); // this make sure that the program exit
            
        default:   
            JOptionPane.showMessageDialog(null, "invalid entry");
    }
       
        }
        
        else
        {
           System.exit(0);
        }
    
          /* I will Continue working on this to figure out how to keep the loop running */               
                         
    }
    
}
