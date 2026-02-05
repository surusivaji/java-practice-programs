package strings;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class GroupAnagrams {
	
	public static List<List<String>> groupOfAnagrams(String[] strs) {
		Map<String, List<String>> map = new LinkedHashMap<String, List<String>>();
		for (String str : strs) {
			char[] chars = str.toCharArray();
			Arrays.sort(chars);
			String key = String.valueOf(chars);
			if (!map.containsKey(key)) {
				map.put(key, new ArrayList<>());
			}
			map.get(key).add(str);
		}
		return new ArrayList<>(map.values());
	}
	
	public static void main(String[] args) {
		String[] strs = {"eat", "tea", "tan", "ate", "nat", "bat"};
		System.out.println(groupOfAnagrams(strs));
	}

}
