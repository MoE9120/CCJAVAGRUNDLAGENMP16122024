package Mathe;

public class HauptProgramm {

	public static void main(String[] args) {
		
		double radius = 2.3;
		
		matheUtils meinMatheUtils = new matheUtils();
		
		// double kreisFlaeche = MatheUtils.PI * radius * radius;
		System.out.println("Fläche: " + meinMatheUtils.kreisFlaeche(radius));
		
		
		System.out.println("Fläche: " + matheUtils.kreisFlaeche2(radius));
	}

}