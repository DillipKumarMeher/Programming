package p01_numberProgram;

//An Armstrong number is a number where

//sum of each digit raised to the power of number of digits equals the number itself.
//
//Example:
//153
//→ 1³ + 5³ + 3³
//= 1 + 125 + 27
//= 153
//
//Since sum = number, it’s an Armstrong number.

public class Q12_givenNoIsArmstrongNoOrNot {

	public static void main(String[] args) {

		int n = 153; // Example number
		int temp = n;
		int sum = 0;

		while (n > 0) {
			int digit = n % 10;

			int power = 1;
			for (int i = 1; i <= 3; i++) {
				power = power * digit;
			}

			sum = sum + power;
			n = n / 10;
		}

		if (sum == temp) {
			System.out.println("Armstrong number");
		} else {
			System.out.println("Not an Armstrong number");
		}
	}
}