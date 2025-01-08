package Thema4_Schleifen;

import java.util.Scanner;

public class DoWhile {

	public static void main(String[] args) {
		
//		boolean condition = false;
//		do {
//			System.out.println("Hello World!");
			
//		} while (condition);
		
		Scanner scanner = new Scanner(System.in);
		
		int pin ;
		do {
			System.out.println("Bitte geben Sie Ihren Pin ein: ");
			pin = scanner.nextInt();
			System.out.println(pin);
			
		} while (pin != 1234);
		
		System.out.println("Programm Ende");
		scanner.close();

	}

}
