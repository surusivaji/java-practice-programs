package strings;

public class LargestPalindromeSubstring {
	
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
	
	public static String largestPalindromeSubstring(String str) {
		String largest = "";
		for (int i=0; i<str.length(); i++) {
			for (int j=i+1; j<str.length()-1; j++) {
				String substring = str.substring(i, j+1);
				if (isPalindrome(substring) && substring.length() > largest.length()) {
					largest = substring;
				}
			}
		}
		return largest;
	}
	
	public static void main(String[] args) {
		String str = "aabaaba";
		System.out.println("Largest substring: "+largestPalindromeSubstring(str));
	}

}
