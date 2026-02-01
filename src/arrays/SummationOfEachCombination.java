package arrays;

public class SummationOfEachCombination {
	
	public static void combinationSummation(int[] arr) {
		for (int i=0; i<arr.length; i++) {
			for (int j=i+1; j<arr.length; j++) {
				int sum = arr[i] + arr[j];
				System.out.println(arr[i]+" + "+arr[j]+" = "+sum);
			}
		}
	}
	
	public static void main(String[] args) {
		int[] arr = {1, 2, 3, 4, 5};
		combinationSummation(arr);
	}

}
