import java.util.Random;
import java.util.Scanner;

// Tim Pieniazek -- 05/04/2018
// Lab Number 6

public class DiceRoll {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int numSides;
		System.out.println("Welcome to the Grand Circus Casino!\n");
		Random random = new Random();
		// calls Validator class to prevent dice with fewer than 2 sides
		numSides = Validator.getInt(scan, "How many sides should each die have? ", 2);
		int counter = 0;
		int die1;
		int die2;

		// while loop continues until users is done playing
		String cont = "y";
		while (cont.equalsIgnoreCase("y")) {
			
			// increments the counter for number of rolls (from zero)
			System.out.printf("%nRoll %s:%n", ++counter);

			// calls roll method for first and second dice
			System.out.println(die1 = roll(random, numSides));

			System.out.println(die2 = roll(random, numSides));
			
			// prints a special method if conditions are met
			System.out.print(special(die1, die2));
			
			// user input through Validator class
			cont = Validator.getString(scan, "Roll again? (y/n): ");
		}
		
		System.out.println("\nThanks for playing!\nGoodbye!");

	}

	// method takes in Random object, find random number 0 up to not including i
	// needs to + 1, to result 1 to i
	public static int roll(Random random, int i) {
		return random.nextInt(i) + 1;
	}

	public static String special(int die1, int die2) {
		if (die1 == 1 && die2 == 1) {
			return "Snake Eyes!\n";
		} else if (die1 + die2 == 7) {
			return "Craps!\n";
		} else if (die1 + die2 == 11) {
			return "Craps!\n";
		} else if (die1 == 6 && die2 == 6) {
			return "Boxcars!\n";
		} else return "";
	}

}
