package p01_numberProgram;

/*Goal:
Find the sum of all odd numbers in a given range.

How:
Run a loop from start to end.

In each loop, check if the number is odd using i % 2 != 0.

If it’s odd, add it to sum.

Example (1 to 5):
1 → odd → sum = 0+1 = 1

2 → even

3 → odd → sum = 1+3 = 4

4 → even

5 → odd → sum = 4+5 = 9

Final sum = 9.*/

public class Q03_sumOfAddNoInBetweenTheRange {
	public static void main(String[] args) {
		int start = 1;
		int end = 5;
		int sum = 0;
		for (int i = start; i <= end; i++) {
			if (i % 2 != 0) {
				sum += i;
			}
		}
		System.out.println(sum);
	}
}