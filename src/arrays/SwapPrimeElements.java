package arrays;

import java.util.Arrays;

public class SwapPrimeElements {
	
	public static boolean isPrime(int num) {
		int count = 0;
		for (int i=1; i<=num; i++) {
			if (num%i==0) {
				count++;
			}
		}
		return count==2;
	}
	
	public static int[] swapPrimeNumbers(int[] arr) {
		int first = -1;
		int second = -1;
		for (int i=0; i<arr.length; i++) {
			if (isPrime(arr[i])) {
				if (first==-1) {
					first = i;
				}
				else {
					second = i;
				}
			}
			if (second!=-1) {
				int temp = arr[first];
				arr[first] = arr[second];
				arr[second] = temp;
				first = -1;
				second = -1;
			}
		}
		return arr;
	}
	
	public static void main(String[] args) {
		int[] arr = {4, 5, 8, 9, 7, 10, 13};
		System.out.println("Before swapping: "+Arrays.toString(arr));
		System.out.println("After swapping: "+Arrays.toString(swapPrimeNumbers(arr)));
	}

}
