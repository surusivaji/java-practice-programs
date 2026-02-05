package strings;

import java.util.LinkedHashMap;
import java.util.Map;

public class DuplicateWords {
	
	public static void findDuplicateWords(String str) {
		str = str.toLowerCase();
		String[] words = str.split(" +");
		Map<String, Integer> map = new LinkedHashMap<String, Integer>();
		for (String word : words) {
			map.put(word, map.getOrDefault(word, 0)+1);
		}
		for (Map.Entry<String, Integer> entry : map.entrySet()) {
			if (entry.getValue()>1) {
				System.out.println(entry.getKey());
			}
		}
	}
	
	public static void main(String[] args) {
		String str = "Big black bug bit a big black dog on his big black nose";
		findDuplicateWords(str);
	}

}
