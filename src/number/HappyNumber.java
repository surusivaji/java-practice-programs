package number;

public class HappyNumber {
	
	public static boolean isHappyNumber(int num) {
		int sum = 0;
		do {
			while (num!=0) {
				int digit = num%10;
				sum += digit*digit;
				num /= 10;
			}
			num = sum;
			sum = 0;
		} while (num>9);
		if (num==1) {
			return true;
		}
		return false;
	}
	
	public static void main(String[] args) {
		int num = 100;
		if (isHappyNumber(num)) {
			System.out.println("It is a Happy Number");
		}
		else {
			System.out.println("It is not a Happy Number");
		}
	}

}
