import java.util.concurrent.TimeUnit;

public class GomokuDriver
	{
		
		static boolean playingMainGame = true;
		
		public static void main(String[] args) throws InterruptedException
			{
				
				Introduction.introduceGame();
				TimeUnit.SECONDS.sleep(3);	
				Board.blankBoard();
				Board.blankLogicBoard();
				Display.createDisplay();
				
				while(playingMainGame)
					{
						PlayingGame.playingGameLogic();
					}
				

			}

	}
