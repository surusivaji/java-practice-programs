package arrays;

import java.util.Arrays;

public class LeftRotation {
	
	public static int[] rotation(int[] arr, int rotate) {
		for (int i=1; i<=rotate; i++) {
			int temp = arr[0];
			for (int j=0; j<arr.length-1; j++) {
				arr[j] = arr[j+1];
			}
			arr[arr.length-1] = temp;
		}
		return arr;
	}
	
	public static void main(String[] args) {
		int[] arr = {1, 2, 3, 4, 5};
		System.out.println(Arrays.toString(rotation(arr, 2)));
	}

}
