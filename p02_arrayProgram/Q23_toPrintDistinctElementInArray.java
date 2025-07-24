package p02_arrayProgram;

public class Q23_toPrintDistinctElementInArray {
	public static void main(String[] args) {
		int[] arr = { 11, 33, 55, 22, 66, 55, };

		System.out.print("Distinct element is: ");
		for (int i = 0; i < arr.length; i++) {
			boolean isDistinct = true;

			for (int j = 0; j < i; j++) {
				if (arr[i] == arr[j]) {
					isDistinct = false;
					break;
				}
			}
			if (isDistinct) {
				System.out.print(arr[i] + " ");
			}
		}
	}
}
