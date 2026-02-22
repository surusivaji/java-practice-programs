package number;

public class PerfectNumber {
	
	public static boolean isPerfectNumber(int num) {
		int sum = 0;
		for (int i=1; i<num; i++) {
			if (num%i==0) {
				sum += i;
			}
		}
		return sum==num;
	}
	
	public static void main(String[] args) {
		int num = 6;
		if (isPerfectNumber(num)) {
			System.out.println("It is a Perfect Number");
		}
		else {
			System.out.println("It is not a Perfect Number");
		}
	}

}
