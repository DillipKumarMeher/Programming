package p03_stringProgram;

public class Q03_toReverseGivenString {
	public static void main(String[] args) {
		String str = "DillipBoss";
		String result = "";

		for (int i = str.length() - 1; i >= 0; i--) {

			result += str.charAt(i);
		}
		System.out.println(result);
	}

}
