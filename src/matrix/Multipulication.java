package matrix;

public class Multipulication {
	
	public static void printArray(int[][] matrix) {
		for (int[] row : matrix) {
			for (int col : row) {
				System.out.print(col+" ");
			}
			System.out.println();
		}
	}
	
	public static int[][] multipulication(int[][] matrix1, int[][] matrix2) {
		if (matrix1.length!=matrix2[0].length) {
			return null;
		}
		int[][] mul = new int[matrix1.length][matrix2[0].length];
		for (int i=0; i<matrix1.length; i++) {
			for (int j=0; j<matrix2[0].length; j++) {
				for (int k=0; k<matrix2.length; k++) {
					mul[i][j] = mul[i][j] + matrix1[i][k] * matrix2[k][j];
				}
			}
		}
		return mul;
	}
	
	public static void main(String[] args) {
		int[][] arr1 = {{3, 3, 3}, {4, 4, 4}, {5, 5, 5}};
		int[][] arr2 = {{2, 2, 3}, {4, 3, 5}, {2, 9, 3}};
		System.out.println("First Matrix");
		printArray(arr1);
		System.out.println("Second Matrix");
		printArray(arr2);
		System.out.println("Multipulication");
		printArray(multipulication(arr1, arr2));
	}

}
