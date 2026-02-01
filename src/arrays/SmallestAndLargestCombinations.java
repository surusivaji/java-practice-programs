package arrays;

public class SmallestAndLargestCombinations {
	
	public static int smallestCombination(int[] arr) {
		int firstSmallest = Integer.MAX_VALUE;
		int secondSmallest = Integer.MAX_VALUE;
		for (int i=0; i<arr.length; i++) {
			if (arr[i]<firstSmallest) {
				secondSmallest = firstSmallest;
				firstSmallest = arr[i];
			}
			else if (arr[i]<secondSmallest && arr[i]!=firstSmallest) {
				secondSmallest = arr[i];
			}
		}
		return firstSmallest+secondSmallest;
	}
	
	public static int largestCombination(int[] arr) {
		int firstLargest = Integer.MIN_VALUE;
		int secondLargest = Integer.MIN_VALUE;
		for (int i=0; i<arr.length; i++) {
			if (arr[i]>firstLargest) {
				secondLargest = firstLargest;
				firstLargest = arr[i];
			}
			else if (arr[i]<secondLargest && arr[i]!=secondLargest) {
				secondLargest = arr[i];
			}
		}
		return firstLargest+secondLargest;
	}
	
	public static void main(String[] args) {
		int[] arr = {10, 20, 30, 40, 50, 60};
		System.out.println("Largest combination: "+largestCombination(arr));
		System.out.println("Smallest combination: "+smallestCombination(arr));
	}

}
