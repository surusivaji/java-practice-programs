package arrays;

import java.util.Arrays;

public class ShiftAllZeros {

	public static int[] shift(int[] arr) {
		int index = 0;
		for (int i=0; i<arr.length; i++) {
			if (arr[i]!=0) {
				arr[index] = arr[i];
				index++;
			}
		}
		for (int i=index; i<arr.length; i++) {
			arr[index++] = 0;
		}
		return arr;
	}
	
	public static void main(String[] args) {
		int[] arr = {1, 0, 1, 2, 0, 3, 2, 0, 1};
		System.out.println(Arrays.toString(shift(arr)));
	}
	
}
