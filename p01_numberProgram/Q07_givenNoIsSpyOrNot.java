package p01_numberProgram;

/*A Spy number is a number where
sum of its digits = product of its digits.

Example:
Number = 1124
Digits → 1, 1, 2, 4
Sum = 1+1+2+4 = 8
Product = 1×1×2×4 = 8

Since sum = product, it’s a Spy number.*/

public class Q07_givenNoIsSpyOrNot {
	public static void main(String[] args) {
		int n = 1124;
		int sum = 0;
		int product = 1;

		while (n != 0) {
			int d = n % 10;
			sum += d;
			product *= d;
			n = n / 10;
		}
		if (sum == product) {
			System.out.println("spy no");
		} else {
			System.out.println("not a spy no");
		}
	}
}
