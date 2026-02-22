package number;

import java.util.Scanner;

public class HarchadNumber {
	
	public static boolean isHarchadNumber(int num) {
		int temp = num;
		int sum = 0;
		while (temp!=0) {
			int digit = temp%10;
			sum += digit;
			temp /= 10;
		}
		return num%sum==0;
	}
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter the Number: ");
		int num = scanner.nextInt();
		if (isHarchadNumber(num))
			System.out.println("It is a Harchad Number");
		else 
			System.out.println("It is not a Harchad Number");
		scanner.close();
	}

}
