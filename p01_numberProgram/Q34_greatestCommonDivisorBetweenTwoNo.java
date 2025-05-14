package p01_numberProgram;

/*✅ Example:
Let’s take 36 and 60:
Factors of 36: 1, 2, 3, 4, 6, 9, 12, 18, 36
Factors of 60: 1, 2, 3, 4, 5, 6, 10, 12, 15, 20, 30, 60
Common factors: 1, 2, 3, 4, 6, 12
➡️ So, GCD = 12
*/
public class Q34_greatestCommonDivisorBetweenTwoNo {

	public static void main(String[] args) {
		int a = 36;
		int b = 60;
		int gcd = 1;

		for (int i = 1; i <= a && i <= b; i++) {
			if (a % i == 0 && b % i == 0) {
				gcd = i;
			}
		}
		System.out.println("GCD of " + a + " and " + b + " is: " + gcd);
	}
}
