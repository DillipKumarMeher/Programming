package p02_arrayProgram;

public class Q06_toCopyOneElementToAnotherElelment {
	public static void main(String[] args) {
		int[] arr = { 10, 20, 30, 40, 50 };
		int indexToCopy = 2;
		int copyElement = 0;

		if (indexToCopy >= 0 && copyElement < arr.length) {
			copyElement = arr[indexToCopy];
			System.out.println("Copied Element: " + copyElement);
		} else {
			System.out.println("Invalid Index");
		}
	}
}
