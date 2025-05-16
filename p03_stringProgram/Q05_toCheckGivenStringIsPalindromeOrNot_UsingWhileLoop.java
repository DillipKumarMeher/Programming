package p03_stringProgram;

public class Q05_toCheckGivenStringIsPalindromeOrNot_UsingWhileLoop {
	public static void main(String[] args) {
		String str = "MOM";
		boolean isPalindrome = true;

		int start = 0;
		int end = str.length() - 1;

		while (start < end) {
			if (str.charAt(start) != str.charAt(end)) {
				isPalindrome = false;
				break;
			}
			start++;
			end--;
		}
		if (isPalindrome) {
			System.out.println("Is a Palindrome");
		} else {
			System.out.println("Is not a Palindrome");
		}
	}
}
