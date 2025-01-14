package oop_thema1_bank;

public class Bank {

	public final static String name = "Sparkasse";
	public final static int anzahlKonten = 2;

	public static void printBankInfo() {
		System.out.println("Bank: " + name);
		System.out.println("Anzahl Konten: " + anzahlKonten);
	}
}
