package strings;

import java.util.Scanner;

public class Anagram {
	
	public static boolean isAnagram(String str1, String str2) {
		if (str1.length()!=str2.length()) {
			return false;
		}
		int[] count = new int[26];
		for (char ch : str1.toCharArray()) {
			count[ch-'a']++;
		}
		for (char ch : str2.toCharArray()) {
			count[ch-'a']--;
		}
		for (int freq : count) {
			if (freq!=0) {
				return false;
			}
		}
		return true;
	}
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter the String 1: ");
		String str1 = scanner.next();
		System.out.print("Enter the String 2: ");
		String str2 = scanner.next();
		if (isAnagram(str1, str2)) 
			System.out.println("It is a Anagram");
		else
			System.out.println("It is not a Anagram");
		scanner.close();
	}

}
