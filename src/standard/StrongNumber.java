package standard;

import java.util.Scanner;

public class StrongNumber {
	
	public static boolean isStrongNumber(int num) {
		int temp = num;
		int sum = 0;
		while (temp!=0) {
			int digit = temp%10;
			int fact = 1;
			for (int i=1; i<=digit; i++) {
				fact = fact*i;
			}
			sum += fact;
			temp /= 10;
		}
		return sum==num;
	}
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter the number: ");
		int num = scanner.nextInt();
		if (isStrongNumber(num)) {
			System.out.println("It is a Strong Number");
		}
		else {
			System.out.println("It is not a Strong Number");
		}
		scanner.close();
	}

}
