package p00_practice;

public class ReverseTillPosition {
	public static void main(String[] args) {
		String str = "MyNameIsDillip";
		int pos = 6;
		String result = "";

		for (int i = pos - 1; i >= 0; i--) {
			result += str.charAt(i);
		}
		for (int i = pos; i < str.length(); i++) {
			result += str.charAt(i);
		}
		System.out.println(result);
	}
}
