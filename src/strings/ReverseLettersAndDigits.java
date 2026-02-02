package strings;

public class ReverseLettersAndDigits {
	
	public static String reverseLettersAndDigits(String str) {
		char[] chars = str.toCharArray();
		int start = 0;
		int end = chars.length-1;
		while (start < end) {
			if (!Character.isLetterOrDigit(chars[start])) {
				start++;
			}
			else if (!Character.isLetterOrDigit(chars[end])) {
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
		String str = "Siva@2805";
		System.out.println("Result: "+reverseLettersAndDigits(str));
	}

}
