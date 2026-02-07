package patterns;

public class Pattern27 {
	
	public static void main(String[] args) {
		char ch = 'O';
		for (int i=1; i<=5; i++) {
			for (int j=1; j<=5; j++) {
				if (i<=j) {
					System.out.print(" "+ch+" ");
					ch--;
				}
				else {
					System.out.print("   ");
				}
			}
			System.out.println();
		}
	}

}
