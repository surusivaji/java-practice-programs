package strings;

public class Pangram {
	
	public static boolean isPangram(String str) {
		boolean[] presents = new boolean[26];
		for (char ch : str.toCharArray()) {
			presents[ch-'a'] = true;
		}
		for (boolean isPresent : presents) {
			if (!isPresent) {
				return false;
			}
		}
		return true;
	}
	
	public static void main(String[] args) {
		String str = "abcdefghijklmnopqrstuvwxyz";
		if (isPangram(str)) {
			System.out.println("It is a Pangram");
		}
		else {
			System.out.println("It is not a Pangram");
		}
	}

}
