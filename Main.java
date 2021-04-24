import java.util.Random;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) 
	{
		int guessesLeft = 5;
		Random random = new Random();
		int randomNumber = (random.nextInt(100+1));
		boolean gameWon = false;
		
		Scanner scanner = new Scanner(System.in);

		//System.out.println(randomNumber);
		
		//Keeps prompting you to guess the number while you have guesses left
		while (guessesLeft > 0 && gameWon == false)
		{
			System.out.println("Try to guess the number between 1 and 100, you have " + guessesLeft + " guess(es) left");
			int playerGuess = scanner.nextInt();
			
			if (playerGuess < 1 || playerGuess > 100)
			{
				System.out.println("Your guess is not between 1 and 100, please try again");
			}
			else if (playerGuess < randomNumber)
			{
				System.out.println("Please pick a higher number");
				guessesLeft --;
			}
			else if (playerGuess > randomNumber)
			{
				System.out.println("Please pick a lower number");
				guessesLeft --;
			}
			else if (playerGuess == randomNumber)
			{
				System.out.println("You win!");
				gameWon = true;
			}
		}
		
		if (gameWon == false)
		{
			System.out.println("You lose!");
			System.out.println("The number to guess was: " + randomNumber);
		}
	}
	
}
