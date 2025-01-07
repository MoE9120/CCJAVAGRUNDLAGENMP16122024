package Thema3_Verzweigungen;

import java.util.Scanner;

public class Switch {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Bitte Tag als Zahl eingeben: ");
		int tag = scanner.nextInt();
		
		switch (tag) {
			case 1:
				System.out.println("Montag");
				break;
			case 2:
				System.out.println("Dienstag");
				break;
			case 3:
				System.out.println("Mittwoch");
				break;
			case 4:
				System.out.println("Donnerstag");
				break;
			case 5:
				System.out.println("Freitag");
				break;
			case 6:
				System.out.println("Samstag");
				break;
			case 7:
				System.out.println("Sonntag");
				break;
			default:
				System.out.println("ungültig");
		}

			scanner.close();
	}

}
