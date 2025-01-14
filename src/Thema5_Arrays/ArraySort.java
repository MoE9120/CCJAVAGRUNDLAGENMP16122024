package Thema5_Arrays;

import java.util.Arrays;

public class ArraySort {

	public static void main(String[] args) {
		
		int [] feld1GeradeZahlen = new int [20];
		int [] feld2AufsteigendSortiert = new int [20];
		
		for (int i = 0; i < 20; i++) {
			feld1GeradeZahlen[i] = (int) (Math.random() * 50) * 2;
			feld2AufsteigendSortiert[i] = (int) (Math.random() * 100);
		}
	
		Arrays.sort(feld2AufsteigendSortiert);
		
		System.out.println(Arrays.toString(feld1GeradeZahlen));
		System.out.println(Arrays.toString(feld2AufsteigendSortiert));
	}

}