package number;

import java.util.Scanner;

public class LeapYear {
	
	public static boolean isLeapYear(int year) {
		if (year%4==0) {
			if (year%100==0) {
				if (year%400==0) {
					return true;
				}
				return false;
			}
			return true;
		}
		return false;
	}
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter the Year: ");
		int year = scanner.nextInt();
		if (isLeapYear(year))
			System.out.println("It is a Leap Year");
		else
			System.out.println("It is not a Leap Year");
		scanner.close();
	}

}
