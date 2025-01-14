package oop_thema2_vererbungen_Koenigsfamilie;

//Superklasse: George VI und Elizabeth
public class QueenElizabeth extends Monarch {
	private String responsibility = "Head of State";
	protected int anzahlAutos = 5;

	public void displayResponsibilities() {
		System.out.println("Responsibility: " + responsibility);
	}

	public int getAnzahlAutos() {
		return anzahlAutos;
	}

	public void setAnzahlAutos(int anzahlAutos) {
		this.anzahlAutos = anzahlAutos;
	}
}
