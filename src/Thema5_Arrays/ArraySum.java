package Thema5_Arrays;

public class ArraySum {

	public static void main(String[] args) {

		int [] numbers = {13, 24, 5, 5897, 2, 2, 30, 54, 10};
		
		int sum = 0;
		for (int i = 0; i < numbers.length; i++) {
			// sum = sum + numbers[i];
			sum += numbers[i];
		}
		
		System.out.println("Die Summe der Zahl im Array beträgt: " + sum);
	}

}