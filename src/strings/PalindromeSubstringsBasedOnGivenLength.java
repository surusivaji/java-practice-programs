package strings;

public class PalindromeSubstringsBasedOnGivenLength {
	
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
	
	public static void palindromeSubstring(String str, int size) {
		for (int i=0; i<str.length(); i++) {
			for (int j=i+1; j<str.length()-1; j++) {
				String substring = str.substring(i, j+1);
				if (isPalindrome(substring) && substring.length()==size) {
					System.out.println(substring);
				}
			}
		}
	}
	
	public static void main(String[] args) {
		String str = "aabbcccddceeaabbaba";
		int size = 3;
		palindromeSubstring(str, size);
	}

}
