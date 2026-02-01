package arrays;

import java.util.Arrays;

public class EvenElements {
	
	public static void printEvenElements(int[] arr) {
		for (int i=0; i<arr.length; i++) {
			if (arr[i]%2==0) {
				System.out.print(arr[i]+" ");
			}
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
		int[] arr = {10, 15, 5, 20, 25, 30, 35, 40};
		System.out.println(Arrays.toString(arr));
		printEvenElements(arr);
	}

}
