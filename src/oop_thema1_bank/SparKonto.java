package oop_thema1_bank;

public class SparKonto extends Bankkonto {

    private double zinssatz; // Zinssatz für das Sparkonto

    public SparKonto(String kontoNummer, Kunde kontoInhaber, double kontoStand, double zinssatz) {
        super(kontoNummer, kontoInhaber, kontoStand);
        this.zinssatz = zinssatz;
    }

    public double berechneZinsen() {
        return getKontostand() * (zinssatz / 100);
    }

    @Override
    public String toString() {
        return super.toString() + String.format(", Zinssatz: %.2f%%", zinssatz);
    }
}