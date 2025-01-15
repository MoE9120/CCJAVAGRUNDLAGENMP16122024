package oop_thema1_bank;

public class Hauptprogramm {
	public static void main(String[] args) {

		// Kundeninformationen
		Kunde kunde1 = new Kunde("123456", "Max Mustermann", "Musterstraße 1");
		Kunde kunde2 = new Kunde("654321", "Anna Meier", "Meierweg 2");

		// Kontoinformationen
        GiroKonto giroKonto1 = new GiroKonto("123456", kunde1, 1000.0, 500.0);
        SparKonto sparKonto1 = new SparKonto("654321", kunde2, 2000.0, 1.5);

		// Aktieninformationen
		Aktie aktie1 = new Aktie("AAPL123", "Apple Inc.", 150.0);
		Aktie aktie2 = new Aktie("MSFT456", "Microsoft Corp.", 280.0);

		// Darlehensvertrag
		Darlehensvertrag darlehen = new Darlehensvertrag("D1001", kunde1, 10000.0, 5.0, 12);

		// Ausgabe Bank
		System.out.println("Bank: " + Bank.name);
		System.out.println("Anzahl Konten: " + Bank.anzahlKonten);
		System.out.println();

		// Ausgabe der Kundeninformationen
		System.out.println("Kundeninformationen:");
		System.out.println("Kunde: " + kunde1.getName() + ", Adresse: " + kunde1.getAdresse());
		System.out.println("Kunde: " + kunde2.getName() + ", Adresse: " + kunde2.getAdresse());
		System.out.println();

		// Ausgabe der Kontoinformationen
        System.out.println("Kontoinformationen:");
        System.out.println(giroKonto1);
        System.out.println("Kann 1500 EUR abheben: " + giroKonto1.pruefeUeberziehung(1500));
        System.out.println(sparKonto1);
        System.out.println("Zinsen auf Sparkonto: " + sparKonto1.berechneZinsen() + " EUR");
        System.out.println();

		// Ausgabe der Aktieninformationen
		System.out.println("Aktieninformationen:");
		System.out.println(aktie1);
		System.out.println(aktie2);
		System.out.println();

		// Ausgabe des Darlehensvertrags
		System.out.println("Darlehensvertrag:");
		System.out.println(darlehen);
	}
}
