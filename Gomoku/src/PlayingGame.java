import java.util.Scanner;

public class PlayingGame
	{
		
		static Scanner userInput = new Scanner(System.in);
		static int rowChoiceInt;
		static int colChoiceInt;
		static String colString;
		static String rowString;
		
		public static void playingGameLogic()
		{
			System.out.println("Please choose a coordinate to play your \"Chip\"");
			
			String userChoice = userInput.nextLine();
			
			
			colString = userChoice.substring(0,1);
			rowString = userChoice.substring(1);
			
			choosingColumn();
			choosingRow();
			
			
		}
		
		public static void choosingColumn ()
		{
			
			switch (colString)
			{
				case "A": colChoiceInt = 0;
					break;
				
				case "B": colChoiceInt = 1;
					break;
				
				case "C": colChoiceInt = 2;
					break;
				
				case "D": colChoiceInt = 3;
					break;
				
				case "E": colChoiceInt = 4;
					break;
				
				case "F": colChoiceInt = 5;
					break;
				
				case "G": colChoiceInt = 6;
					break;
				
				case "H": colChoiceInt = 7;
					break;
				
				case "I": colChoiceInt = 8;
					break;
				
				case "J": colChoiceInt = 9;
					break;
			}
			
			
		}
		
		public static void choosingRow()
		{
			
			switch (rowString)
			{
				
				case "0": rowChoiceInt = 0;
					break;
					
				case "1": rowChoiceInt = 1;
					break;
				
				case "2": rowChoiceInt = 2;
					break;
				
				case "3": rowChoiceInt = 3;
					break;
				
				case "4": rowChoiceInt = 4;
					break;
				
				case "5": rowChoiceInt = 5;
					break;
				
				case "6": rowChoiceInt = 6;
					break;
				
				case "7": rowChoiceInt = 7;
					break;
				
				case "8": rowChoiceInt = 8;
					break;
				
				case "9": rowChoiceInt = 9;
					break;
				
				
			}
			
		}
		
		public static void winningTheGame()
		{
			System.out.println("Congratulations!!! You win!!!");
		}
		
		

	}
