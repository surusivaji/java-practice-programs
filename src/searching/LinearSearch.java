package searching;

public class LinearSearch {
	
	public static int search(int[] arr, int target) {
		for (int i=0; i<arr.length; i++) {
			if (arr[i]==target) {
				return i;
			}
		}
		return -1;
	}
	
	public static void main(String[] args) {
		int[] arr = {3, 1, 2, 4, 5, 9, 7, 6, 10, 8};
		int target = 5;
		int search = search(arr, target);
		if (search!=-1) {
			System.out.println("Element is found at the Index: "+search);
		}
		else {
			System.out.println("Key is not found..!!!");
		}
	}

}
