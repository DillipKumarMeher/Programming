package p01_numberProgram;

public class Q28_reverseTheGivenNo {

	public static void main(String[] args) {

		int n = 12345678;
		int rev = 0;

		while (n > 0) {
			int d = n % 10;
			rev = rev * 10 + d;
			n = n / 10;
		}
		System.out.println(rev);
	}
}
