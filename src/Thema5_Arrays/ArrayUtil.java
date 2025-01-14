package Thema5_Arrays;

public class ArrayUtil {

	public static void printArray(int[] arr) {
		System.out.print("[");
		for (int i = 0; i < arr.length; i++) {
			String comma = (i == arr.length-1) ? "" : ",";
			System.out.print(arr[i] + comma + " ");
		}
		System.out.println("]");
	}
}