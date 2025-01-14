package Thema5_Arrays;

public class ArrayGroesstesElement {

	public static void main(String[] args) {
int [] array = {5, 12, 7, 19, 12, 7};
		
		int max = findeGrosstesElement(array);
		System.out.println("Max: " + max);
	}

	public static int findeGrosstesElement(int[] array) {
		int max = array[0];
		for (int i = 0; i < array.length; i++) {
			if(array[i] > max) {
				max = array[i];
			}
		}
		
		return max;
	}
}