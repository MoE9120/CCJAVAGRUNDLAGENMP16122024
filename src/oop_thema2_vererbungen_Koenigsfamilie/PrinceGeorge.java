package oop_thema2_vererbungen_Koenigsfamilie;

//Subklasse: Prince George
public class PrinceGeorge extends PrinceWilliam {
	private int anzahlFliegendeAutos = 9;

	public void displayAutos() {

		int summe = getAnzahlAutos() + anzahlFliegendeAutos;

		System.out.println("Anzahl Autos: " + summe);
	}
}