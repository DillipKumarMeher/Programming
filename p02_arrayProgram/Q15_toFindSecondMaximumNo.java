package p02_arrayProgram;

public class Q15_toFindSecondMaximumNo {
	public static void main(String[] args) {
		int[] arr = { 2, 4, 5, 7, 5 };
		int firstMax = arr[0];
		int secondMin = -1;

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > firstMax) {
				firstMax = arr[i];
			}
		}
		for (int i = 0; i < arr.length; i++) {
			if (firstMax != arr[i]) {
				if (secondMin == -1 || arr[i] > secondMin) {
					secondMin = arr[i];
				}
			}
		}
		System.out.println("Second Maximum is: " + secondMin);
	}
}
