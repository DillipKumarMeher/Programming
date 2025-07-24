package p02_arrayProgram;

public class Q17_PalindromeCheckInArray {
	public static void main(String[] args) {
		int[] arr = { 232, 433, 643, 545, 64, 88 };

		for (int i = 0; i < arr.length; i++) {
			int original = arr[i];
			int num = original;

			int rev = 0;
			while (original > 0) {
				int digit = original % 10;
				rev = rev * 10 + digit;
				original = original / 10;
			}

			if (num == rev) {
			      System.out.println(num + " is a palindrome.");
            } else {
                System.out.println(num + " is not a palindrome.");
            }
		}
	}
}
