package strings;

public class RemoveSpecialCharactersInString {
	
	public static String removeSpecialCharacters(String str) {
		String result = "";
		for (int i=0; i<str.length(); i++) {
			char ch = str.charAt(i);
			if (Character.isLetterOrDigit(ch)) {
				result += ch;
			}
		}
		return result;
	}
	
	public static void main(String[] args) {
		String str = "Siv...a@2/8!05/#$";
		System.out.println("Result: "+removeSpecialCharacters(str));
	}

}
