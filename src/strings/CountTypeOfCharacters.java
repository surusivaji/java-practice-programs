package strings;

public class CountTypeOfCharacters {
	
	public static void countTypeOFCharacters(String str) {
		int specialCount = 0;
		int digitCount = 0;
		int alphabetCout = 0;
		for (int i=0; i<str.length(); i++) {
			char ch = str.charAt(i);
			if (Character.isLetter(ch))
				alphabetCout++;
			else if (Character.isDigit(ch))
				digitCount++;
			else
				specialCount++;
		}
		System.out.println("Number of Alphabets: "+alphabetCout);
		System.out.println("Number of Digits: "+digitCount);
		System.out.println("Number of Symbols: "+specialCount);
	}
	
	public static void main(String[] args) {
		String str = "surusivaji2805@gmail.com";
		countTypeOFCharacters(str);
	}

}
