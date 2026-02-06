package standard;

import java.util.Scanner;

public class DuckNumber {
	
	public static boolean isDuckNumber(int num) {
		while (num!=0) {
			int digit = num%10;
			if (digit==0) {
				return true;
			}
			num /= 10;
		}
		return false;
	}
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter the Number: ");
		int num = scanner.nextInt();
		if (isDuckNumber(num)) {
			System.out.println("It is a Duck Number");
		}
		else {
			System.out.println("It is not a Duck Number");
		}
		scanner.close();
	}

}
