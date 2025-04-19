package p01_numberProgram;

/*Prime numbers in a range:
We check each number between start and end.

For each number:
Count how many numbers divide it exactly (no remainder).

If only 2 numbers (1 and itself) divide it, it's a prime number.
Otherwise, it's not prime.

Example (1 to 5):
1 → only 1 divides → not prime
2 → divided by 1, 2 → prime
3 → divided by 1, 3 → prime
4 → divided by 1, 2, 4 → not prime
5 → divided by 1, 5 → prime*/

public class Q15_getPrimeNoInBetweenTheRange {
	public static void main(String[] args) {
		int start = 1;
		int end = 5;

		for (int n = start; n <= end; n++) {

			int count = 0;
			for (int i = 1; i <= n; i++) {
				if (n % i == 0) {
					count++;
				}
			}
			if (count == 2)
				System.out.println(n);
		}
	}
}