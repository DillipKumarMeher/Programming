package p02_arrayProgram;

public class Q14_toFindTheMinimumNo {
	public static void main(String[] args) {
		int[] arr = { 3, 5, 4, 7, 9 };
		int min = arr[0];

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] < min) {
				min = arr[i];
			}
		}
		System.out.println("Minimum No: " + min);
	}
}
