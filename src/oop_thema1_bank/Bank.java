package oop_thema1_bank;

import java.util.ArrayList;

public class Bank {

    private ArrayList<Bankkonto> konten;

    public Bank() {
        this.konten = new ArrayList<>();
    }

    // Methode, um die Liste der Konten zurückzugeben
    public ArrayList<Bankkonto> getKontenList() {
        return this.konten;
    }

    // Alternative Methode: getKonten() (alias für getKontenList)
    public ArrayList<Bankkonto> getKonten() {
        return this.konten;
    }

    // Methode zum Hinzufügen eines Kontos
    public void kontoHinzufuegen(Bankkonto konto) {
        konten.add(konto);
    }

    // Methode zum Entfernen eines Kontos anhand der Kontonummer
    public void kontoEntfernen(String kontonummer) {
        for (Bankkonto konto : konten) {
            if (konto.getKontonummer().equals(kontonummer)) {
                konten.remove(konto);
                System.out.println("Konto mit Kontonummer " + kontonummer + " entfernt.");
                return;
            }
        }
        System.out.println("Konto mit Kontonummer " + kontonummer + " nicht gefunden.");
    }

    // Methode zum Abrufen eines Kontos anhand der Kontonummer
    public Bankkonto getKonto(String kontonummer) {
        for (Bankkonto konto : konten) {
            if (konto.getKontonummer().equals(kontonummer)) {
                return konto;
            }
        }
        return null;
    }

    // Methode zum Anzeigen aller Konten
    public void zeigeAlleKonten() {
        if (konten.isEmpty()) {
            System.out.println("Keine Konten vorhanden.");
        } else {
            for (Bankkonto konto : konten) {
                System.out.println("Kontonummer: " + konto.getKontonummer());
                System.out.println("Kontostand: " + String.format("%.2f", konto.getKontostand()) + " EUR");
                if (konto instanceof SparKonto) {
                    System.out.println("Kontoart: SparKonto");
                } else if (konto instanceof GiroKonto) {
                    System.out.println("Kontoart: GiroKonto");
                }
                System.out.println(); // Leerzeile für bessere Lesbarkeit
            }
        }
    }
}
