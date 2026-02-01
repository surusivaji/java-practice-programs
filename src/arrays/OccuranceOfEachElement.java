package arrays;

import java.util.LinkedHashMap;
import java.util.Map;

public class OccuranceOfEachElement {
	
	public static void printOccurances(int[] arr) {
		int[] occurance = new int[arr.length];
		int visited = -1;
		for (int i=0; i<arr.length; i++) {
			int count = 1;
			for (int j=i+1; j<arr.length; j++) {
				if (arr[i]==arr[j]) {
					count++;
					occurance[j] = visited;
				}
			}
			if (occurance[i]!=visited) {
				occurance[i] = count;
			}
		}
		for (int i=0; i<arr.length; i++) {
			if (occurance[i]!=-1) {
				System.out.println(arr[i]+" -> "+occurance[i]);
			}
		}
	}
	
	public static void occurances(int[] arr) {
		Map<Integer, Integer> map = new LinkedHashMap<Integer, Integer>();
		for (int num : arr) {
			if (map.containsKey(num)) {
				map.put(num, map.get(num)+1);
			}
			else {
				map.put(num, 1);
			}
		}
		for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
			System.out.println(entry.getKey()+" -> "+entry.getValue());
		}
	}
	
	public static void main(String[] args) {
		int[] arr = {1, 1, 2, 2, 2, 2, 3, 3, 4, 4, 4, 5};
		System.out.println("Occurance of each element");
		printOccurances(arr);
	}

}
