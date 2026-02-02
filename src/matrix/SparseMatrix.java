package matrix;

public class SparseMatrix {
	
	public static boolean isSparseMatrix(int[][] matrix) {
		int rows = matrix.length;
		int cols = matrix[0].length;
		int size = rows * cols;
		int count = 0;
		for (int i=0; i<matrix.length; i++) {
			for (int j=0; j<matrix[i].length; j++) {
				if (matrix[i][j]==0) {
					count++;
				}
			}
		}
		if (count > (size/2)) {
			return true;
		}
		else {
			return false;
		}
	}
	
	public static void main(String[] args) {
		int[][] matrix = {{4, 0, 0},
						  {0, 5, 0},
						  {0, 0, 6}};
		if (isSparseMatrix(matrix)) {
			System.out.println("It is a Sparse Matrix");
		}
		else {
			System.out.println("It is not a Sparse Matrix");
		}
	}

}
