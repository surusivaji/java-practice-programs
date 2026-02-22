package number;

import java.util.Scanner;

public class HCF {
	
	public static int hcf(int num1, int num2) {
		int hcf = 0;
		for (int i=1; i<=num1 && i<=num2; i++) {
			if (num1%i==0 && num2%i==0) {
				hcf = i;
			}
		}
		return hcf;
	}
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter the first number: ");
		int num1 = scanner.nextInt();
		System.out.print("Enter the second number: ");
		int num2 = scanner.nextInt();
		System.out.println("HCF: "+hcf(num1, num2));
		scanner.close();
	}

}
