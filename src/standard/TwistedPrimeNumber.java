package standard;

import java.util.Scanner;

public class TwistedPrimeNumber {
	
	public static boolean isPrime(int num) {
		int count = 0;
		for (int i=1; i<=num; i++) {
			if (num%i==0) {
				count++;
			}
		}
		return count==2;
	}
	
	public static boolean isTwistedPrimeNumber(int num) {
		if (isPrime(num)) {
			int reverse = 0;
			while (num!=0) {
				int digit = num%10;
				reverse = reverse*10+digit;
				num = num/10;
			}
			if (isPrime(reverse)) {
				return true;
			}
			return false;
		}
		return false;
	}
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter the Number: ");
		int num = scanner.nextInt();
		if (isTwistedPrimeNumber(num)) {
			System.out.println("It is a Twisted Prime Number");
		}
		else {
			System.out.println("It is not a Twisted Prime Number");
		}
		scanner.close();
	}

}
