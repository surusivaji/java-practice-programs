package strings;

public class ConvertStringToNumber {
	
	public static int convertStringToInteger(String str) {
		int n = str.length();
		int result = 0;
		int i = 0;
		int sign = 1;
		while (i<n && str.charAt(i)==' ') {
			i++;
		}
		if (i<n && (str.charAt(i)=='+' || str.charAt(i)=='-')) {
			sign = (str.charAt(i)=='-') ? -1 : 1;
			i++;
		}
		while (i<n && (Character.isDigit(str.charAt(i)))) {
			result = result * 10 + str.charAt(i) - '0';
			if (result >= Integer.MAX_VALUE) {
				return Integer.MAX_VALUE;
			}
			if (result <= Integer.MIN_VALUE) {
				return Integer.MIN_VALUE;
			}
			i++;
		}
		return sign*result;
	}
	
	public static void main(String[] args) {
		String str = "   -41";
		System.out.println("Number: "+convertStringToInteger(str));
	}

}
