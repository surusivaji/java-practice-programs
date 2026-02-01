package arrays;

import java.util.Arrays;

public class LargestAndSmallestElements {
	
	public static int largestElement(int[] arr) {
		int largest = arr[0];
		for (int i=1; i<arr.length; i++) {
			if (arr[i]>largest) 
				largest = arr[i];
		}
		return largest;
	}
	
	public static int smallestElement(int[] arr) {
		int smallest = arr[0];
		for (int i=1; i<arr.length; i++) {
			if (arr[i]<smallest) {
				smallest = arr[i];
			}
		}
		return smallest;
	}
	
	public static void main(String[] args) {
		int[] arr = {20, 15, 10, 5, 19, 30, 55, 25};
		System.out.println("Array: "+Arrays.toString(arr));
		System.out.println("Smallest element: "+smallestElement(arr));
		System.out.println("Largest element: "+largestElement(arr));
	}

}
