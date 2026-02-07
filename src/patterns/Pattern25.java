package patterns;

public class Pattern25 {
	
	public static void main(String[] args) {
		int star = 1;
		int space = 4;
		for (int i=1; i<=5; i++) {
			for (int a=1; a<=space; a++) {
				System.out.print("   ");
			}
			for (int b=1; b<=star; b++) {
				System.out.print(" * ");
			}
			star += 2;
			space--;
			System.out.println();
		}
	}

}
