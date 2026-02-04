package strings;

import java.util.Scanner;

public class RemoveDuplicates {
	
	public static String uniqueString(String str) {
		String unique = "";
		for (int i=0; i<str.length(); i++) {
			char ch = str.charAt(i);
			if (unique.indexOf(ch)==-1) {
				unique += ch;
			}
		}
		return unique;
	}
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter the String: ");
		String str = scanner.next();
		System.out.println("Unique: "+uniqueString(str));
		scanner.close();
	}

}
