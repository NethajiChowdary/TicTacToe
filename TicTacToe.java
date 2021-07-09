import java.util.Scanner;

public class TicTacToe
 {
	static char[] board = new char[10];
	static char playerOption,computerOption;
	public static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) 
	{
		getBoard(); 
		getPlayerChoice();  
		currentBoard(); 
	}
	//method for board
	 static void getBoard() 
		{
		 for (int i = 0; i < 10; i++)
	 		{
			 board[i] = ' ';
			 }
	 	}
	// method to choose the letter
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
	// method to showboard
	  static void showBoard()
	 {
	        System.out.println("  " + board[1] + "  |  " + board[2]  + "   | " + board[3] + "  ");
	        System.out.println(".....|......|.....");
	        System.out.println("  " + board[4] + "  |  " + board[5]  + "   | " + board[6] + "  ");
	        System.out.println(".....|......|.....");
	        System.out.println("  " + board[7] + "  |  " + board[8]  + "   | " + board[9] + "  ");
	 }
	// method to display current board
	 private static void currentBoard()
	 {
	        int RADIX = 10;
	        System.out.println("\n");
	        for( int i=1; i<10; i++) 
		{
	            if (board[i] !='x'&&board[i] !='o')
	                board[i] = Character.forDigit(i, RADIX);
	        }
		// method to call showboard
	        showBoard();
	 }
}
