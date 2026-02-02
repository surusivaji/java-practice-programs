package strings;

public class StringToInteger {
	
	public static int convetStringToInteger(String str) {
		int n = str.length();
		int i = 0;
		int sign = 1;
		int result = 0;
		while (i<n && str.charAt(i)==' ') {
			i++;
		}
		if (i<n && (str.charAt(i)=='+' || str.charAt(i)=='-')) {
			sign = (str.charAt(i)=='-') ? -1 : 1;
			i++;
		}
		while (i<n && Character.isDigit(str.charAt(i))) {
			result = result * 10 + (str.charAt(i) - '0');
			if (sign*result >= Integer.MAX_VALUE) {
				return Integer.MAX_VALUE;
			}
			else if (sign*result <= Integer.MIN_VALUE) {
				return Integer.MIN_VALUE;
			}
			i++;
		}
		return (int)(sign * result);
	}
	
	public static void main(String[] args) {
		String str = "   -41";
		System.out.println("Result: "+convetStringToInteger(str));
	}

}
