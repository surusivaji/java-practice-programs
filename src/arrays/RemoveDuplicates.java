package arrays;

import java.util.Arrays;

public class RemoveDuplicates {
	
	public static int[] uniqueArray(int[] arr) {
		int[] unique = new int[arr.length];
		int index = 0;
		for (int i=0; i<arr.length; i++) {
			boolean isUnique = true;
			for (int j=0; j<index; j++) {
				if (arr[i]==unique[j]) {
					isUnique = false;
					break;
				}
			}
			if (isUnique) {
				unique[index++] = arr[i];
			}
		}
		return Arrays.copyOf(unique, index);
	}
	
	public static void main(String[] args) {
		int[] arr = {1, 1, 2, 2, 2, 3, 3, 3, 4, 4, 5, 5};
		System.out.println(Arrays.toString(uniqueArray(arr)));
	}

}
