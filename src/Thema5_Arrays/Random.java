package Thema5_Arrays;

import java.util.random.RandomGenerator;

public class Random {

	public static void main(String[] args) {
		int [] zufallsZahlen;
		zufallsZahlen = new int[1000];
		
		for(int i = 0; i < zufallsZahlen.length; i++) {
			Random random = new Random();
			zufallsZahlen[i] = 1 + ((RandomGenerator) random).nextInt(200);
		}
		
		// Ausgabe
		for(int j = 0; j < zufallsZahlen.length; j++) {
			System.out.print(zufallsZahlen[j] + " ");
		}
		
	}

	public int nextInt(int i) {
		// TODO Auto-generated method stub
		return 0;
	}
}
