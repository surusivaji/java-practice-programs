package strings;

import java.util.LinkedHashMap;
import java.util.Map;

public class RansomeNote {
	
	public static boolean isRansome(String magazine, String ransome) {
		Map<Character, Integer> map = new LinkedHashMap<Character, Integer>();
		for (char ch : magazine.toCharArray()) {
			map.put(ch, map.getOrDefault(ch, 0)+1);
		}
		for (char ch : ransome.toCharArray()) {
			if (!map.containsKey(ch) && map.size()==0) {
				return false;
			}
			map.put(ch, map.get(ch)-1);
		}
		return true;
	}
	
	public static void main(String[] args) {
		String magazine = "aab";
		String ransome = "aa";
		if (isRansome(magazine, ransome))
			System.out.println("It is a Ransome String");
		else
			System.out.println("It is not a Ransome String");
	}

}
