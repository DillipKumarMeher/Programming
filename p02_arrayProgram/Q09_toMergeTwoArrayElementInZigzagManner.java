package p02_arrayProgram;

/*Example:
a = {1, 3, 5}
b = {2, 4, 6}
Output: 1 2 3 4 5 6*/

public class Q09_toMergeTwoArrayElementInZigzagManner {
	public static void main(String[] args) {
		int[] a = { 1, 3, 5 };
		int[] b = { 2, 4, 6 };
		int[] c = new int[a.length + b.length];

		int k = 0;
		for (int i = 0; i < a.length; i++) {
			c[k] = a[i];
			k++;
		}
		for (int i = 0; i < b.length; i++) {
			c[k] = b[i];
			k++;
		}
		for (int i = 0; i < c.length; i++) {
			for (int j = i + 1; j < c.length; j++) {
				if (c[i] > c[j]) {
					int temp = c[i];
					c[i] = c[j];
					c[j] = temp;
				}
			}
		}
		for (int i = 0; i < c.length; i++) {
			System.out.print(c[i] + " ");
		}
	}
}
