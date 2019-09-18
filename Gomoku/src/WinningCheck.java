
public class WinningCheck
	{
		
		public static void checkForFiveRow()
		{
			
			boolean checkToRight = true;
			boolean checkToLeft = false;
			int rowCheckingStart = PlayingGame.rowChoiceInt;
			int rowWinCounter = 0;
			
			while (checkToRight)
			{
				
				
				if (Board.logicBoard[rowCheckingStart][PlayingGame.colChoiceInt] == 1)
					{
						rowWinCounter ++;
						rowCheckingStart ++;
					}
				else
					{
						rowCheckingStart = PlayingGame.rowChoiceInt;
						checkToRight = false;
						checkToLeft = true;
					}
				
			}
			
			while (checkToLeft)
				{
					
					if (Board.logicBoard[rowCheckingStart - 1][PlayingGame.colChoiceInt] == 1)
						{
							rowWinCounter ++;
							rowCheckingStart --;
						}
					else
						{
							checkTo
						}
					
				}
			
			
		}
		
		
	}
