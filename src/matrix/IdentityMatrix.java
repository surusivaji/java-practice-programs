package matrix;

public class IdentityMatrix {
	
	public static boolean isIdentixMatrix(int[][] matrix) {
		int rows = matrix.length;
		int cols = matrix[0].length;
		if (rows!=cols) {
			return false;
		}
		for (int i=0; i<matrix.length; i++) {
			for (int j=0; j<matrix.length; j++) {
				if (i==j && matrix[i][j]!=1) {
					return false;
				}
				if (i!=j && matrix[i][j]!=0) {
					return false;
				}
			}
		}
		return true;
	}
	
	public static void main(String[] args) {
		int[][] arr = {{1, 0, 0}, {0, 1, 0}, {0, 0, 1}};
		if (isIdentixMatrix(arr))
			System.out.println("It is a Identity Matrix");
		else
			System.err.println("It is not a Identity Matrix");
	}

}
