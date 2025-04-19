package p01_numberProgram;

/*Goal:
Count how many digits a number has.

How:
Keep dividing the number by 10

Increase count each time

Stop when number becomes 0

Example (345):

345 → count=1

34 → count=2

3 → count=3

0 → stop

Final count = 3*/

public class Q04_countTheDigitInTheGivenNo {
	public static void main(String[] args) {
		int n = 345;
		int count = 0;

		while (n != 0) {
			n = n / 10;
			count++;
		}
		System.out.println(count);
	}
}
