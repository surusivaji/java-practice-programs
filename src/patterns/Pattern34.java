package patterns;

public class Pattern34 {
	
	public static void main(String[] args) {
		int space = 5;
		int star = 1;
		for (int i=0; i<=5; i++) {
			for (int a=1; a<=space; a++) {
				System.out.print(" ");
			}
			int num = 1;
			for (int b=0; b<star; b++) {
				System.out.print(num+" ");
				num = (num * (i-b))/(b+1);
			}
			System.out.println();
			star++;
			space--;
		}
	}

}
