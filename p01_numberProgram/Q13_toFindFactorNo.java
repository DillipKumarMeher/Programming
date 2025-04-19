package p01_numberProgram;

/*A factor of a number is a number that divides it exactly without a remainder.

Example (factors of 12):
1, 2, 3, 4, 6, 12

Why?
Because:
12 % 1 == 0
12 % 2 == 0
12 % 3 == 0
... and so on.

Factors always start from 1 and go up to the number itself.*/

public class Q13_toFindFactorNo {
	public static void main(String[] args) {
		int n = 12;

		for (int i = 1; i <= n; i++) {
			if (n % i == 0) {
				System.out.println(i);
			}
		}
	}
}