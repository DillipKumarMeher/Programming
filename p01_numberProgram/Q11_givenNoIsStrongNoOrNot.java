package p01_numberProgram;

/*A Strong number is a number where
sum of the factorial of its digits equals the number itself.

Example:
145
→ 1! + 4! + 5!
= 1 + 24 + 120
= 145

Since sum = number, it’s a Strong number.*/

public class Q11_givenNoIsStrongNoOrNot {
	public static void main(String[] args) {
		int n = 145; // example number
		int temp = n;
		int sum = 0;

		while (n != 0) {
			int digit = n % 10;

			int fact = 1;
			for (int i = 1; i <= digit; i++) {
				fact = fact * i;
			}

			sum = sum + fact;
			n = n / 10;
		}

		if (sum == temp) {
			System.out.println("Strong number");
		} else {
			System.out.println("Not a Strong number");
		}
	}
}
