package oop_thema2_vererbungen_polymorphismus_saeugetiere;

public abstract class Saeugetier {

	public String name;

	public Saeugetier(String name) {
		this.name = name;
	}

	public void bewegeDich() {
		System.out.println("Das Tier bewegt sich.");
	}

	public void macheGeräusch() {
		System.out.println("Das Tier macht ein Geräusch.");
	}

	public void spiele() {
		System.out.println("Das Tier spielt.");
	}

}
