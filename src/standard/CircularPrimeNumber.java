package standard;

import java.util.Scanner;

public class CircularPrimeNumber {
	
	public static boolean isPrime(int num) {
		int count = 0;
		for (int i=1; i<=num; i++) {
			if (num%i==0) 
				count++;
		}
		return count==2;
	}
	
	public static boolean isCircularPrimeNumber(int num) {
		int temp = num;
		int count = 0;
		while (temp!=0) {
			count++;
			temp /= 10;
		}
		int power = 1;
		for (int i=1; i<count; i++) {
			power *= 10;
		}
		temp = num;
		for (int i=0; i<count; i++) {
			if (!isPrime(temp)) {
				return false;
			}
			int lastDigit = temp%10;
			temp = power * lastDigit + (temp/10);
		}
		return true;
	}
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter the Number: ");
		int num = scanner.nextInt();
		if (isCircularPrimeNumber(num))
			System.out.println("It is a Circular Prime Number");
		else 
			System.out.println("It is not a Circular Prime Number");
		scanner.close();
	}

}
