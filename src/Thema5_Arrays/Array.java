package Thema5_Arrays;

public class Array {

	public static void main(String[] args) {
		int [] ages = new int[5];
		ages[0] = 12;
		ages[1] = 22;
		ages[2] = 2;
		ages[3] = 30;
		ages[4] = 50;
		
//		System.out.println(ages[0]);
//		System.out.println(ages[1]);
//		System.out.println(ages[2]);
//		System.out.println(ages[3]);
//		System.out.println(ages[4]);
		
//		for(int i=0; i < ages.length; i++) {
//			System.out.println(ages[i]);
//		}
		
		for(int age : ages) {
			System.out.println(age);
		}
		
		String [] names; {
		names = new String [2];
		names [0] = "Timo";
		names [1] = "Toni";
		
		for (int y = 0; y < names.length; y++) {
			System.out.println(names [y]);
		}
	}

}
}
