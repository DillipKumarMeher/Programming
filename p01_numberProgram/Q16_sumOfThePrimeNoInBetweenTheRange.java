package p01_numberProgram;

/*The sum of prime numbers between a range is calculated by:

Checking each number in the given range to see if it's prime (only divisible by 1 and itself).
Adding the prime numbers to get the total sum.
For example, for the range 10 to 30, the primes are 11, 13, 17, 19, 23, 29, and their sum is 112.*/

public class Q16_sumOfThePrimeNoInBetweenTheRange {
	public static void main(String[] args) {
		int start = 10;
		int end = 30;
		int sum = 0;

		for (int i = start; i <= end; i++) {

			int count = 0;
			for (int j = 1; j <= i; j++) {
				if (i % j == 0) {
					count++;
				}
			}

			if (count == 2) {
				sum += i;
			}
		}
		System.out.println(sum);

	}
}
