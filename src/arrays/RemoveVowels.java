package arrays;

import java.util.Arrays;

public class RemoveVowels {
	
	public static boolean isVowel(char ch) {
		ch = Character.toLowerCase(ch);
		if (ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u') {
			return true;
		}
		return false;
	}
	
	public static char[] removeVowels(char[] chars) {
		char[] consonants = new char[chars.length];
		int index = 0;
		for (int i=0; i<chars.length; i++) {
			if (!isVowel(chars[i])) {
				consonants[index++] = chars[i];
			}
		}
		return Arrays.copyOf(consonants, index);
	}
	
	public static void main(String[] args) {
		char[] chars = {'s', 'i', 'v', 'a', 'j', 'i'};
		System.out.println(Arrays.toString(removeVowels(chars)));
	}

}
