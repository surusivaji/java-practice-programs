package standard;

import java.util.Scanner;

public class LCM {
	
	public static int findLCM(int num1, int num2) {
		for (int i=1; true; i++) {
			if ((num1*i)%num2==0) {
				return num1*i;
			}
		}
	}
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter the first number: ");
		int num1 = scanner.nextInt();
		System.out.print("Enter the second number: ");
		int num2 = scanner.nextInt();
		System.out.println("LCM: "+findLCM(num1, num2));
		scanner.close();
	}

}
