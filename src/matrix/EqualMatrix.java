package matrix;

public class EqualMatrix {
	
	public static boolean isEqual(int[][] matrix1, int[][] matrix2) {
		int rows1 = matrix1.length;
		int cols1 = matrix1[0].length;
		int row2 = matrix2.length;
		int cols2 = matrix2[0].length;
		if (rows1!=row2 || cols1!=cols2) {
			return false;
		}
		for (int i=0; i<matrix1.length; i++) {
			for (int j=0; j<matrix1[0].length; j++) {
				if (matrix1[i][j]!=matrix2[i][j]) {
					return false;
				}
			}
		}
		return true;
	}
	
	public static void main(String[] args) {
		int[][] matrix1 = {{1, 2, 3},
				           {4, 5, 6},
				           {7, 8, 9}};
		int[][] matrix2 = {{1, 2, 3},
		           		   {4, 5, 6},
		                   {7, 8, 9}};
		if (isEqual(matrix1, matrix2))
			System.out.println("Both Matrix are Equal");
		else
			System.out.println("Both Matrix are not Equal");
		
	}

}
