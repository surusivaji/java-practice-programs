package matrix;

public class MaxFrequencyElement {
	
	public static int findMaximumFrequentElement(int[] arr) {
		int max = Integer.MIN_VALUE;
		int element = 0;
		for (int i=0; i<arr.length; i++) {
			int count = 1;
			for (int j=i+1; j<arr.length; j++) {
				if (arr[i]==arr[j]) {
					count++;
				}
			}
			if (count>max) {
				max = count;
				element = arr[i];
			}
		}
		return element;
	}
	
	public static void main(String[] args) {
		int[] arr = {1, 2, 3, 2, 1, 2, 3, 3, 3}; 
		System.out.println("Maximum Frequency Element: "+findMaximumFrequentElement(arr));
	}

}
