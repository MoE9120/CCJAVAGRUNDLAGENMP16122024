package oop_thema2_vererbungen_polymorphismus_saeugetiere;

public class HauptProgramm {

	public static void main(String[] args) {

		Saeugetier hund = new Hund("Bello");
		Saeugetier katze = new Katze("Minka");

		Saeugetier[] saeugetiere = { hund, katze };

		for (Saeugetier saeugetier : saeugetiere) {
			System.out.println("Name: " + saeugetier.name);
			saeugetier.macheGeräusch();
			saeugetier.bewegeDich();

			// Aufruf von spiele() nur bei korrektem Typ
            if (saeugetier instanceof Hund) {
                Hund h = (Hund) saeugetier;
                h.spiele();
            } else if (saeugetier instanceof Katze) {
                Katze k = (Katze) saeugetier;
                k.spiele();
            }

            System.out.println();

		}

	}
}
