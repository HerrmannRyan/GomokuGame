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
						Board.playerFillingTheBoards();
						TimeUnit.MILLISECONDS.sleep(50);
						Display.createDisplay();
						Board.computerFillingTheBoards();
						TimeUnit.SECONDS.sleep(2);
						System.out.println("Computer is playing...");
						TimeUnit.SECONDS.sleep(2);
						Display.createDisplay();
					}
				

			}

	}
