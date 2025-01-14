package oop_thema1_bank;

public class Bankkonto {

    // Attribute
    private String kontoNummer;
    
    private double kontoStand;
    
    private Kunde kontoInhaber;

    // Konstruktor
    public Bankkonto(String kontoNummer, Kunde kontoInhaber, double kontoStand) {
        this.kontoNummer = kontoNummer;
        this.kontoInhaber = kontoInhaber;
        this.kontoStand = kontoStand;
    }

    // Getter und Setter
    public String getKontonummer() {
        return kontoNummer;
    }

    public void setKontonummer(String kontoNummer) {
        this.kontoNummer = kontoNummer;
    }

    public double getKontostand() {
        return kontoStand;
    }

    public void setKontostand(double kontoStand) {
        this.kontoStand = kontoStand;
    }

    public Kunde getKontoinhaber() {
        return kontoInhaber;
    }

    public void setKontoinhaber(Kunde kontoInhaber) {
        this.kontoInhaber = kontoInhaber;
    }

    // Beispielmethoden
    public void einzahlen(double betrag) {
        if (betrag > 0) {
            kontoStand += betrag;
            System.out.println("Es wurden " + betrag + " EUR eingezahlt. Neuer Kontostand: " + kontoStand);
        } else {
            System.out.println("Ungültiger Betrag!");
        }
    }

    @Override
    public String toString() {
        return String.format("Kontonummer: %s, Kontoinhaber: %s, Kontostand: %.2f EUR", 
                              kontoNummer, kontoInhaber, kontoStand);
    }
}
