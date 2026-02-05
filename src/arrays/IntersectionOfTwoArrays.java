package arrays;

import java.util.LinkedHashSet;
import java.util.Set;

public class IntersectionOfTwoArrays {
	
	public static Set<Integer> intersect(int[] arr1, int[] arr2) {
		Set<Integer> set = new LinkedHashSet<Integer>();
		for (int i=0; i<arr1.length; i++) {
			for (int j=0; j<arr2.length; j++) {
				if (arr1[i]==arr2[j]) {
					set.add(arr1[i]);
				}
			}
		}
		return set;
	}
	
	public static void main(String[] args) {
		int[] arr1 = {1, 2, 3, 4, 5};
		int[] arr2 = {3, 4, 5, 6, 7};
		System.out.println(intersect(arr1, arr2));
	}

}
