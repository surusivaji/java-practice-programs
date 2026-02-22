package number;

import java.util.Scanner;

public class UniqueNumber {
	
	public static boolean isUnique(int num) {
		int temp1 = num;
		while (temp1!=0) {
			int digit1 = temp1%10;
			int count = 0;
			int temp2 = num;
			while (temp2!=0) {
				int digit2 = temp2%10;
				if (digit1==digit2) {
					count++;
				}
				temp2 /= 10;
			}
			if (count>1) {
				return false;
			}
			temp1 /= 10;
		}
		return true;
	}
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter the Number: ");
		int num = scanner.nextInt();
		if (isUnique(num))
			System.out.println("It is a Unique Number");
		else
			System.out.println("It is not a Unique Number");
		scanner.close();
	}

}
