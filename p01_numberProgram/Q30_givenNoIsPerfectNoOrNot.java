package p01_numberProgram;

/*✅ Example:28
Divisors: 1, 2, 4, 7, 14
Sum = 1 + 2 + 4 + 7 + 14 = 28
✔️ So, 28 is a Perfect Number
*/

public class Q30_givenNoIsPerfectNoOrNot {

	public static void main(String[] args) {

		int n = 28;
		int sum = 0;

		for (int i = 1; i < n; i++) {
			if (n % i == 0) {
				sum += i;
			}
		}
		if (n == sum) {
			System.out.println("It is a perfact No");
		} else {
			System.out.println("It is not a perfact No");
		}
	}
}
