
public class Board 
{
	
	static String[][] board = new String [10][10];
	
	public static void blankBoard()
	{
		for (int row = 0; row < board.length; row++)
		{
			for (int col = 0; col < board[row].length; col ++)
			{
				board[row][col] = " ";
			}
		}
	}
	
}
