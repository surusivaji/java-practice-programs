package number;

import java.util.Scanner;

public class Palindrome {
	
	public static boolean isPalindrome(int num) {
		int reverse = 0;
		int temp = num;
		while (temp!=0) {
			int digit = temp%10;
			reverse = reverse*10+digit;
			temp /= 10;
		}
		return reverse==num;
	}
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter the Number: ");
		int num = scanner.nextInt();
		if (isPalindrome(num)) {			
			System.out.println("It is a Palindrome");
		}
		else {			
			System.out.println("It is not a Palindrome");
		}
		scanner.close();
 	}

}
