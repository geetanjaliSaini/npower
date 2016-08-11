package exceptionhandlingdemo1;

import java.util.*;
import java.io.*;

public class ExceptionHandlingDemo1 {
    static Scanner userInput = new Scanner(System.in);// taking input in
    static int age; 
    
    public static int checkValidAge() {
        try{
            return userInput.nextInt(); // this will return user input
        }
             
        catch(InputMismatchException e){
            userInput.next();
            
            System.out.println("Sorry that isn't Valid");
            return 0;
        }
    }
    public static void checkPositiveAge(int a){
    
    if(age > 0 ){ System.out.println("You are " + age + "  years old");}
        else if (age <= 0){ System.out.println("Invalid Entry");}
        else{ System.out.println("Sorry bye bye!!!!");}
    }
    public static void main (String[] args){
       
        System.out.println("How old are you?"); // ask user for input
        age = checkValidAge();
        checkPositiveAge(age);
        
    }
}
