package p02_arrayProgram;

public class Q19_InsertElementInArray {
	public static void main(String[] args) {
		int[] arr = { 10, 20, 30, 40, 50 };
		int[] newArr = new int[arr.length + 1];
		int pos = 2;
		int elm = 22;

		for (int i = 0; i < pos; i++) {
			newArr[i] = arr[i];
		}
		newArr[pos] = elm;
		for (int i = pos; i < arr.length; i++) {
			newArr[i + 1] = arr[i];
		}
		for (int i = 0; i < newArr.length; i++) {
			System.out.print(newArr[i] + " ");
		}
	}
}
