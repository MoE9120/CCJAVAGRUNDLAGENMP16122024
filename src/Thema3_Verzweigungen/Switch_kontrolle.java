package Thema3_Verzweigungen;

import java.util.Scanner;

public class Switch_kontrolle {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.println("Bitte geben Sie eine Zahl zwischen 0-9 ein: ");
		int zahl = scanner.nextInt();

		switch (zahl) {
		case 0, 1, 2, 3:
			System.out.println("Bereich Null bis Drei");
			break;
		case 4, 5, 6, 7:
			System.out.println("Bereich Vier bis Sieben");
			break;
		case 8, 9:
			System.out.println("Bereich Acht bis Neun");
			break;
		default:
			System.out.println("Ungültige Eingabe. Wählen Sie Zahlen zwischen 0-9.");
		}

		scanner.close();
	}

}
