package p01_numberProgram;

/*Goal:
Find the sum of all digits in a number.

How:
Get last digit using n % 10

Add to sum
Remove last digit using n / 10
Repeat till number is 0

Example (345):
345 → 5 → sum=5
34 → 4 → sum=9
3 → 3 → sum=12
0 → stop
Final sum = 12*/

public class Q05_sumOfDigit {
	public static void main(String[] args) {
		int n = 345;
		int sum = 0;

		while (n != 0) {
			int d = n % 10;
			sum += d;
			n = n / 10;
		}
		System.out.println(sum);
	}
}
