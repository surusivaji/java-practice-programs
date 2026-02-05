package strings;

public class LastNonRepeatedCharacterInString {
	
	public static char lastNonRepeatedCharacter(String str) {
		for (int i=0; i<str.length(); i++) {
			char ch = str.charAt(i);
			if (str.indexOf(ch)==str.lastIndexOf(ch)) {
				return ch;
			}
		}
		return ' ';
	}
	
	public static void main(String[] args) {
		String str = "hihijava";
		System.out.println("Last non repeated character: "+lastNonRepeatedCharacter(str));
	}

}
