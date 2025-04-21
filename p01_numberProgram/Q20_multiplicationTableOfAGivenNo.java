package p01_numberProgram;

/*Example (for the number 5):
5 × 1 = 5
5 × 2 = 10
5 × 3 = 15
5 × 4 = 20
... and so on, up to 5 × 10 = 50.

The multiplication table helps you quickly see the results of multiplying a number with integers from 1 to 10.*/

public class Q20_multiplicationTableOfAGivenNo {
	public static void main(String[] args) {
		int n = 5;

		for (int i = 1; i <= 10; i++) {
			System.out.println(n + "x" + i + "=" + n * i);
		}
	}
}
