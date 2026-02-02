package strings;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class ConvertIntegerToRoman {
	
	public static String convertIntegerToRoman(int num) {
		Map<Integer, String> map = new LinkedHashMap<Integer, String>();
		map.put(1000, "M");
		map.put(900, "CM");
		map.put(500, "D");
		map.put(400, "CD");
		map.put(100, "C");
		map.put(90, "XC");
		map.put(50, "L");
		map.put(40, "XL");
		map.put(10, "X");
		map.put(9, "IX");
		map.put(5, "V");
		map.put(4, "IV");
		map.put(1, "I");
		int[] keys = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
		String roman = "";
		for (int key : keys) {
			while (num>=key) {
				roman += map.get(key);
				num -= key;
			}
		}
		return roman;
	}
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter the decimal number: ");
		int num = scanner.nextInt();
		System.out.println("Roman: "+convertIntegerToRoman(num));
		scanner.close();
	}

}
