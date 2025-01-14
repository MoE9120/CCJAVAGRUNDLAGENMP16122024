package oop_thema1_bank;

public class Aktie {
    // Attribute
    private String isin;           // Eindeutige Kennung der Aktie
    private String unternehmen;    // Name des Unternehmens
    private double preis;          // Aktueller Preis der Aktie

    // Konstruktor
    public Aktie(String isin, String unternehmen, double preis) {
        this.isin = isin;
        this.unternehmen = unternehmen;
        this.preis = preis;
    }

    // Getter und Setter
    public String getIsin() {
        return isin;
    }

    public void setIsin(String isin) {
        this.isin = isin;
    }

    public String getUnternehmen() {
        return unternehmen;
    }

    public void setUnternehmen(String unternehmen) {
        this.unternehmen = unternehmen;
    }

    public double getPreis() {
        return preis;
    }

    public void setPreis(double preis) {
        this.preis = preis;
    }

    // Methode zur Aktualisierung des Preises
    public void aktualisierePreis(double neuerPreis) {
        this.preis = neuerPreis;
    }

    // Überschreiben der toString-Methode
    @Override
    public String toString() {
        return "Aktie: " + isin + ", Unternehmen: " + unternehmen + ", Preis: " + preis + " EUR";
    }
}
