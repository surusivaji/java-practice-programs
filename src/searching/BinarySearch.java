package searching;

public class BinarySearch {
	
	public static int search(int[] arr, int target) {
		int low = 0;
		int high = arr.length-1;
		while (low <= high) {
			int mid = low + (high-low)/2;
			if (arr[mid]==target) {
				return mid;
			}
			else if (arr[mid]<target) {
				low = mid+1;
			}
			else {
				high = mid - 1;
			}
		}
		return -1;
	}
	
	public static void main(String[] args) {
		int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		int target = 5;
		int search = search(arr, target);
		if (search!=-1) {
			System.out.println("Target is found at the Index: "+search);
		}
		else {
			System.out.println("Target is not found ..!!!");
		}
	}

}
