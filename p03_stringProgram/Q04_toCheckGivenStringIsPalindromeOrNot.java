package p03_stringProgram;

public class Q04_toCheckGivenStringIsPalindromeOrNot {
	public static void main(String[] args) {
		String str = "MOM";
		String rev = "";

		for (int i = str.length() - 1; i >= 0; i--) {
			rev += str.charAt(i);
		}
		if (str.equals(rev)) {
			System.out.println("Is a palindrome");
		} else {
			System.out.println("Is not a Palindrome");
		}
	}
}
