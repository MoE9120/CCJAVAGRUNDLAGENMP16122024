package oop_thema1_grundlagen_auto;

public class Hauptprogramm {

	public static void main(String[] args) {

		Auto auto1 = new Auto("BMW", "X5", 2021);
		// auto1.fahren();
		System.out.println(auto1);
		
		Auto auto2 = new Auto("Mercedes", "A-Klasse", 2024);
		// auto2.fahren();

//		System.out.println(auto1.getMarke());
//		auto1.setMarke("Audi");
//		auto1.fahren();
//		System.out.println(auto2.getMarke());
//		auto2.fahren();
//
//		System.out.println(Auto.ANZAHL_REIFEN);
	}

}
