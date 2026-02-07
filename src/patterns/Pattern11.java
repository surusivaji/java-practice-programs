package patterns;

public class Pattern11 {
	
	public static void main(String[] args) {
		int count = 10;
		for (int i=1; i<=5; i++) {
			for (int j=1; j<=5; j++) {
				System.out.print(" "+count+" ");
				count += 2;
			}
			System.out.println();
		}
	}

}
