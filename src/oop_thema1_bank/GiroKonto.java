package oop_thema1_bank;

public class GiroKonto extends Bankkonto {

    private double ueberziehungsLimit; // Überziehungslimit für das Girokonto

    public GiroKonto(String kontoNummer, Kunde kontoInhaber, double kontoStand, double ueberziehungsLimit) {
        super(kontoNummer, kontoInhaber, kontoStand);
        this.ueberziehungsLimit = ueberziehungsLimit;
    }

    public boolean pruefeUeberziehung(double betrag) {
        return (getKontostand() - betrag) >= -ueberziehungsLimit;
    }

    @Override
    public String toString() {
        return super.toString() + String.format(", Überziehungslimit: %.2f EUR", ueberziehungsLimit);
    }
}