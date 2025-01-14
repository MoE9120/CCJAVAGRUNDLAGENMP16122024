package Thema5_Arrays;

public class RndProgramm {

	public static void main(String[] args) {
		
			int [] zufallsZahlen;
			zufallsZahlen = new int[1000];
			
			for(int i = 0; i < zufallsZahlen.length; i++) {
				Random random = new Random();
				zufallsZahlen[i] = 1 + random.nextInt(200);
			}
			
			// Ausgabe
			for(int j = 0; j < zufallsZahlen.length; j++) {
				System.out.print(zufallsZahlen[j] + " ");
			}
			
		}
	}