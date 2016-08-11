package fifteenpuzzledos;

import java.util.Random; // to give the application the ability to generate a stream of pseudorandom numbers
import java.util.Scanner; // a simple text scanner which can parse primitive types and strings using regular expressions.

public class FifteenPuzzleDos {
   
   private Random rn    = new Random();
   private int[]  squares = new int[16];

   public FifteenPuzzleDos() {
       for (int i = 1; i < squares.length; i++)
           squares[i - 1] = i;
       for (int i = 0; i < 400; i++)
           move(rn.nextInt(squares.length - 1) + 1);
   }
   
   private void scramble() {
       int[] neighbors = new int[4];
       int   numNeighbors, temp, moveTo, blank = 15;
       for (int i = 0; i < 200; i++) {
           numNeighbors = findNeighbors(blank, neighbors);
           moveTo = neighbors[rn.nextInt(numNeighbors)];
           temp = squares[moveTo];
           squares[moveTo] = squares[blank];
           squares[blank]  = temp;
           blank = moveTo;
       }
   }

   private int findNeighbors(int blank, int[] array) {
       int numNeighbors = 0;
       if (blank >  3)     array[numNeighbors++] = blank - 4;
       if (blank < 12)     array[numNeighbors++] = blank + 4;
       if (blank % 4 != 0) array[numNeighbors++] = blank - 1;
       if (blank % 4 != 3) array[numNeighbors++] = blank + 1;
       return numNeighbors;
   }
   
   // the "move" method specifically moves the blank space
   public void move(int number) {
       if (number >= squares.length)
           return;
       int i; 
       for (i = 0; i < squares.length; i++)
           if (squares[i] == number) 
               // squares[i] += 10;
               break;
       if (tryAbove(i)) return;
       if (tryBelow(i)) return;
       if (tryLeft(i))  return;
       if (tryRight(i)) return;
   }
   
   // the "tryAbove" method tries to check whether the blank space is above then swaps/moves a single number or the whole line towards its original position
   private boolean tryAbove(int pos) {
       if (pos < 4)
           return false;
       if (squares[pos - 4] != 0 && ! tryAbove(pos - 4))
           return false;
       swap(pos, pos - 4);
       return true;
   }
   
   // the "tryBelow" method tries to check whether the blank space is below then swaps/moves a single number or the  whole line towards its original position
   private boolean tryBelow(int pos) {
       if (pos > 11)
           return false;
       if (squares[pos + 4] != 0 && ! tryBelow(pos + 4))
           return false;
       swap(pos, pos + 4);
       return true;
   }
 
   // the "tryLeft" method tries to check whether the blank space to its left then swaps/moves a single number or the whole line towards its original position
   private boolean tryLeft(int pos) {
       if (pos % 4 == 0)
           return false;
       if (squares[pos - 1] != 0 && ! tryLeft(pos - 1))
           return false;
       swap(pos, pos - 1);
       return true;
   }
 
   // the "tryRight" method tries to check whether the blank space to its right then swaps/moves a single number or the whole line towards its original position
   private boolean tryRight(int pos) {
       if (pos % 4 == 3)
           return false;
       if (squares[pos + 1] != 0 && ! tryRight(pos + 1))
           return false;
       swap(pos, pos + 1);
       return true;
   }

   // the "swap" method allows the application to know ho far the blank space is able to move
   private void swap(int one, int two) {
       int     temp = squares[one];
       squares[one] = squares[two];
       squares[two] = temp;
   }
   
   // the "format" method provides a particular lay-out which adds the spaces for the numbers to appear on the command line
   private String format(int number) {
       if (number == 0) return "   ";
       return ((number < 10) ? " " : "") + number + " ";
   }
   
   // the "display" method prints the numbers into a grid pattern
   public void display() {
       System.out.println();
       for (int i = 0; i < 4; i++) {
           for (int j = 0; j < 4; j++)
               System.out.print(format(squares[i * 4 + j]));
           System.out.println();
       }
   }
   
   // the "main" method provides the user the ability to move the blank space within the grid
   public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
       FifteenPuzzleDos puzzle = new FifteenPuzzleDos();
       int number;
       while (true) {
           puzzle.display();
           System.out.print("\nMove: ");
           number = input.nextInt();
           if (number == 0)
               break;
           puzzle.move(number);
       }
   }
}



