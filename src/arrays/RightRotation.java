package arrays;

import java.util.Arrays;

public class RightRotation {
	
	public static int[] rotation(int[] arr, int rotate) {
		for (int i=1; i<=rotate; i++) {
			int temp = arr[arr.length-1];
			for (int j=arr.length-1; j>0; j--) {
				arr[j] = arr[j-1];
			}
			arr[0] = temp;
		}
		return arr;
	}
	
	public static void main(String[] args) {
		int[] arr = {1, 2, 3, 4, 5};
		int rotate = 2;
		System.out.println(Arrays.toString(rotation(arr, rotate)));
	}

}
