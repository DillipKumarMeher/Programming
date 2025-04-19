package p01_numberProgram;

/*Product of the digits means multiplying all the digits of a number together.

Example:
If number is 345
→ digits are 3, 4, 5
→ product = 3 × 4 × 5 = 60

We keep multiplying each digit until no digits are left.*/

public class Q06_getProductOfTheDigit {
	public static void main(String[] args) {
		int n = 345;
		int product = 1;

		while (n != 0) {
			int d = n % 10;
			product *= d;
			n = n / 10;
		}
		System.out.println(product);
	}
}
