package strings;

public class Alphabets {
	
	public static void printAlphabets(String str) {
		for (int i=0; i<str.length(); i++) {
			char ch = str.charAt(i);
			if (Character.isAlphabetic(ch))
				System.out.print(ch);
		}
	}
	
	public static void main(String[] args) {
		String str = "siva@2805";
		printAlphabets(str);
	}

}
