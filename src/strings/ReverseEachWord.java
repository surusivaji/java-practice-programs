package strings;

public class ReverseEachWord {
	
	public static String reverse(String str) {
		String reverse = "";
		for (int i=str.length()-1; i>=0; i--) {
			reverse = reverse + str.charAt(i);
		}
		return reverse;
	}
	
	public static String reverseEachWord(String str) {
		String[] words = str.split(" +");
		String result = "";
		for (String word : words) {
			result += reverse(word)+" ";
		}
		return result.trim();
	}
	
	public static void main(String[] args) {
		String str = "hello sivaji";
		System.out.println("Result: "+reverseEachWord(str));
	}

}
