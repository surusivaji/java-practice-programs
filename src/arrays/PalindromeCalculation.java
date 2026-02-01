package arrays;

import java.util.Arrays;

public class PalindromeCalculation {
	
	public static boolean isPalindrome(int num) {
		int temp = num;
		int reverse = 0;
		while (temp!=0) {
			int digit = temp%10;
			reverse = reverse*10+digit;
			temp = temp/10;
		}
		return reverse==num;
	}
	
	public static int countPalindromes(int[] arr) {
		int count = 0;
		for (int i=0; i<arr.length; i++) {
			if (isPalindrome(arr[i])) {
				count++;
			}
		}
		return count;
	}
	
	public static int summationOfPalindromeElements(int[] arr) {
		int sum = 0;
		for (int i=0; i<arr.length; i++) {
			if (isPalindrome(arr[i])) {
				sum += arr[i];
			}
		}
		return sum;
	}
	
	public static int productOfPalindromeElements(int[] arr) {
		int product = 1;
		for (int i=0; i<arr.length; i++) {
			if (isPalindrome(arr[i])) {
				product *= arr[i];
			}
		}
		return product;
	}
	
	public static void main(String[] args) {
		int[] arr = {22, 33, 44, 12, 11, 55, 10, 20};
		System.out.println("Array: "+Arrays.toString(arr));
		System.out.println("Number of palindrome elements: "+countPalindromes(arr));
		System.out.println("Sum of palindrome elements: "+summationOfPalindromeElements(arr));
		System.out.println("Product of palindrome elements: "+productOfPalindromeElements(arr));
	}

}
