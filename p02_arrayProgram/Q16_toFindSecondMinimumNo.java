package p02_arrayProgram;

public class Q16_toFindSecondMinimumNo {
	public static void main(String[] args) {
		int[] arr = { 3, 5, 7, 1, 3, 5 };
		int firstMin = arr[0];
		int secondMin = -1;

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] < firstMin) {
				firstMin = arr[i];
			}
		}
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] != firstMin) {
				if (secondMin == -1 || arr[i] < secondMin) {
					secondMin = arr[i];
				}
			}
		}
		System.out.println("Second Minimum is: " + secondMin);
	}

}
