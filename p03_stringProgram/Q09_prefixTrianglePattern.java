package p03_stringProgram;

public class Q09_prefixTrianglePattern {
	public static void main(String[] args) {
		String str = "JAVA";

		for (int i = 0; i < str.length(); i++) {
			for (int j = 0; j <= i; j++) {

				System.out.print(str.charAt(j));
			}
			System.err.println();
		}
	}
}
