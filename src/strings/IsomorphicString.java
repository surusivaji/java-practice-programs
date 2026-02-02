package strings;

import java.util.LinkedHashMap;
import java.util.Map;

public class IsomorphicString {
	
	public static boolean isIsomorphic(String str1, String str2) {
		if (str1.length()!=str2.length()) {
			return false;
		}
		Map<Character, Character> map1 = new LinkedHashMap<>();
		Map<Character, Character> map2 = new LinkedHashMap<>();
		for (int i=0; i<str1.length(); i++) {
			char ch1 = str1.charAt(i);
			char ch2 = str2.charAt(i);
			if (map1.containsKey(ch1)) {
				if (map1.get(ch1)!=ch2) {
					return false;
				}
			}
			else {
				map1.put(ch1, ch2);
			}
			if (map2.containsKey(ch2)) {
				if (map2.get(ch2)!=ch1) {
					return false;
				}
			}
			else {
				map2.put(ch2, ch1);
			}
		}
		return true;
	}
	
	public static void main(String[] args) {
		String str1 = "paper";
		String str2 = "title";
		if (isIsomorphic(str1, str2))
			System.out.println("It is a Isomorphic String");
		else
			System.out.println("It is not a Isomorphic String");
	}

}
