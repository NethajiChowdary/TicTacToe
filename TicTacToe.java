import java.util.Scanner;
class TicTacToe
{
  public static void main(String[] args)
  {
     System.out.println("Welcome to Tic Tac Toe Game");
     System.out.println("Choose a letter o or x : ");
     Scanner s = new Scanner(System.in);
     char letter = s.next().charAt(0);
     char Choice;
     chooseLetter(letter);
     Board();
   }

     public static void Board()
     {

        char[] board =new char[8];
              System.out.println();

     }

         public static void  chooseLetter(char letter)
         {
	         switch(letter)
        	 {
           	     case 'o':
              		System.out.println("player entered letter: o");
              		System.out.println("computer choice is: x");
              		break;
          	     case 'x':
             		System.out.println("player entered letter: x");
             		System.out.println("computer choice is: o");
             		break;
         	}
         }

}
