
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
	
	public static void playerFillingTheBoards()
	{
		
		board [PlayingGame.rowChoiceInt][PlayingGame.colChoiceInt] = "X";
		logicBoard[PlayingGame.rowChoiceInt][PlayingGame.colChoiceInt] = 1;
		
	}
	
	public static void computerFillingTheBoards()
	{
		
		int computerRow = (int)(Math.random()*9);
		int computerCol = (int)(Math.random()*9);
		
		board[computerRow][computerCol] = "O";
		logicBoard[computerRow][computerCol] = 2;
		
	}
	
}
