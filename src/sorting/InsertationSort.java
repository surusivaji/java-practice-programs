package sorting;

import java.util.Arrays;

public class InsertationSort {
	
	public static int[] sort(int[] arr) {
		for (int i=1; i<arr.length; i++) {
			int element = arr[i];
			int j = i-1;
			while (j>=0 && element < arr[j]) {
				arr[j+1] = arr[j];
				j--;
			}
			arr[j+1] = element;
		}
		return arr;
	}
	
	public static void main(String[] args) {
		int[] arr = {3, 1, 2, 4, 5, 9, 7, 6, 10, 8};
		System.out.println(Arrays.toString(sort(arr)));
	}

}
