package number;

import java.util.Scanner;

public class DisariumNumber {
	
	public static boolean isDisariumNumber(int num) {
		int temp = num;
		int count = 0;
		while (temp!=0) {
			count++;
			temp /= 10;
		}
		int sum = 0;
		temp = num;
		while (temp!=0) {
			int digit = temp%10;
			int power = 1;
			for (int i=1; i<=count; i++) {
				power = power * digit;
			}
			sum += power;
			temp /= 10;
			count--;
		}
		return sum==num;
	}
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter the Number: ");
		int num = scanner.nextInt();
		if (isDisariumNumber(num))
			System.out.println("It is a Disarium Number");
		else
			System.out.println("It is not a Disarium Number");
		scanner.close();
	}

}
