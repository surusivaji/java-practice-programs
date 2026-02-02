package strings;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class ConvertRomanToInteger {
	
	public static int convertInteger(String roman) {
		Map<Character, Integer> map = new LinkedHashMap<Character, Integer>();
		map.put('I', 1);
		map.put('V', 5);
		map.put('X', 10);
		map.put('L', 50);
		map.put('C', 100);
		map.put('D', 500);
		map.put('M', 1000);
		int num = map.get(roman.charAt(roman.length()-1));
		for (int i=roman.length()-2; i>=0; i--) {
			if (map.get(roman.charAt(i+1)) > map.get(roman.charAt(i)))
				num -= map.get(roman.charAt(i));
			else
				num += map.get(roman.charAt(i));
		}
		return num;
	}
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter Roman Number: ");
		String roman = scanner.next();
		System.out.println("Decimal Number: "+convertInteger(roman));
		scanner.close();
	}

}
