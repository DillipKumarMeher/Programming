package p01_numberProgram;

/*For example:

The number 2025 has 4 digits (even).
Splitting it into two halves: 20 and 25.
Sum of the halves: 20 + 25 = 45.
Square of the sum: 45 × 45 = 2025, which matches the original number.
Thus, 2025 is a Tech Number.*/

public class Q22_givenNoIsTechNoOrNot {

	public static void main(String[] args) {

		int n = 2025;
		int copy = n;
		int count = 0;

		while (n > 0) {
			n = n / 10;
			count++;
		}
		if (count % 2 == 0) {
			count = count / 2;
			
			int divisor = 1;
			for (int i = 0; i < count; i++) {
				divisor = divisor * 10;
			}
			int firstHalf = copy / divisor;
			int secondHalf = copy % divisor;
			int sum = firstHalf + secondHalf;
			int square = sum * sum;
			
			if (square == copy) {
				System.out.println("Given number is a Tech Number");
			} else {
				System.out.println("Given number is not a Tech Number");
			}
		}
	}

}
