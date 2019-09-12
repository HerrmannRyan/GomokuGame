import java.util.Scanner;

public class Introduction
	{
		static Scanner userInput = new Scanner (System.in);
		static int knowRules;
		
		public static void introduceGame()
		{
			
			greetPlayer();
			if (knowRules == 1)
				{
					stateRulesOfGame();
				}
		}
		
		private static void greetPlayer()
		{
			
			System.out.println("Hello what is your name?");
			String userName = userInput.nextLine();
			System.out.println("Would you like to know the rules \n (1) Yes (2) No");
			knowRules = userInput.nextInt();
			
		}
		
		private static void stateRulesOfGame()
		{
			
		}
		
	}
