package Koenigsfamilie;

//Hauptprogramm
public class HauptProgramm {
	public static void main(String[] args) { // Objekt von Prince George erstellen
		PrinceGeorge george = new PrinceGeorge(); // Methoden aufrufen
		george.displayInfo(); // Von der Superklasse"Monarch"
		george.displayResponsibilities(); // Von der Subklasse"QueenElizabeth"
		george.displayFullname(); // Von der Subklasse"PrinceCharles"
		george.displayGeneration(); // Von der Subklasse"PrinceWilliam"
		george.displayAutos(); // Von der Subklasse"PrinceGeorge"
	}
}