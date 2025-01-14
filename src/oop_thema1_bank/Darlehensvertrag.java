package oop_thema1_bank;

public class Darlehensvertrag {
    // Attribute
    private String vertragsId;          // Eindeutige ID des Vertrags
    private Kunde kreditnehmer;         // Kunde-Objekt
    private double kreditbetrag;        // Der Kreditbetrag
    private double zinssatz;            // Zinssatz in Prozent
    private int laufzeit;               // Laufzeit in Monaten

    // Konstruktor
    public Darlehensvertrag(String vertragsId, Kunde kreditnehmer, double kreditbetrag, double zinssatz, int laufzeit) {
        this.vertragsId = vertragsId;
        this.kreditnehmer = kreditnehmer;
        this.kreditbetrag = kreditbetrag;
        this.zinssatz = zinssatz;
        this.laufzeit = laufzeit;
    }

    // Methode zur Berechnung der monatlichen Rate
    public double berechneMonatsrate() {
        double zinssatzMonatlich = (zinssatz / 100) / 12;
        return (kreditbetrag * zinssatzMonatlich) / (1 - Math.pow(1 + zinssatzMonatlich, -laufzeit));
    }

    // Überschreiben der toString-Methode
    @Override
    public String toString() {
        return String.format(
            "Vertrag ID: %s, Kreditnehmer: %s\nKreditbetrag: %.2f EUR, Zinssatz: %.2f%%, Laufzeit: %d Monate\nMonatliche Rate: %.2f EUR",
            vertragsId, kreditnehmer.getName(), kreditbetrag, zinssatz, laufzeit, berechneMonatsrate()
        );
    }
}
