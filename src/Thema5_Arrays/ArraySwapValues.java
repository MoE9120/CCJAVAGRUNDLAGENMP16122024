package Thema5_Arrays;

public class ArraySwapValues {

	public static void main(String[] args) {
		
		int [] arr = {4, 2, 10, 3, -5, 0, 17};
		int index1 = 3;
		int index2 = 5;
		
		System.out.println("Vorher:");
		ArrayUtil.printArray(arr);
		swap(arr, index1, index2);	
		System.out.println("Nachher:");
		ArrayUtil.printArray(arr);
	}

	private static void swap(int[] arr, int index1, int index2) {
		int temp = arr[index1];
		arr[index1] = arr[index2];
		arr[index2] = temp;
	}
	
}