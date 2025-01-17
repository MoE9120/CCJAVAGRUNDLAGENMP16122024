package oop_thema2_vererbungen_polymorphismus_saeugetiere;

public class Hund extends Saeugetier {

	public Hund(String name) {
		super(name);
	}

	@Override
	public void bewegeDich() {
		System.out.println("Der Hund läuft.");
	}

	@Override
	public void macheGeräusch() {
		System.out.println("Wuff!");
	}

	@Override
	public void spiele() {
		System.out.println("Der Hund spielt mit einem Ball.");
	}

}
