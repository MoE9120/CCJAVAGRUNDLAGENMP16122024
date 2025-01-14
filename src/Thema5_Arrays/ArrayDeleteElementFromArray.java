package Thema5_Arrays;

public class ArrayDeleteElementFromArray {

	public static void main(String[] args) {

		int [] arr = {3, 4, 1, 9, 9, -5, 4};
		int elementToDelete = 9;
		
		System.out.println("Feld:");
		ArrayUtil.printArray(arr);
		System.out.println("Zu löschendes Element: " + elementToDelete);
		ArrayUtil.printArray(deleteArrayElement(arr, elementToDelete));
	}

	private static int[] deleteArrayElement(int[] arr, int elementToDelete) {

		int index = -1;
		for (int i = 0; i < arr.length; i++) {
			if(arr[i] == elementToDelete) {
				index = i;
				break;
			}
		}
		
		if(index == -1) {
			return arr;
		}
		
		for (int i = index; i < arr.length-1; i++) {
			arr[i] = arr[i+1];
		}
		
		int[] newArray = new int[arr.length-1];
		System.arraycopy(arr, 0, newArray, 0, newArray.length);
		return newArray;
	}	
}