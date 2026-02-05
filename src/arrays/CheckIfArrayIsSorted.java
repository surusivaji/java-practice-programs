package arrays;

public class CheckIfArrayIsSorted {
	
	public static boolean isSorted(int[] arr) {
		for (int i=0; i<arr.length; i++) {
			for (int j=i+1; j<arr.length; j++) {
				if (arr[i]>arr[j]) {
					return false;
				}
			}
		}
		return true;
	}
	
	public static void main(String[] args) {
		int[] arr = {1, 1, 2, 5, 5};
		if (isSorted(arr)) {
			System.out.println("It is an Sorted Array");
		}
		else {
			System.out.println("It is not an Sorted Array");
		}
	}

}
