package strings;

public class PalindromeWords {
	
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
	
	public static void findPalindromeWords(String str) {
		String[] words = str.split(" +");
		for (String word : words) {
			if (isPalindrome(word)) {
				System.out.println(word);
			}
		}
	}
	
	public static void main(String[] args) {
		String Str = "my mom knows malayalam very well";
		findPalindromeWords(Str);
	}

}
