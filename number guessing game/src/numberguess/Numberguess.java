package numberguess;
import java.util.Random;
import java.util.Scanner;
public class Numberguess {
	public static void main(String args[]) {
		Random  rand = new Random();
		
		int randomNumber = rand.nextInt(100) + 1;
		//System.out.println("Random number is " + randomNumber);
		
		int tryCount = 0;
		while(true) {
		System.out.println("Please enter your guess (between 1 and 100): ");
		
		Scanner scanner = new Scanner(System.in);
		
		int yourGuess = scanner.nextInt();
		tryCount++;
		
		if (yourGuess == randomNumber) {
			System.out.println("You were right! Congrats!");
			System.out.println("It took you " + tryCount + " tries.");
			break;
		}
		else if (randomNumber > yourGuess) {
			System.out.println("Sorry, your guess is too small. Try again!");
		}
		else {
			System.out.println("Nope! Number is smaller. Take another shot!");
		}
	}
	
}
}
