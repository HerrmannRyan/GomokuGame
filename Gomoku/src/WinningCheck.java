
public class WinningCheck
	{
		
		public static void checkForFiveCol()
		{
			
			boolean checkToDown = true;
			boolean checkToUp = false;
			int colCheckingStart = PlayingGame.rowChoiceInt;
			int colWinCounter = 0;
			
			while (checkToDown)
			{
				
				
				if (Board.logicBoard[colCheckingStart][PlayingGame.colChoiceInt] == 1)
					{
						colWinCounter ++;
						colCheckingStart ++;
					}
				else
					{
						colCheckingStart = PlayingGame.rowChoiceInt;
						checkToDown = false;
						checkToUp = true;
					}
				
			}
			
			while (checkToUp)
				{
					
					if (Board.logicBoard[colCheckingStart - 1][PlayingGame.colChoiceInt] == 1)
						{
							colWinCounter ++;
							colCheckingStart --;
						}
					else
						{
							checkToUp = false;
						}
					
				}
			
			if (colWinCounter == 5)
			{
				GomokuDriver.playingMainGame = false;
			}
			
			
		}
		
		
	}
