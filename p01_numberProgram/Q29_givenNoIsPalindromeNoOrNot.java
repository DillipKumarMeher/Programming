package p01_numberProgram;

public class Q29_givenNoIsPalindromeNoOrNot {

	public static void main(String[] args) {

		int n = 101;
		int copy = n;
		int pali = 0;

		while (n > 0) {
			int d = n % 10;
			pali = pali * 10 + d;
			n = n / 10;
		}
		if (pali == copy) {
			System.out.println("It is a Palindrome No");
		} else {
			System.out.println("It is not a palindrome No");
		}
	}
}
