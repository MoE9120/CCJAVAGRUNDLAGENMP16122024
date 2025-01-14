package oop_thema2_vererbungen_Koenigsfamilie;

//Subklasse: Prince Charles
public class PrinceCharles extends QueenElizabeth {
private String firstName = "Charles";

public void displayFullname () {
System.out.println("Name: " + firstName + " " +
familyName);
}
}