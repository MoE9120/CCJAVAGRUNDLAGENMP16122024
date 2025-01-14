package oop_thema2_vererbungen_Koenigsfamilie;

//Subklasse: Prince William
public class PrinceWilliam extends PrinceCharles {
	private int generationNumber = 3;

	public void displayGeneration() {
		System.out.println("Generation: " + generationNumber);
	}
}