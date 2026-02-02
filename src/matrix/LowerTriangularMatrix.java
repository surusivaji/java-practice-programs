package matrix;

public class LowerTriangularMatrix {
	
	public static int[][] lowerTriangelarMatrix(int[][] matrix) {
		int rows = matrix.length;
		int cols = matrix[0].length;
		if (rows!=cols) {
			return null;
		}
		int[][] lowerTriangleMatrix = new int[rows][cols];
		for (int i=0; i<rows; i++) {
			for (int j=0; j<cols; j++) {
				if (j > i) {
					lowerTriangleMatrix[i][j] = 0;
				}
				else {
					lowerTriangleMatrix[i][j] = matrix[i][j];
				}
			}
		}
		return lowerTriangleMatrix;
	}
	
	public static void printMatrix(int[][] matrix) {
		for (int[] rows : matrix) {
			for (int cols : rows) {
				System.out.print(cols+" ");
			}
			System.out.println();
		}	
	}
	
	public static void main(String[] args) {
		int[][] matrix = {{1, 2, 3},
						  {4, 5, 6},
						  {7, 8, 9}};
		System.out.println("Matrix");
		printMatrix(matrix);
		int[][] lowerTriangelarMatrix = lowerTriangelarMatrix(matrix);
		System.out.println("Lower Triangle Matrix");
		printMatrix(lowerTriangelarMatrix);
	}

}
