package p02_arrayProgram;

public class Q13_toFindTheMaximumNo {
	public static void main(String[] args) {
		int arr[] = { 2, 4, 6, 4, 7, 8 };
		int max = arr[0];

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > max) {
				max = arr[i];
			}
		}
		System.out.println("Maximum No: " + max);
	}
}
