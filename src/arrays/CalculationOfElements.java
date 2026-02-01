package arrays;

import java.util.Arrays;

public class CalculationOfElements {
	
	public static int summationOfElements(int[] arr) {
		int sum = 0;
		for (int i=0; i<arr.length; i++) {
			sum = sum+arr[i];
		}
		return sum;
	}
	
	public static int productOfElements(int[] arr) {
		int product = 1;
		for (int i=0; i<arr.length; i++) {
			product *= arr[i];
		}
		return product;
	}
	
	public static int summationOfEvenElements(int[] arr) {
		int sum = 0;
		for (int element : arr) {
			if (element%2==0) {
				sum += element;
			}
		}
		return sum;
	}
	
	public static int countOddElements(int[] arr) {
		int count = 0;
		for (int num : arr) {
			if (num%2==1) {
				count++;
			}
		}
		return count;
	}
	
	public static boolean isPrime(int num) {
		int count = 0;
		for (int i=1; i<=num; i++) {
			if (num%i==0) {
				count++;
			}
		}
		return count==2;
	}
	
	public static int countPrimeElements(int[] arr) {
		int count = 0;
		for (int num : arr) {
			if (isPrime(num)) 
				count++;
		}
		return count;
	}
	
	public static void main(String[] args) {
		int[] arr = {1, 2, 3, 4, 5};
		System.out.println("Array: "+Arrays.toString(arr));
		System.out.println("Sum: "+summationOfElements(arr));
		System.out.println("Product: "+productOfElements(arr));
		System.out.println("Sum of even elements: "+summationOfElements(arr));
		System.out.println("Count of odd elements: "+countOddElements(arr));
		System.out.println("Count of prime elements: "+countPrimeElements(arr));
	}

}
