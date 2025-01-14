package oop_thema1_bank;

public class Bankkonto {

    // Attribute
    private String kontonummer;
    private double kontostand;
    private String kontoinhaber;

    // Konstruktor
    public Bankkonto(String kontonummer, String kontoinhaber, double kontostand) {
        this.kontonummer = kontonummer;
        this.kontoinhaber = kontoinhaber;
        this.kontostand = kontostand;
    }

    // Getter und Setter
    public String getKontonummer() {
        return kontonummer;
    }

    public void setKontonummer(String kontonummer) {
        this.kontonummer = kontonummer;
    }

    public double getKontostand() {
        return kontostand;
    }

    public void setKontostand(double kontostand) {
        this.kontostand = kontostand;
    }

    public String getKontoinhaber() {
        return kontoinhaber;
    }

    public void setKontoinhaber(String kontoinhaber) {
        this.kontoinhaber = kontoinhaber;
    }

    // Beispielmethoden
    public void einzahlen(double betrag) {
        if (betrag > 0) {
            kontostand += betrag;
            System.out.println("Es wurden " + betrag + " EUR eingezahlt. Neuer Kontostand: " + kontostand);
        } else {
            System.out.println("Ungültiger Betrag!");
        }
    }

    @Override
    public String toString() {
        return String.format("Kontonummer: %s, Kontoinhaber: %s, Kontostand: %.2f EUR", 
                              kontonummer, kontoinhaber, kontostand);
    }
}
