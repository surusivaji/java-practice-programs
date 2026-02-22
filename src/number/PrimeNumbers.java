package number;

import java.util.Scanner;

public class PrimeNumbers {
	
	public static boolean isPrime(int num) {
		int count = 0;
		for (int i=1; i<=num; i++) {
			if (num%i==0) {
				count++;
			}
		}
		return count==2;
	}
	
	public static void printFirstNPrimeNumbers(int n) {
		int sno = 1;
		for (int i=1; sno<=n; i++) {
			if (isPrime(i)) {
				System.out.println(sno+")"+i);
				sno++;
			}
		}
	}
	
	public static int xthPrimeNumber(int x) {
		int sno = 1;
		for (int i=1; sno<=x; i++) {
			if (isPrime(i)) {
				if (sno==x) {
					return i;
				}
				sno++;
			}
		}
		return -1;
	}
	
	public static int nextPrimeNumber(int n) {
		while (true) {
			n++;
			if (isPrime(n)) {
				return n;
			}
		}
	}
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter the Number: ");
		int num = scanner.nextInt();
		System.out.println("Next prime Number: "+nextPrimeNumber(num));
		scanner.close();
	}

}
