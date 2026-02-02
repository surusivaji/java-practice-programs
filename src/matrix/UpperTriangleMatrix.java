package matrix;

public class UpperTriangleMatrix {
	
	public static int[][] upperTriangleMatrix(int[][] matrix) {
		int rows = matrix.length;
		int cols = matrix[0].length;
		if (rows!=cols) {
			return null;
		}
		int[][] upperTriangleMatrix = new int[rows][cols];
		for (int i=0; i<matrix.length; i++) {
			for (int j=0; j<matrix[i].length; j++) {
				if (i>j) {
					upperTriangleMatrix[i][j] = 0;
				}
				else {
					upperTriangleMatrix[i][j] = matrix[i][j];
				}
			}
		}
		return upperTriangleMatrix;
	}
	
	public static void printMatrix(int[][] matrix) {
		for (int[] rows : matrix) {
			for (int col : rows) {
				System.out.print(col+" ");
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
		System.out.println("Upper Triangle Matrix");
		printMatrix(upperTriangleMatrix(matrix));
		
	}

}
