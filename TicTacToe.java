class TicTacToe
{
	public static void main(String[] args)
	{
		System.out.println("Welcome to TicTacToe Game");
		Board();
	}

public static void Board()
   {
    char[] board=new char[8];
    for(int i=0;i<=2;i++)
    {
        for(int j=0;j<=2;j++)
        {
            System.out.print('_');
            System.out.print('|');
        }
        System.out.println();
    }
   }
}
