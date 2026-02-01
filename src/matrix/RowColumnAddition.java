package matrix;

public class RowColumnAddition {
	
	public static int[][] rowColumn(int[][] arr1, int[][] arr2) {
		int[][] addition = new int[arr1.length][arr1[0].length];
		for (int i=0; i<arr1.length; i++) {
			for (int j=0; j<arr1[i].length; j++) {
				addition[i][j] = arr1[i][j] + arr2[j][i];
			}
		}
		return addition;
	}
	
	public static void printArray(int[][] matrix) {
		for (int[] row : matrix) {
			for (int col : row) {
				System.out.print(col+" ");
			}
			System.out.println();
		}
	}
	
	public static void main(String[] args) {
		int[][] arr1 = {{1, 2, 3}, {2, 3, 1}, {2, 1, 5}};
		int[][] arr2 = {{3, 2, 1}, {5, 6, 2}, {4, 2, 7}};
		System.out.println("First Array");
		printArray(arr1);
		System.out.println("Second Array");
		printArray(arr2);
		System.out.println("Addition");
		printArray(rowColumn(arr1, arr2));
	}

}
