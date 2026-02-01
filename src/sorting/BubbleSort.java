package sorting;

import java.util.Arrays;

public class BubbleSort {
	
	public static int[] sort(int[] arr) {
		for (int i=0; i<arr.length; i++) {
			for (int j=i+1; j<arr.length; j++) {
				if (arr[i]>arr[j]) {
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
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
