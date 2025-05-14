package p01_numberProgram;

/*✅ Example:19
1² + 9² = 1 + 81 = 82
8² + 2² = 64 + 4 = 68
6² + 8² = 36 + 64 = 100
1² + 0² + 0² = 1
It reached 1 → Happy number ✅*/

public class Q25_givenNoIsHappyNoOrNot {

	public static void main(String[] args) {

		int n = 19;

		while (true) {
			int sum = 0;
			while (n > 0) {

				int d = n % 10;
				sum += (d * d);
				n = n / 10;
			}
			n = sum;
			if (n == 1) {
				System.out.println("Happy Number");
				break;
			} else if (n == 4) {
				System.out.println("Not a Happy Number");
				break;
			}
		}
	}
}
