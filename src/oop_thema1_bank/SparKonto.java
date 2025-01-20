// Subklasse SparKonto
package oop_thema1_bank;

public class SparKonto extends Bankkonto implements Zinsfaehig {

    private double zinssatz;

    public SparKonto(String kontoNummer, double kontoStand, double zinssatz) {
        super(kontoNummer, kontoStand);
        this.zinssatz = zinssatz;
    }

    @Override
    public double zinsenBerechnen() {
        return kontoStand * (zinssatz / 100);
    }

    @Override
    public void abrechnung() {
        double zinsen = zinsenBerechnen();
        kontoStand += zinsen;
        System.out.println("Zinsen hinzugefügt: " + zinsen + " EUR");
    }

    @Override
    public String toString() {
        return super.toString() + String.format(", Zinssatz: %.2f%%", zinssatz);
    }
}