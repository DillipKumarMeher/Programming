package p02_arrayProgram;

public class Q18_PalindromeCheckInArrayUsingWhileLoop {
	public static void main(String[] args) {
		int[] arr = { 234, 545, 567, 676 };

		int i = 0;
		while (i < arr.length) {
			int original = arr[i];
			int num = original;

			int rev = 0;
			while (original > 0) {
				int digit = original % 10;
				rev = rev * 10 + digit;
				original = original / 10;
			}
			if (num == rev) {
				System.out.println(num + " It is a palidrome");
			} else {
				System.out.println(num + " It is not a palidrome");
			}
			i++;
		}
	}
}
