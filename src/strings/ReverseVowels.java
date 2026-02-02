package strings;

public class ReverseVowels {
	
	public static boolean isVowel(char ch) {
		if (ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u') {
			return true;
		}
		return false;
	}
	
	public static String reverseVowels(String str) {
		char[] chars = str.toCharArray();
		int start = 0;
		int end = str.length()-1;
		while (start < end) {
			if (!isVowel(chars[start])) {
				start++;
			}
			else if (!isVowel(chars[end])) {
				end--;
			}
			else {
				char temp = chars[start];
				chars[start] = chars[end];
				chars[end] = temp;
				start++;
				end--;
			}
		}
		return String.valueOf(chars);
	}
	
	public static void main(String[] args) {
		String str = "surusivaji";
		System.out.println("Result: "+reverseVowels(str));
	}

}
