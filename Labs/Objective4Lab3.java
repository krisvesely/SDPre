import java.util.Scanner;

public class Objective4Lab3 {
	public static void main(String[] args) {

		int birthYear, altBirthYear, age, currentYear;

		birthYear = 0;

		Scanner input = new Scanner(System.in);

		System.out.println("How old are you?");
		age = input.nextInt();

		currentYear = 2023;
		birthYear = currentYear - age;
		altBirthYear = birthYear - 1;

		System.out.println("You were born in " + birthYear + ", if you have already observed your birthdate during this calendar year. Otherwise you were born in " + altBirthYear + ".");

		input.close();

	}

}