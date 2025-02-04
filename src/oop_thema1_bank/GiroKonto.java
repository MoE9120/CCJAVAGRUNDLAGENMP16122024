// Subklasse GiroKonto
package oop_thema1_bank;

public class GiroKonto extends Bankkonto implements Ueberziehbar {

    private double dispoLimit;

    public GiroKonto(String kontoNummer, double kontoStand, double dispoLimit) {
        super(kontoNummer, kontoStand);
        this.dispoLimit = dispoLimit;
    }

    @Override
    public boolean ueberziehungPruefen(double betrag) {
        return (kontoStand - betrag) >= -dispoLimit;
    }

    @Override
    public void abrechnung() {
        if (kontoStand < 0) {
            double gebuehr = Math.abs(kontoStand) * 0.05; // 5% Gebühr für Überziehungen
            kontoStand -= gebuehr;
            System.out.println("Überziehungsgebühr abgezogen: " + gebuehr + " EUR");
        }
    }

    @Override
    public String toString() {
        return "Kontonummer: " + getKontonummer() + "\n" +
               "Kontostand: " + String.format("%.2f", getKontostand()) + " EUR\n" +
               "Kontotyp: GiroKonto\n" +
               "Dispo-Limit: " + String.format("%.2f", getDispoLimit()) + " EUR\n";
    }



	public String getDispoLimit() {
		// TODO Auto-generated method stub
		return null;
	}
}