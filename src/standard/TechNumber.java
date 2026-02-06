package standard;

import java.util.Scanner;

public class TechNumber {
	
	public static boolean isTechNumber(int num) {
		int temp = num;
		int count = 0;
		while (temp!=0) {
			count++;
			temp /= 10;
		}
		if (count%2!=0) {
			return false;
		}
		int denomenator = 1;
		for (int i=1; i<=count/2; i++) {
			denomenator *= 10;
		}
		int firstPart = num/denomenator;
		int secondPart = num%denomenator;
		int sum = firstPart + secondPart;
		return sum*sum==num;
	}
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter the Number: ");
		int num = scanner.nextInt();
		if (isTechNumber(num))
			System.out.println("It is a Tech Number");
		else
			System.out.println("It is not a Tech Number");
		scanner.close();
	}

}
