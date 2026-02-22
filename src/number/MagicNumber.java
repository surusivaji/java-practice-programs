package number;

import java.util.Scanner;

public class MagicNumber {
	
	public static boolean isMagicNumber(int num) {
		int sum = 0;
		while (num>9) {
			while (num!=0) {
				int digit = num%10;
				sum += digit;
				num /= 10;
			}
			num = sum;
			sum = 0;
		}
		return num==1;
	}
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter the Number: ");
		int num = scanner.nextInt();
		if (isMagicNumber(num))
			System.out.println("It is a Magic Number");
		else
			System.out.println("It is not a Magic Number");
		scanner.close();
	}

}
