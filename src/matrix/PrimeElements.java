package matrix;

public class PrimeElements {
	
	public static boolean isPrime(int num) {
		int count = 0;
		for (int i=1; i<=num; i++) {
			if (num%i==0)
				count++;
		}
		return count==2;
	}
	
	public static void printPrimeElementsInEachRow(int[][] matrix) {
		for (int[] row : matrix) {
			for (int num : row) {
				if (isPrime(num)) {
					System.out.print(num+" ");
				}
			}
			System.out.println();
		}
	}
	
	public static void main(String[] args) {
		int[][] arr = {{2, 7, 5}, {7, 11, 20}, {6, 15, 3}};
		printPrimeElementsInEachRow(arr);
	}

}
