package p02_arrayProgram;

public class Q24_toPrintDuplicatElementInTheArray {
	public static void main(String[] args) {
		int[] arr = { 2, 3, 5, 4, 6, 7, 5, 6, 9, 1 };
		System.out.print("Duplicat element is: ");

		for (int i = 0; i < arr.length; i++) {
			boolean isDuplicat = false;
			for (int j = 0; j < i; j++) {
				if (arr[i] == arr[j]) {
					isDuplicat = true;
					break;
				}
			}
			if (isDuplicat)
				continue;
			for (int k = i + 1; k < arr.length; k++) {
				if (arr[i] == arr[k]) {
					System.err.print(arr[i] + " ");
					break;
				}
			}
		}
	}
}
