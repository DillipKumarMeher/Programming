package p01_numberProgram;

/*An automorphic number (also called a circular number) is a number whose square ends with the same 
 * digits as the number itself.
 Example:
 5² = 25 → ends with 5 → ✔
 6² = 36 → ends with 6 → ✔
 76² = 5776 → ends with 76 → ✔
 25² = 625 → ends with 25 → ✔
 ---------
 ❌ Non-Example:
 7² = 49 → does not end with 7 →❌  */

public class Q26_givenNoIsAutomorphicNumberOrNot {

	public static void main(String[] args) {

		int n = 76;
		int square = n * n;

		boolean isAutomorphic = false;
		while (n > 0) {
			if (n % 10 != square % 10) {
				isAutomorphic = true;
				break;
			}
			n /= 10;
			square /= 10;
		}
		if (!isAutomorphic) {
			System.out.println("automorphic");
		} else {
			System.out.println("Not automorphic"); 
		}
	}
}
