package arrays;

public class SecondSmallest {
	
	public static int secondSmallest(int[] arr) {
		int firstSmallest = Integer.MAX_VALUE;
		int secondSmallest = Integer.MAX_VALUE;
		for (int num : arr) {
			if (num<firstSmallest) {
				secondSmallest = firstSmallest;
				firstSmallest = num;
			}
			else if (num<secondSmallest && num!=firstSmallest) {
				secondSmallest = num;
			}
		}
		return secondSmallest;
	}
	
	public static void main(String[] args) {
		int[] arr = {22, 2, 5, 9, 10, 8, 7, 6};
		System.out.println("Second Smallest: "+secondSmallest(arr));
	}

}
