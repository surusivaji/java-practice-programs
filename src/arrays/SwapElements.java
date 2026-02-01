package arrays;

import java.util.Arrays;

public class SwapElements {
	
	public static int[] swapElements(int[] arr) {
		for (int i=0; i<arr.length-1; i++) {
			int temp = arr[i];
			arr[i] = arr[i+1];
			arr[i+1] = temp;
			i++;
		}
		return arr;
	}
	
	public static void main(String[] args) {
		int[] arr = {1, 2, 3, 4, 5};
		System.out.println("Swapping: "+Arrays.toString(swapElements(arr)));
	}

}
