package strings;

public class RemoveDigitsInString {
	
	public static String removeDigits(String str) {
		String result = "";
		for (int i=0; i<str.length(); i++) {
			char ch = str.charAt(i);
			if (!Character.isDigit(ch)) {
				result = result+ch;
			}
		}
		return result;
	}
	
	public static void main(String[] args) {
		String str = "Siva2805";
		System.out.println("Result: "+removeDigits(str));
	}

}
