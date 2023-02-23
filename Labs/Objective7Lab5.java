import java.util.Scanner;

public class {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int selection = 0;

		while (true) {
			System.out.println("_____Menu_____");
			System.out.println("1: Say Hello");
			System.out.println("2: List My favorite foods");
			System.out.println("3: Exit");
			System.out.println();

			selection = scanner.nextInt();

			if (selection <= 0 || selection > 3) {
				System.out.println("Enter a value from 1 to 3");
			}
			if (selection == 1) {
				System.out.println("Hello Human");
			}
			if (selection == 2) {
				System.out.println("Apples, Bananas, Coconuts");
			}
			if (selection == 3) {
				System.out.println("Goodbye");
				break;
			}
		}
		scanner.close();
	}
}