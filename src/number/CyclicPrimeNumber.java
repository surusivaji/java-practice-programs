package number;

import java.util.Scanner;

public class CyclicPrimeNumber {
	
	public static boolean isPrime(int num) {
		int count = 0;
		for (int i=1; i<=num; i++) {
			if (num%i==0) {
				count++;
			}
		}
		return count==2;
	}
	
	public static int rotateNumber(int num, int digits) {
		int lastDigit = num%10;
		num = num/10;
		int power = 1;
		for (int i=1; i<digits; i++) {
			power = power * 10;
		}
		return lastDigit * power + num;
	}
	
	public static boolean isCyclicPrimeNumber(int num) {
		int temp = num;
		int count = 0;
		while (temp!=0) {
			count++;
			temp /= 10;
		}
		int rotate = num;
		for (int i=1; i<=count; i++) {
			if (!isPrime(rotate)) {
				return false;
			}
			rotate = rotateNumber(num, count);
		}
		return true;
	}
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter the Number: ");
		int num = scanner.nextInt();
		if (isCyclicPrimeNumber(num))
			System.out.println("It is a Cyclic prime number");
		else
			System.out.println("It is not a Cyclic prime number");
		scanner.close();
	}

}
