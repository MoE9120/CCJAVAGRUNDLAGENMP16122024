package oop_thema1_grundlagen;

public class Hund {

	String name;

	String rasse;

	int alter;

	String farbe;

	String geschlecht;

	// Default-Konstruktor
	Hund() {
		this.name = "Streuner";
	}
		
		Hund(String name) {
			super(); //Default-Konstruktor-Aufruf
			this.name = name;
	}

	public void bellen() {
		System.out.println(name + " bellt.");
	}
	
	public void fressen() {
		System.out.println(name + " frisst.");
	}
	
	public void schlafen() {
		System.out.println(name + " schläft.");
	}

	public void familienstand() {
		if (alter > 1) {
			System.out.println("verheiratet");
		} else {
			System.out.println("noch ein Kindchen");
		}
	}
}
