package p01_numberProgram;

/*A prime number is a number that has only 2 factors: 1 and itself.

Example:
2, 3, 5, 7, 11, 13...

Why?
5 → factors: 1, 5 → only 2 factors → prime
6 → factors: 1, 2, 3, 6 → more than 2 → not prime*/

public class Q14_givenNoIsPrimeNoOrNot {
	public static void main(String[] args) {
		int n = 5;
		int count = 0;

		for (int i = 1; i <= n; i++) {
			if (n % i == 0) {
				count++;
			}
		}

		if (count == 2) {
			System.out.println("Prime number");
		} else {
			System.out.println("Not a prime number");
		}
	}
}
