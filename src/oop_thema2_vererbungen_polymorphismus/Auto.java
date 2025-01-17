package oop_thema2_vererbungen_polymorphismus;

public class Auto extends Fahrzeug {
	
	@Override
	public void starte() {
		System.out.println("Auto startet");
	}
	
	public void klimaanlageEinschalten() {
		System.out.println("Klimaanlage gestartet");
	}

}
