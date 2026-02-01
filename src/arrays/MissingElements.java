package arrays;

public class MissingElements {
	
	public static void printMissingElements(int[] arr) {
		for (int i=0; i<arr.length-1; i++) {
			for (int missing=arr[i]+1; missing<arr[i+1]; missing++) {
				System.out.print(missing+" ");
			}
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
		int[] arr = {1, 5, 7, 9};
		System.out.print("Missing: ");
		printMissingElements(arr);
	}

}
