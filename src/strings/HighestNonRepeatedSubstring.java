package strings;

public class HighestNonRepeatedSubstring {
	
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
	
	public static String highestNonRepeatedSubstring(String str) {
		String highest = "";
		for (int i=0; i<str.length(); i++) {
			for (int j=i+1; j<str.length()-1; j++) {
				String substring = str.substring(i, j+1);
				if (isNonRepeated(substring)) {
					if (substring.length()>highest.length()) {						
						highest = substring;
					}
				}
			}
		}
		return highest;
	}
	
	public static void main(String[] args) {
		String str = "abcabcdecaab";
		System.out.println("Highest non repeated substring: "+highestNonRepeatedSubstring(str));
	}

}
