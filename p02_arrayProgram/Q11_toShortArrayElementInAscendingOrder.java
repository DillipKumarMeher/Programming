package p02_arrayProgram;

public class Q11_toShortArrayElementInAscendingOrder {
	public static void main(String[] args) {
		int[] arr = { 9, 7, 8, 2 };

		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[j] < arr[i]) {
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		for (int i : arr) {
			System.out.print(i + " ");
		}
	}
}
