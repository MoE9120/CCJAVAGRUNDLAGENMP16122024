package oop_thema6_schnittstellen_tier;

public class Katze implements Tier {

	@Override
	public void laufen() {
		System.out.println("Die Katze läuft.");
	}
	
	@Override
	public void fressen() {
		System.out.println("Die Katze frisst.");
	}
}
