import java.util.Scanner;
import java.util.Random;

public class TicTacToe
 {
	static char[] board = new char[10];
	static char playerOption,computerOption;
	static int[] computerNum;
	public static Scanner scanner = new Scanner(System.in);
	static final Random random = new Random();

	public static void main(String[] args)
	 {
		getBoard();  // call for board
		getPlayerChoice();  // call for option
		currentBoard();// call for current board
		whoPlayFirst();
		userMove(); // call for user to make a move 
		desiredMove();
	 }
	
	// method for board 
	 static void getBoard() 
	{
		 for (int i = 0; i < 10; i++)
		 {
			 board[i] = ' ';
		 }
	 }
	 
	 // method to choose the option
	 static void getPlayerChoice()
	 {
		 System.out.print("Choose an Option x or o : ");
		 playerOption = scanner.next().charAt(0);
		 if (playerOption == 'x')
			 computerOption='o';
		 else
			 computerOption ='x';
		 System.out.println("You Selected : " +playerOption);
	 }
	 // method to print the board
	 static void showBoard()
	 {
	        System.out.println("  " + board[1] + "  |  " + board[2]  + "   | " + board[3] + "  ");
	        System.out.println(".....|......|.....");
	        System.out.println("  " + board[4] + "  |  " + board[5]  + "   | " + board[6] + "  ");
	        System.out.println(".....|......|.....");
	        System.out.println("  " + board[7] + "  |  " + board[8]  + "   | " + board[9] + "  ");
	 }
	 private static void currentBoard()
	 {
	        int RADIX = 10;
	        System.out.println("\n");
	        for( int i=1; i<10; i++) 
		{
	            if (board[i] !='x'&&board[i] !='o')
	                board[i] = Character.forDigit(i, RADIX);
	        }
	        //show board method
	        showBoard();
	 }
	 static void userMove() 
	{
	        System.out.print("\nSelect the Cell from 1 to 9 : ");
	        int userChoice = scanner.nextInt();
	        if (board[userChoice] != 'x' && board[userChoice] != 'o') 
		{
	            board[userChoice] = playerOption;
	        }
		 else
		 {
	            System.out.println("Invalid Cell");
	         }
	        //calling current board method
	        currentBoard();
	 }
	 //method for user move and  checking free space
	    static void desiredMove()
	    {
	        System.out.print("\nSelect the Cell from 1 to 9 : ");
	        int userChoice = scanner.nextInt();
	        if (board[userChoice] != 'x' || board[userChoice] != 'o')
		 {
	            board[userChoice] = playerOption;
	         }
		 else 
		 {
	            System.out.println("Invalid Cell");
      	         }
	        //calling current board to see the move we made
	        currentBoard();
	       userMove();
	 }
	    static void whoPlayFirst()
	      {
	        System.out.println("\nMaking toss to check who play first\n\nselect the number 1 for head and 2 for tail\n ");
	        int check = scanner.nextInt();
	        if (check == 1 || check == 2)
		 {
	            int flip = random.nextInt(2) + 1;
	            if (flip == 1)
		    {
	                System.out.println("HEAD");
	            }
		     else
		    {
	                System.out.println("TAIL");
	            }
	            if (flip == check)
		    {
	                System.out.println("You Won the Toss You will Start the Game\n");
	                desiredMove();
	            }
		     else
		    {
	                System.out.println(" You Lost computer will Start the Game \n");
	                computerMove();
	            }
	        }
	        else 
                {
	            System.out.println("\nInvalid input Again\n");
	           whoPlayFirst();
	         }
	    }
	         //creating  for computer move
	         static void computerMove()
		 {
	            computerNum = new int[9];
	            int  computerChoice = random.nextInt(9)+1;
	            board[computerChoice]=computerOption;
	            System.out.println("the computer choice "+computerChoice+"' now its your turn.");
	            desiredMove();
	        }
}
