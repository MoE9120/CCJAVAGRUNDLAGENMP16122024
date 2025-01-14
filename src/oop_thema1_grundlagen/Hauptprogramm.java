package oop_thema1_grundlagen;

public class Hauptprogramm {

	public static void main(String[] args) {

		// Objekt
		Hund hund1 = new Hund();
		hund1.name = "Tupac";
		hund1.alter = 13;
		// hund1.familienstand();

		System.out.println("Der Name des Hundes ist " + hund1.name);

		// hund1.bellen();

		Hund hund2 = new Hund();
		hund2.name = "Jada";
		hund2.alter = 2;
		System.out.println("Der Name des Hundes ist " + hund2.name);

		Hund hund3 = new Hund();
		hund3.name = "Afeni";
		hund3.alter = 1;
		System.out.println("Der Name des Hundes ist " + hund3.name);
	}

}
