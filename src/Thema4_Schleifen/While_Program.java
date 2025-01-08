package Thema4_Schleifen;

public class While_Program {

	public static void main(String[] args) {
		
		int countdown = 10;
		
		while (countdown > 0) {
			System.out.println("Noch " + countdown + " Sekunden...");
			countdown--;
		try {
			Thread.sleep(1000);
		}	catch (InterruptedException e) {
			System.err.println ("Fehler bei der Verzögerung: " + e.getMessage());
		}
			
		}
		System.out.println("Start!");
	}

}
