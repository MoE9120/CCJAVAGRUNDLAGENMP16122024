package Thema3_Verzweigungen;

import java.util.Random;
import java.util.Scanner;

public class Glücksspielautomat {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Random random = new Random();
		int cancel = 0;
		System.out.println("*** Willkommen beim Glücksspiel! ***");
 
		while (cancel == 0) {
			int randomNumb = 1 + random.nextInt(100);
			System.out.println(
					"Geben Sie eine ganze Zahl zwischen 1 und 100 ein! Beenden mit 'S'");
			String numb = scanner.next();
			if (numb.charAt(0) == 's') {
				cancel = 1;
				break;
			}
			System.out.println("Ihre generierte Zahl lautet: " + randomNumb);
			if (randomNumb >= 40 && randomNumb <= 60) {
				System.out.println("***Herzlichen Glückwunsch! Sie haben gewonnen***\n");
			} else {
				System.out.println("Leider verloren, versuchen Sie es gerne noch einmal!\n");
			}
		}
		scanner.close();
	}
 
}