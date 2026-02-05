package strings;

public class CountWordsInSentence {
	
	public static int countWords(String str) {
		int count = 0;
		if (str.charAt(0)!=' ') {
			count++;
		}
		for (int i=0; i<str.length(); i++) {
			if (str.charAt(i)==' ' && str.charAt(i+1)!=' ') {
				count++;
			}
		}
		return count;
	}
	
	public static void main(String[] args) {
		String str = " hello   siva   i am praceing    java programs";
		System.out.println("Total words: "+countWords(str));
	}

}
