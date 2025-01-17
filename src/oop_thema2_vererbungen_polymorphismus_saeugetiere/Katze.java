package oop_thema2_vererbungen_polymorphismus_saeugetiere;

public class Katze extends Saeugetier {

	public Katze(String name) {
		super(name);
	}

	@Override
	public void bewegeDich() {
		System.out.println("Die katze schleicht.");
	}

	@Override
	public void macheGeräusch() {
		System.out.println("Miau!");
	}

	@Override
	public void spiele() {
		System.out.println("Die Katze spielt mit einem Wollknäuel.");
	}

}
