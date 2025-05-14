package p01_numberProgram;

public class Q21_multiplicationTableInBetweenTheRange {
	public static void main(String[] args) {
		int start = 5;
		int end = 10;

		for (int i = 1; i <= 10; i++) {
			for (int j = start; j <= end; j++) {
				System.out.print(j + "x" + i + "=" + (j * i)+"\t");
			}
			System.out.println();
		}
	}
}
