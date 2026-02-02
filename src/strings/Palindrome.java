package strings;

import java.util.Scanner;

public class Palindrome {
	
	public static boolean isPalindrome(String str) {
		String reverse = "";
		for (int i=str.length()-1; i>=0; i--) {
			reverse += str.charAt(i);
		}
		if (str.equals(reverse)) {
			return true;
		}
		return false;
	}
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter the String: ");
		String str = scanner.next();
		if (isPalindrome(str)) {
			System.out.println("It is a Palindrome");
		}
		else {
			System.out.println("It is not a Palindrome");
		}
		scanner.close();
	}

}
