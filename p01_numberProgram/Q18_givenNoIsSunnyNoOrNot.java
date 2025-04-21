package p01_numberProgram;

/*A Sunny Number is a number where the next number (n+1) is a perfect square.

Example:
8 → 8+1=9 → 9 is a perfect square (3×3) → Sunny
15 → 15+1=16 → 16 is a perfect square (4×4) → Sunny
10 → 10+1=11 → not a perfect square → Not Sunny

✅ How to check:
Add 1 to the number.
See if it’s a perfect square.*/

public class Q18_givenNoIsSunnyNoOrNot {
	public static void main(String[] args) {
		int n = 10;
		int m = n + 1;

		for (int i = 1; i <= m; i++) {
			if ((i * i) == m) {
				System.out.println("Sunny number");
				break;
			} else if (m == i) {
				System.out.println("Not a sunny number");
			}
		}
	}
}
