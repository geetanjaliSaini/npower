package exceptionhandlingdemo2;

import java.util.*;
import java.io.*;

public class ExceptionHandlingDemo2 {

   static Scanner userInput = new Scanner (System.in);
   static int num;
   
   public static void divideByZero(int number){
       try{
           System.out.println(number/0);
       }
       catch (ArithmeticException e){
       // three different ways to handle exception messages
       
       //custom message
       System.out.println("Invalid Entry");
       
       //change java's error exception message. this is java complier message
       System.out.println(e.getMessage());
       
       //print the standard Error stack
       e.printStackTrace();
   }
       //finally method. it runs regardless
       finally{ System.out.println("Runs regardless of errors");}
   }
    public static void main(String[] args) {
        
        System.out.println("Enter an integer: ");
        num =  userInput.nextInt();
                
        divideByZero(num);
    }
    
}
