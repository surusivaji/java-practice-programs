package strings;

public class SubstringPalindromeStrings {
	
	public static boolean isPalindrome(String str) {
		int start = 0;
		int end = str.length()-1;
		while (start <= end) {
			if (str.charAt(start)!=str.charAt(end)) {
				return false;
			}
			start++;
			end--;
		}
		return true;
	}
	
	public static void getPalindromeSubstrings(String str) {
		for (int i=0; i<str.length(); i++) {
			for (int j=i+1; j<str.length()-1; j++) {
				String substring = str.substring(i, j+1);
				if (isPalindrome(substring)) {
					System.out.println(substring);
				}
			}
		}
	}
	
	public static void main(String[] args) {
		String str = "aabaaba";
		getPalindromeSubstrings(str);
	}

}
