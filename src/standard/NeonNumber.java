package standard;

import java.util.Scanner;

public class NeonNumber {
	
	public static boolean isNeonNumber(int num) {
		int square = num * num;
		int sum = 0;
		while (square!=0) {
			int digit = square%10;
			sum += digit;
			square /= 10;
		}
		return sum==num;
	}
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter the Number: ");
		int num = scanner.nextInt();
		if (isNeonNumber(num))
			System.out.println("It is a Neon Number");
		else
			System.out.println("It is not a Neon Number");
		scanner.close();
	}

}
