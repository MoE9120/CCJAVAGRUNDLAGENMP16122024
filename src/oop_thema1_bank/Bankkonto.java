// Abstrakte Klasse Bankkonto
package oop_thema1_bank;

public abstract class Bankkonto {

    protected String kontoNummer;
    protected double kontoStand;

    public Bankkonto(String kontoNummer, double kontoStand) {
        this.kontoNummer = kontoNummer;
        this.kontoStand = kontoStand;
    }

    public String getKontonummer() {
        return kontoNummer;
    }

    public double getKontostand() {
        return kontoStand;
    }

    public void einzahlen(double betrag) {
        if (betrag > 0) {
            kontoStand += betrag;
        }
    }

    public abstract void abrechnung();

    @Override
    public String toString() {
        return String.format("Kontonummer: %s, Kontostand: %.2f EUR", kontoNummer, kontoStand);
    }
}



