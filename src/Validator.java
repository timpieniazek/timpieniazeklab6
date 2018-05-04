import java.util.Scanner;

public class Validator {
	public static String getString(Scanner sc, String prompt) {
		System.out.print(prompt);
		String s = sc.next(); // read user entry
		sc.nextLine(); // discard any other data entered on the line
		return s;
	}

	public static String getString(Scanner sc, String prompt, String cond1, String cond2) {

		String s = "";
		boolean isValid = false;
		while (isValid == false) {
			System.out.print(prompt);
			s = sc.nextLine(); // read user entry
			if (!s.equalsIgnoreCase(cond1) && !s.equalsIgnoreCase(cond2)) {
				System.out.print("\nThat data does not exist. Please try again. ");
			} else {
				isValid = true;
			}
//			sc.nextLine(); // discard any other data entered on the line
		}
		return s;
	}
	
	public static String getYesOrNo(Scanner sc, String prompt) {
		String s = "";
		boolean isValid = false;
		while (!isValid) {
			System.out.print(prompt);
			s = sc.next(); // read user entry
			if (s.equalsIgnoreCase("yes") || s.equalsIgnoreCase("y")) {
				return "yes";
			} else if (s.equalsIgnoreCase("no") || s.equalsIgnoreCase("n")) {
				return "no";
			} else {
				System.out.print("\nInput not recognized. ");
				prompt = "(enter \"yes\" or \"no\"): ";
			}
			
		}
		return s;
		
	}

	public static int getInt(Scanner sc, String prompt) {
		int i = 0;
		boolean isValid = false;
		while (isValid == false) {
			System.out.print(prompt);
			if (sc.hasNextInt()) {
				i = sc.nextInt();
				isValid = true;
			} else {
				System.out.print("\nError! Invalid integer value. Try again. ");
			}
			sc.nextLine(); // discard any other data entered on the line
		}
		return i;
	}

	public static int getInt(Scanner sc, String prompt, int min) {
		int i = 0;
		boolean isValid = false;
		while (isValid == false) {
			i = getInt(sc, prompt);
			if (i < min)
				System.out.printf("Please choose a number greater than %s!%n%n", min);
			else
				isValid = true;
		}
		return i;
	}
	
	public static int getInt(Scanner sc, String prompt, int min, int max) {
		int i = 0;
		boolean isValid = false;
		while (isValid == false) {
			i = getInt(sc, prompt);
			if (i < min || i > max)
				System.out.print("\nThat student does not exist. Please try again. ");
			else
				isValid = true;
		}
		return i;
	}

	public static double getDouble(Scanner sc, String prompt) {
		double d = 0;
		boolean isValid = false;
		while (isValid == false) {
			System.out.print(prompt);
			if (sc.hasNextDouble()) {
				d = sc.nextDouble();
				isValid = true;
			} else {
				System.out.println("Error! Invalid decimal value. Try again.");
			}
			sc.nextLine(); // discard any other data entered on the line
		}
		return d;
	}

	public static double getDouble(Scanner sc, String prompt, double min, double max) {
		double d = 0;
		boolean isValid = false;
		while (isValid == false) {
			d = getDouble(sc, prompt);
			if (d < min)
				System.out.println("Error! Number must be " + min + " or greater.");
			else if (d > max)
				System.out.println("Error! Number must be " + max + " or less.");
			else
				isValid = true;
		}
		return d;
	}
}