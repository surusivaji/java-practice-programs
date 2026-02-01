package matrix;

public class SortEachSubArray {
	
	public static void sort(int[] arr) {
		for (int i=0; i<arr.length; i++) {
			int index = i;
			for (int j=i+1; j<arr.length; j++) {
				if (arr[index]>arr[j]) {
					index = j;
				}
			}
			if (index!=i) {
				int temp = arr[i];
				arr[i] = arr[index];
				arr[index] = temp;
			}
		}
	}
	
	public static void printArray(int[][] matrix) {
		for (int[] row : matrix) {
			for (int col : row) {
				System.out.print(col+" ");
			}
			System.out.println();
		}
	}
	
	public static int[][] sortEachSubArray(int[][] matrix) {
		for (int i=0; i<matrix.length; i++) {
			sort(matrix[i]);
		}
		return matrix;
	}
	
	public static void main(String[] args) {
		int[][] matrix = {{4, 1, 2}, {7, 8, 5}, {9, 1, 2}};
		System.out.println("Before Sorting");
		printArray(matrix);
		System.out.println("After Sorting");
		printArray(sortEachSubArray(matrix));
	}

}
