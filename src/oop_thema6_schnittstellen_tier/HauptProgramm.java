package oop_thema6_schnittstellen_tier;

public class HauptProgramm {

	public static void main(String[] args) {
		
		Tier meinHund = new Hund();
		Tier meineKatze = new Katze();
		
		meinHund.laufen();
		meinHund.fressen();
		meineKatze.laufen();
		meineKatze.fressen();
		
	}

	
}
