package p02_arrayProgram;

public class Q21_binarySearchInArray {
	public static void main(String[] args) {
		int[] arr = { 40, 10, 50, 30, 20 };

		// sort the array if it is not sort!
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[j] < arr[i]) {
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}

		int key = 30;
		int low = 0;
		int high = arr.length - 1;

		while (low <= high) {
			int mid = (low + high) / 2;
			if (arr[mid] == key) {
				System.out.println("key is found in index: " + mid);
				return;
			} else if (key < arr[mid]) {
				high = mid - 1;
			} else {
				low = mid + 1;
			}
		}
		System.err.println("key is not found");
	}
}
