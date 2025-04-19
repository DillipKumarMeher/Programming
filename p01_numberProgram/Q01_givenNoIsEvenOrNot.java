package p01_numberProgram;

/*An Even number is a number divisible by 2.

Example: 2, 4, 6, 8, 10...

Check:
If n % 2 == 0 → it’s even.*/

class Q01_givenNoIsEvenOrNot {
	public static void main(String[] args) {
		int n = 3;

		if (n % 2 == 0) {
			System.out.println("even");
		} else {
			System.out.println("not even");
		}
	}
}