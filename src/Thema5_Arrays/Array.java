package Thema5_Arrays;

public class Array {

	public static void main(String[] args) {
		
		int [] alterListe = new int[5];
		alterListe[0] = 12;
		alterListe[1] = 22;
		alterListe[2] = 2;
		alterListe[3] = 30;
		alterListe[4] = 50;
		
//		System.out.println(ages[0]);
//		System.out.println(ages[1]);
//		System.out.println(ages[2]);
//		System.out.println(ages[3]);
//		System.out.println(ages[4]);
		
//		for(int i=0; i < alterListe.length; i++) {
//			System.out.println(alterListe[i]);
//		}
		
		for(int age : alterListe) {
			System.out.println(age);
		}
		
		
//		String[] names ;
//		names = new String[2];
//		names[0] = "Timo";
//		names[1] = "Toni";
//		
//		for(int i = 0; i<names.length; i++) {
//			System.out.println(names[i]);
//		}
	}

}