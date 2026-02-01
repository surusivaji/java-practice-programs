package arrays;

import java.util.Arrays;

public class MergeArray {
	
	public static int[] merge(int[] arr1, int[] arr2) {
		int[] merge = new int[arr1.length+arr2.length];
		int index = 0;
		for (int i=0; i<arr1.length; i++) {
			merge[index++] = arr1[i];
		}
		for (int j=0; j<arr2.length; j++) {
			merge[index++] = arr2[j];
		}
		return merge;
	}
	
	public static void main(String[] args) {
		int[] arr1 = {1, 2, 3, 4, 5};
		int[] arr2 = {6, 7, 8, 9, 10};
		System.out.println("Merge array: "+Arrays.toString(merge(arr1, arr2)));
	}

}
