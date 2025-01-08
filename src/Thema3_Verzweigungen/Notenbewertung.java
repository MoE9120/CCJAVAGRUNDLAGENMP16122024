package Thema3_Verzweigungen;

import java.util.Scanner;

public class Notenbewertung {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Bitte geben Sie Ihre Note ein: ");
		double note = scanner.nextDouble();

		if (note >= 1.0 && note < 1.5) {
			System.out.println("Sehr gut");
		} else if (note >= 1.5 && note < 2.5) {
			System.out.println("gut");
		} else if (note >= 2.5 && note < 3.4) {
			System.out.println("befriedigend");
		} else if (note >= 3.4 && note < 4.1) {
			System.out.println("ausreichend");
		} else if (note >= 4.1 && note < 5.1) {
			System.out.println("Nicht bestanden");
		} else {
			System.out.println("Ungültige Note");
		}
		scanner.close();
	}

}
