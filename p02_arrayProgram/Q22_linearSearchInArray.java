package p02_arrayProgram;

public class Q22_linearSearchInArray {
	public static void main(String[] args) {
		int[] arr = { 10, 20, 40, 29 };
		int key = 40;

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == key) {
				System.out.println("key is found in index: " + i);
				return;
			}
		}
		System.out.println("key not found");
	}
}
