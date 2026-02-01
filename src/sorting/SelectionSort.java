package sorting;

import java.util.Arrays;

public class SelectionSort {
	
	public static int[] sort(int[] arr) {
		for (int i=0; i<arr.length; i++) {
			int index = i;
			for (int j=i+1; j<arr.length; j++) {
				if (arr[index]>arr[j]) {
					index = j;
				}
			}
			if (index!=i) {
				int temp = arr[i];
				arr[i] = arr[index];
				arr[index] = temp;
			}
		}
		return arr;
	}
	
	public static void main(String[] args) {
		int[] arr = {3, 1, 2, 4, 5, 9, 7, 6, 10, 8};
		System.out.println("Before Sorting: "+Arrays.toString(arr));
		System.out.println("After Sorting: "+Arrays.toString(sort(arr)));
	}

}
