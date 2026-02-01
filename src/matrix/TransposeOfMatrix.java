package matrix;

public class TransposeOfMatrix {
	
	public static int[][] transpose(int[][] matrix) {
		int[][] transpose = new int[matrix.length][matrix[0].length];
		for (int i=0; i<matrix.length; i++) {
			for (int j=0; j<matrix[i].length; j++) {
				transpose[i][j] = matrix[j][i];
			}
		}
		return transpose;
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
		int[][] matrix = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
		System.out.println("Matrix");
		printArray(matrix);
		System.out.println("Transpose Matrix");
		printArray(transpose(matrix));
	}

}
