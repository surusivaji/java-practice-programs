package strings;

public class RemoveVowelsInString {
	
	public static boolean isVowel(char ch) {
		ch = Character.toLowerCase(ch);
		if (ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u') {
			return true;
		}
		return false;
	}
	
	public static String removeVowels(String str) {
		String result = "";
		for (int i=0; i<str.length(); i++) {
			char ch = str.charAt(i);
			if (!isVowel(ch)) {
				result += ch;
			}
		}
		return result;
	}
	
	public static void main(String[] args) {
		String str = "sivaji";
		System.out.println("Result: "+removeVowels(str));
	}

}
