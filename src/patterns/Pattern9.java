package patterns;

public class Pattern9 {
	
	public static void main(String[] args) {
		int count = 10;
		for (int i=1; i<=5; i++) {
			for (int j=1; j<=5; j++) {
				System.out.print(" "+(count++)+" ");
			}
			System.out.println();
		}
	}

}
