package p02_arrayProgram;

public class Q25_toRemoveDuplicatValueInTheArray {
	public static void main(String[] args) {
		int[] arr = { 10, 20, 10, 30, 20, 40 };
		int n = arr.length;
		int[] temp = new int[n];
		int k = 0;

		for (int i = 0; i < n; i++) {
			boolean isDuplicat = false;

			for (int j = 0; j < n; j++) {
				if (arr[i] == temp[j]) {
					isDuplicat = true;
					break;
				}
			}
			if (!isDuplicat) {
				temp[k] = arr[i];
				k++;
			}
		}
		System.out.print("Array after removing duplicates: ");
		for (int i = 0; i < k; i++) {
			System.out.print(temp[i] + " ");
		}
	}
}
