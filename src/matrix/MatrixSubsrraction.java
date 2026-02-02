package matrix;

public class MatrixSubsrraction {
	
	public static int[][] substraction(int[][] matrix1, int[][] matrix2) {
		int[][] difference = new int[matrix1.length][matrix1[0].length];
		for (int i=0; i<matrix1.length; i++) {
			for (int j=0; j<matrix1[i].length; j++) {
				difference[i][j] = matrix1[i][j] - matrix2[i][j];
			}
		}
		return difference;
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
		int[][] matrix1 = {{3, 5, 6}, {8, 9, 3}, {3, 5, 6}};
		int[][] matrix2 = {{1, 4, 3}, {2, 8, 1}, {1, 3, 5}};
		System.out.println("First Matrix");
		printArray(matrix1);
		System.out.println("Second Matrix");
		printArray(matrix2);
		System.out.println("Substraction");
		printArray(substraction(matrix1, matrix2));
	}

}
