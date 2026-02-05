package strings;

public class FirstNonRepeatedCharacter {
	
	public static char getFirstNonRepeatedCharacter(String str) {
		for (int i=0; i<str.length(); i++) {
			char ch = str.charAt(i);
			if (str.indexOf(ch)==str.lastIndexOf(ch)) {
				return ch;
			}
		}
		return ' ';
	}
	
	public static void main(String[] args) {
		String str = "surusivaji";
		System.out.println("First non repeted character: "+getFirstNonRepeatedCharacter(str));
	}

}
