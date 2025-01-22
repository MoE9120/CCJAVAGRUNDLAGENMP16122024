package oop_thema1_bank;

public class SparKonto extends Bankkonto implements Zinsfaehig {

    private double zinssatz;

    public SparKonto(String kontoNummer, double kontoStand, double zinssatz) {
        super(kontoNummer, kontoStand);
        this.zinssatz = zinssatz;
    }

    @Override
    public double zinsenBerechnen() {
        return getKontostand() * (zinssatz / 100);
    }

    @Override
    public void abrechnung() {
        double zinsen = zinsenBerechnen();
        setKontostand(getKontostand() + zinsen);
        System.out.println("Zinsen hinzugefügt: " + String.format("%.2f", zinsen) + " EUR");
    }

    private void setKontostand(double d) {
		// TODO Auto-generated method stub
		
	}

	@Override
    public double getZinssatz() {
        return zinssatz; // Gibt den Zinssatz zurück
    }

    @Override
    public String toString() {
        return "Kontonummer: " + getKontonummer() + "\n" +
               "Kontostand: " + String.format("%.2f", getKontostand()) + " EUR\n" +
               "Kontotyp: SparKonto\n" +
               "Zinssatz: " + String.format("%.2f", getZinssatz()) + "%\n";
    }
}
