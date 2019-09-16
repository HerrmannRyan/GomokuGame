
public class Board 
{
	
	static String[][] board = new String [10][10];
	static int[][] logicBoard = new int[10][10];
	
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
	
	public static void blankLogicBoard()
	{
		for (int row = 0; row < logicBoard.length; row++)
		{
			for (int col = 0; col < logicBoard[row].length; col ++)
			{
				logicBoard[row][col] = 0;	
			}
		}
	}
	
}
