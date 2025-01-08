package Thema3_Verzweigungen;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Geldautomat {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("#.00");

		double kontostand = 69.69;

		System.out
				.println("Ihr Guthaben beträgt: " + df.format(kontostand) + "Euro. Wieviel Geld möchten Sie abheben? ");
		double betrag = scanner.nextDouble();

		if (betrag > kontostand) {

			System.out.println("So viel Geld hast du leider nicht auf deinem Konto, du Otto.");
		} else {
			double restGuthaben = kontostand - betrag;
			System.out.println("Sie haben " + df.format(betrag) + "Euro abgehoben. Ihr Restguthaben beträgt "
					+ df.format(restGuthaben) + ". Bleib sparsam, Bruder!");
		}

		scanner.close();
	}

}
