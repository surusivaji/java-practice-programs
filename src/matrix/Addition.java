package matrix;

public class Addition {
	
	public static int[][] addition(int[][] arr1, int[][] arr2) {
		int[][] addition = new int[arr1.length][arr1[0].length];
		for (int i=0; i<arr1.length; i++) {
			for (int j=0; j<arr1[0].length; j++) {
				addition[i][j] = arr1[i][j] + arr2[i][j];
			}
		}
		return addition;
	}
	
	public static void printArray(int[][] arr) {
		for (int[] row : arr) {
			for (int num : row) {
				System.out.print(num+" ");
			}
			System.out.println();
		}
	}
	
	public static void main(String[] args) {
		int[][] arr1 = {{1, 2, 2}, {2, 3, 4}, {1, 2, 3}};
		int[][] arr2 = {{2, 3, 4}, {1, 5, 1}, {2, 3, 4}};
		int[][] addition = addition(arr1, arr2);
		System.out.println("First Array");
		printArray(arr1);
		System.out.println("Second Array");
		printArray(arr2);
		System.out.println("Addition");
		printArray(addition);
	}

}
