package p00_practice;

public class FindHighest {

	public static void main(String[] args) {

		int[] arr = { 2, 4, 5, 6, 8, 9, 21, 34, 6 };
		int highest = arr[0];
		int second = -1;
		int third = -1;

		// Step 1: Find the highest number
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > highest) {
				highest = arr[i];
			}
		}
		System.out.println(highest);

		// Step 2: Find the second highest (not equal to highest)
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] != highest) {
				if (second == -1 || arr[i] > second) {
					second = arr[i];
				}
			}
		}
		System.out.println(second);

		// Step 3: Find third highest (not equal to first and second)
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] != highest && arr[i] != second) {
				if (third == -1 || arr[i] > third) {
					third = arr[i];
				}
			}
		}
		System.out.println(third);
	}
}
