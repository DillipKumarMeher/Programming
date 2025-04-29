package p00_practice;

/*The code you've provided finds the missing number in an array. Here's a short example for the array {0, 1, 2, 4, 5, 6}:

Steps:
Total sum of numbers from 0 to 6:
The expected sum of numbers from 0 to 6 is:
0+1+2+3+4+5+6=21

Sum of numbers in the array:
The sum of the given array {0, 1, 2, 4, 5, 6} is:

0+1+2+4+5+6=18.

Find the missing number:
The missing number is: 21−18=3
*/

public class MissingNumber {

	public static void main(String[] args) {

		int[] arr = { 0, 1, 2, 4, 5, 6 };
		int n = arr.length + 1;

		int totalsum = 0;
		for (int i = 0; i < n; i++) {
			totalsum += i;

		}
		int totalarray = 0;
		for (int i = 0; i < arr.length; i++) {
			totalarray += arr[i];
		}
		int missing = totalsum - totalarray;
		System.out.println(missing);
	}
}
