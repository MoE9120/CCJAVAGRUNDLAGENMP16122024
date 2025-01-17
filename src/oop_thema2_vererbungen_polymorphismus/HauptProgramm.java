package oop_thema2_vererbungen_polymorphismus;

public class HauptProgramm {

	public static void main(String[] args) {
		
		Fahrzeug fahrzeug = new Fahrzeug();
		
		fahrzeug = new Auto(); // Jetzt zeigt die Variable auf ein anderes Objekt
		fahrzeug.starte();
		
		((Auto)fahrzeug).klimaanlageEinschalten(); // Downcasting
		
		fahrzeug = new Motorrad();
		
		if (fahrzeug instanceof Auto) {
			Auto auto = (Auto) fahrzeug;
			auto.klimaanlageEinschalten();
		}
		else {
			System.err.println("Das Fahrzeug ist kein Auto");
		}
		

	}

}
