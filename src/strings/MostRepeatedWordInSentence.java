package strings;

public class MostRepeatedWordInSentence {
	
	public static String mostRepeatedWord(String str) {
		String[] words = str.split(" +");
		String most = "";
		int highest = Integer.MIN_VALUE;
		for (int i=0; i<words.length; i++) {
			int count = 1;
			for (int j=i+1; j<words.length; j++) {
				if (words[i].equals(words[j])) {
					count++;
				}
			}
			if (count>highest) {
				highest = count;
				most = words[i];
			}
		}
		return most;
	}
	
	public static void main(String[] args) {
		String str = "hello hello 123 123 java java java";
		System.out.println("Most repeated word: "+mostRepeatedWord(str));
	}
	

}
