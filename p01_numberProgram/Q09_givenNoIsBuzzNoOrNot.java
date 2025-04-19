package p01_numberProgram;

/*A Buzz number is a number that
ends with 7 or is divisible by 7.

Example:
27 → ends with 7 → Buzz number
35 → divisible by 7 → Buzz number
23 → not ending with 7, not divisible by 7 → not a Buzz number*/

public class Q09_givenNoIsBuzzNoOrNot {
	public static void main(String[] args) {
		int n = 21;

		if (n % 10 == 7 || n % 7 == 0) {
			System.out.println("Buzz");
		} else {
			System.out.println("not a Buzz");
		}
	}
}
