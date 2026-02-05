package strings;

public class DuplicateCharactersInString {
	
	public static String findDuplicates(String str) {
		str = str.toLowerCase();
		String duplicates = "";
		for (int i=0; i<str.length(); i++) {
			int count = 1;
			char ch1 = str.charAt(i);
			for (int j=i+1; j<str.length(); j++) {
				char ch2 = str.charAt(j);
				if (ch1==ch2) {
					count++;
				}
				if (count==2) {
					break;
				}
			}
			if (count==2 && duplicates.indexOf(ch1)==-1) {
				duplicates += ch1;
			}
		}
		return duplicates;
	}
	
	public static void main(String[] args) {
		String str = "Hellolaptop";
		System.out.println("Duplicate characters: "+findDuplicates(str));
	}

}
