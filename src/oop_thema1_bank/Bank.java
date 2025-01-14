package oop_thema1_bank;

public class Bank {

	public final static String Name = "Halsabschneiderbank";
	public final static int anzahlKonten = 2;
	
	public void printBankInfo() {
		System.out.println("Bank: " + Name);
		System.out.println("Anzahl Konten: " + anzahlKonten);
	}
}
