package whitecircleassignments;

import java.util.Scanner;

public class SwtichIgnore {

	public static void main(String[] args) {
		String day;
		Scanner k = new Scanner(System.in);
		System.out.println("Enter a day of the week");
		day = k.nextLine();
		String days = day.toUpperCase();
		// System.out.println(" Print day "+ days);
		switch (days) {
		case "MONDAY":
			System.out.println("Dress code is white");
			break;

		case "TUESDAY":

			System.out.println("Dress code is Orange");
			break;

		case "WEDNESDAY":

			System.out.println("Dress code is black");
			break;

		case "THURSDAY":

			System.out.println("Dress code is purple");
			break;

		case "FRIDAY":

			System.out.println("Dress code is teal");
			break;

		case "SATURDAY":

			System.out.println("Dress code is blue");
			break;

		case "SUNDAY":
			System.out.println("Dress code is anything");
			break;

		default:
			System.out.println("Invalid day of the week");
			break;

		}
	}
}
