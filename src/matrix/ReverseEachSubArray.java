package matrix;

public class ReverseEachSubArray {
	
	public static void reverse(int[] arr) {
		int start = 0;
		int end = arr.length-1;
		while (start <= end) {
			int temp = arr[start];
			arr[start] = arr[end];
			arr[end] = temp;
			start++;
			end--;
		}
	}
	
	public static int[][] reverseEachSubArray(int[][] matrix) {
		for (int[] row : matrix) {
			reverse(row);
		}
		return matrix;
	}
	
	public static void printArray(int[][] matrix) {
		for (int[] row : matrix) {
			for (int num : row) {
				System.out.print(num+" ");
			}
			System.out.println();
		}
	}
	
	public static void main(String[] args) {
		int[][] matrix = {{3, 2, 1}, {6, 5, 4}, {9, 8, 7}};
		System.out.println("Before Sorting");
		printArray(matrix);
		System.out.println("After Sorting");
		printArray(reverseEachSubArray(matrix));
	}

}
