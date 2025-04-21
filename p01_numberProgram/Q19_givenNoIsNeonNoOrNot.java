package p01_numberProgram;

/*A Neon Number is a number where the sum of digits of its square is equal to the number itself.

Example:
9 → 9×9 = 81 → 8+1 = 9 → Neon
1 → 1×1 = 1 → 1 = 1 → Neon
3 → 3×3 = 9 → 9 ≠ 3 → Not Neon

✅ How to check:
Find the square of the number.
Add the digits of the square.
If the sum equals the original number → Neon Number.*/

public class Q19_givenNoIsNeonNoOrNot {
	public static void main(String[] args) {
		int n = 8;
		int mul = n * n;
		int temp = n;
		int sep = 0;
		int sum = 0;

		while (mul != 0) {
			sep = mul % 10;
			sum += sep;
			mul = mul / 10;
		}
		if (temp == sum) {
			System.out.println("Neon");
		} else {
			System.out.println("Not a neon no");
		}
	}
}
