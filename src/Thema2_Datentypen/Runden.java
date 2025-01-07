package Thema2_Datentypen;

import java.util.Scanner;

public class Runden {

	public static void main(String[] args) {
		
		 Scanner scanner = new Scanner(System.in);

	        System.out.print("Geben Sie eine Fließkomma-Zahl ein: ");
	        double input = scanner.nextDouble();

	        double roundedValue = (int) (input * 100.0 + 0.5) / 100.0;

	        System.out.println("Gerundeter Wert auf zwei Nachkommastellen: " + roundedValue);

	        scanner.close();

	}

}
