package number;

public class Armstrong {
	
	public static boolean isArmstrong(int num) {
		int count = 0;
		int temp = num;
		while (temp!=0) {
			count++;
			temp /= 10;
		}
		int sum = 0;
		temp = num;
		while (temp!=0) {
			int digit = temp%10;
			int power = 1;
			for (int i=1; i<=count; i++) 				
				power *= digit;
			sum += power;
			temp /= 10;
		}
		return sum==num;
	}
	
	public static void main(String[] args) {
		int num = 153;
		if (isArmstrong(num))
			System.out.println("It is  Armstrong Number");
		else
			System.out.println("It is not Armstrong Number");
	}

}
