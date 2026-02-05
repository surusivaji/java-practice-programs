package strings;

public class NonRepeatedSubstrings {
	
	public static boolean isNonRepeated(String str) {
		for (int i=0; i<str.length(); i++) {
			for (int j=i+1; j<str.length(); j++) {
				if (str.charAt(i)==str.charAt(j)) {
					return false;
				}
			}
		}
		return true;
	}
	
	public static void nonRepeatedSubstrings(String str) {
		for (int i=0; i<str.length(); i++) {
			for (int j=i+1; j<str.length()-1; j++) {
				String substring = str.substring(i, j+1);
				if (isNonRepeated(substring)) {
					System.out.println(substring);
				}
			}
		}
	}
	
	public static void main(String[] args) {
		String str = "abcabcdecaab";
		nonRepeatedSubstrings(str);
	}

}
