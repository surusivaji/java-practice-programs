package number;

import java.util.Scanner;

public class Tables {
	
	public static void printTheTable(int num) {
		for (int i=1; i<=10; i++) {
			System.out.println(num + " X " + i + " = "+(num*i));
		}
	}
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter the table number: ");
		int num = scanner.nextInt();
		printTheTable(num);
		scanner.close();
	}

}
