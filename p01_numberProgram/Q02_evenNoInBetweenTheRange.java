package p01_numberProgram;

/*What this program does:

It takes a start and end value.

Runs a loop from start to end.

In each loop, it checks if the number is even using i % 2 == 0.

If yes, it prints that number.

Example (1 to 10):

1 → not even

2 → even → print

3 → not even

4 → even → print
...and so on till 10.*/

public class Q02_evenNoInBetweenTheRange {
	public static void main(String[] args) {
		int start = 1;
		int end = 10;

		for (int i = start; i <= end; i++) {
			if (i % 2 == 0) {
				System.out.println(i);
			}
		}
	}
}
