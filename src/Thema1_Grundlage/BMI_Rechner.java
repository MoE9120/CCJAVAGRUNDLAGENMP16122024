package Thema1_Grundlage;

import utils.IO;

public class BMI_Rechner {

	public static void main(String[] args) {

		System.out.println("BMI-Rechner");

		String name = IO.promptAndReadString("Bitte Namen eingeben: ");

		double groesse = IO.promptAndReadDouble("Bitte Größe eingeben: ");
		;
		double gewicht = IO.promptAndReadDouble("Bitte Gewicht eingeben: ");
		;
		double bmi = gewicht / (groesse * groesse);
		double gerunderterBmi = IO.round(bmi * 100.0, 0) / 100.0;
		IO.writeln(name + ", dein BMI beträgt " + gerunderterBmi);
	}

}