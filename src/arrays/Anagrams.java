package arrays;

public class Anagrams {
	
	public static int[] sort(int[] arr) {
		for (int i=0; i<arr.length; i++) {
			int index = i;
			for (int j=i+1; j<arr.length; j++) {
				if (arr[index]>arr[j]) {
					index = j;
				}
			}
			if (arr[index]!=i) {
				int temp = arr[i];
				arr[i] = arr[index];
				arr[index] = temp;
			}
		}
		return arr;
	}
	
	public static boolean isAnagram(int[] arr1, int[] arr2) {
		if (arr1.length!=arr2.length) {
			return false;
		}
		arr1 = sort(arr1);
		arr2 = sort(arr2);
		for (int i=0; i<arr1.length; i++) {
			if (arr1[i]!=arr2[i]) {
				return false;
			}
		}
		return true;
	}
	
	public static void main(String[] args) {
		int[] arr1 = {1, 3, 2};
		int[] arr2 = {3, 2, 1};
		if (isAnagram(arr1, arr2)) {
			System.out.println("It is a Anagram");
		}
		else {
			System.out.println("It is not a Anagram");
		}
	}

}
