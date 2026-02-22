package number;

public class PrimeNumbersBetween1to100 {
	
	public static boolean isPrime(int num) {
		int count = 0;
		for (int i=1; i<=num; i++) {
			if (num%i==0) {
				count++;
			}
		}
		return count==2;
	}
	
	public static void main(String[] args) {
		for (int i=1; i<=100; i++) {
			if (isPrime(i)) {
				System.out.println(i);
			}
		}
	}

}
