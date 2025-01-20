// Hauptprogramm
package oop_thema1_bank;

public class Hauptprogramm {
    public static void main(String[] args) {

        // Erstellung von Konten
        SparKonto sparKonto = new SparKonto("123456", 5000.0, 2.0);
        GiroKonto giroKonto = new GiroKonto("654321", 1000.0, 500.0);

        // Aktionen für SparKonto
        System.out.println(sparKonto);
        sparKonto.abrechnung();
        System.out.println("Nach Abrechnung: " + sparKonto);

        // Aktionen für GiroKonto
        System.out.println(giroKonto);
        giroKonto.einzahlen(300);
        System.out.println("Nach Einzahlung: " + giroKonto);
        System.out.println("Kann 2000 EUR abheben: " + giroKonto.ueberziehungPruefen(2000));
        giroKonto.abrechnung();
        System.out.println("Nach Abrechnung: " + giroKonto);
    }
}