package number;

import java.util.Scanner;

public class BuzzNumber {
	
	public static boolean isBuzzNumber(int num) {
		if (num%7==0 || num%10==7) {
			return true;
		}
		return false;
	}
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter the Number: ");
		int num = scanner.nextInt();
		if (isBuzzNumber(num)) {
			System.out.println("It is a Buzz Number");
		}
		else {
			System.out.println("It is not a Buzz Number");
		}
		scanner.close();
	}

}
