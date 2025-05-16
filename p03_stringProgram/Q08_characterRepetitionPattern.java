package p03_stringProgram;

public class Q08_characterRepetitionPattern {
	public static void main(String[] args) {
		String str = "JAVA";

		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			for (int j = 0; j <= i; j++) {
				System.out.print(ch);
			}
			System.out.println();
		}
	}
}
