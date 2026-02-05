package strings;

public class CommonPrefix {
	
	public static String minString(String[] words) {
		String minString = words[0];
		for (int i=1; i<words.length; i++) {
			if (words[i].length()<minString.length()) {
				minString = words[i];
			}
		}
		return minString;
	}
	
	public static String commonPrefix(String[] words) {
		String minString = minString(words);
		int minLength = minString.length();
		for (int i=0; i<words.length; i++) {
			int count = 0;
			for (int j=0; j<minLength; j++) {
				if (minString.charAt(j)!=words[i].charAt(j)) {
					break;
				}
				else {
					count++;
				}
			}
			if (count < minLength) {
				minLength = count;
			}
		}
		return minString.substring(0, minLength);
	}
	
	public static void main(String[] args) {
		String[] words = {"flower", "flow", "flash"};
		System.out.println("Common prefix: "+commonPrefix(words));
	}

}
