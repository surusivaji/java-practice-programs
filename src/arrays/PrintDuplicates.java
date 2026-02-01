package arrays;

public class PrintDuplicates {
	
	public static void printDuplicates(int[] arr) {
		boolean isUnique = true;
		for (int i=0; i<arr.length; i++) {
			int count = 1;
			for (int j=i+1; j<arr.length; j++) {
				if (arr[i]==arr[j]) {
					count++;
				}
			}
			if (count==2) {
				System.out.print(arr[i]+" ");
				isUnique = false;
			}
		}
		if (isUnique) {
			System.out.println("No duplicates");
		}
	}
	
	public static void main(String[] args) {
		int[] arr = {2, 3, 4, 4, 5, 5, 5, 1, 2};
		printDuplicates(arr);
	}

}
