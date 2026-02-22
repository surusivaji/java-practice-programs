package number;

import java.util.Scanner;

public class ProductOfNaturalNumbers {
	
	public static int productOfNaturalNumbers(int n) {
		int product = 1;
		for (int i=1; i<=n; i++) {
			product *= i;
		}
		return product;
	}
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter the Number: ");
		int n = scanner.nextInt();
		System.out.println("Product of total natural numbers: "+productOfNaturalNumbers(n));
		scanner.close();
	}

}
