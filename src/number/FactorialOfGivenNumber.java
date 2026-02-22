package number;

import java.util.Scanner;

public class FactorialOfGivenNumber {
	
	public static int findFactorial(int num) {
		int fact = 1;
		for (int i=1; i<=num; i++) {
			fact *= i;
		}
		return fact;
	}
	
	public static void printFactorials(int num) {
		for (int i=1; i<=num; i++) {			
			System.out.println("Factorial of "+i+" : "+findFactorial(i));
		}
	}
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter the number: ");
		int num = scanner.nextInt();
		printFactorials(num);
		scanner.close();
	}

}
