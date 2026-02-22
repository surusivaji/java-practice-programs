package number;

import java.util.Scanner;

public class AutomorphicNumber {
	
	public static boolean isAutomorphicNumber(int num) {
		int square = num * num;
		int count = 0;
		int temp = num;
		while (temp!=0) {
			count++;
			temp /= 10;
		}
		int power = 1;
		for (int i=1; i<=count; i++) {
			power = power * 10;
		}
		return square%power==num;
	}
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter the Number: ");
		int num = scanner.nextInt();
		if (isAutomorphicNumber(num)) 
			System.out.println("It is an Automorphic Number");
		else
			System.out.println("It is not an Automorphic Number");
		scanner.close();
	}

}
