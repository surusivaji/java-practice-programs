package number;

import java.util.Scanner;

public class SunnyNumber {
	
	public static boolean isSunnyNumber(int num) {
		int temp = num+1;
		for (int i=1; i<=temp; i++) {
			if (i*i==temp) {
				return true;
			}
		}
		return false;
	}
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter the Number: ");
		int num = scanner.nextInt();
		if (isSunnyNumber(num))
			System.out.println("It is a Sunny Number");
		else
			System.out.println("It is not a Sunny Number");
		scanner.close();
	}

}
