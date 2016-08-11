package fifteenchallenges;

/**
 *
 * @author Mira
 */
public class FifteenChallenges {
int number;
while (true) {
  System.out.print( "\nMove: " );
  number = Integer.parseInt( IOutils.getKeyboard() );
  if (number == 0)
    break;
}
    
    public static void main(String[] args) {
      public class FifteenPuzzleDos {
  private int[] squares = new int[16];

  public FifteenPuzzleDos() {
    for (int i=1; i < squares.length; i++)
      squares[i-1] = i;
  }

  public static void main( String[] args ) {
    FifteenPuzzleDos puzzle = new FifteenPuzzleDos();
    int number;
    while (true) {
      puzzle.display();
      System.out.print( "\nMove: " );
      number = Integer.parseInt( IOutils.getKeyboard() );
      if (number == 0)
        break;
      puzzle.move( number );
  } }

  public void display() {
    System.out.println();
    for (int i=0; i < 4; i++) {
      for (int j=0; j < 4; j++)
        System.out.print( format( squares[i * 4 + j] ) );
      System.out.println();
  } }

  private String format( int number ) {
    if (number == 0) return "   ";
    return ((number < 10) ? " " : "") + number + " ";
  }

  public void move( int number ) {
    for (int i=0; i < squares.length; i++)
      if (squares[i] == number) {
        squares[i] += 10;
        break;
} }   }
    }
    
}
