package standard;

import java.util.Scanner;

public class CoPrimeNumber {
	
	public static boolean isCoprimeNumber(int num1, int num2) {
		int hcf = 0;
		for (int i=1; i<=num1 && i<=num2; i++) {
			if (num1%i==0 && num2%i==0) {
				hcf = i;
			}
		}
		return hcf==1;
	}
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter the first number: ");
		int num1 = scanner.nextInt();
		System.out.print("Enter the second number: ");
		int num2 = scanner.nextInt();
		if (isCoprimeNumber(num1, num2)) {
			System.out.println("It is a co prime number");
		}
		else {
			System.out.println("It is not a co prime number");
		}
		scanner.close();
	}

}
