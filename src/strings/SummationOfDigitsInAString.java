package strings;

public class SummationOfDigitsInAString {
	
	public static int summation(String str) {
		int sum = 0;
		for (int i=0; i<str.length(); i++) {
			char ch = str.charAt(i);
			if (Character.isDigit(ch)) {
				sum += Character.getNumericValue(ch);
			}
		}
		return sum;
	}
	
	public static void main(String[] args) {
		String str = "Siva@2805";
		System.out.println("Sum: "+summation(str));
	}

}
