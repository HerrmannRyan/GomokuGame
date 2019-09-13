import java.util.Scanner;

public class Introduction
	{
		static Scanner intInput = new Scanner (System.in);
		static Scanner stringInput = new Scanner(System.in);
		static int knowRules;
		
		public static void introduceGame()
		{
			
			greetPlayer();
			if (knowRules == 1)
			{
				stateRulesOfGame();
			}
			readyForBoard();
		}
		
		private static void greetPlayer()
		{
			
			System.out.println("Hello what is your name?");
			String userName = stringInput.nextLine();
			System.out.println("Welcome to Gomoku " + userName + ", would you like to know the rules \n (1) Yes (2) No");
			knowRules = intInput.nextInt();
			
		}
		
		private static void stateRulesOfGame()
		{
			
			System.out.println("The rules of the game are simple. State the grid of the board that you would like to fill. "
					+ "\nIt is like tic tac toe, but it is five in a row. \nYou will be playing against me in this game... Got it?");
			String enterToContinue = stringInput.nextLine();
			System.out.println("Good Luck!");
			
		}
		
		private static void readyForBoard()
		{
			System.out.println("Creating Board...");
			
		}
		
	}
