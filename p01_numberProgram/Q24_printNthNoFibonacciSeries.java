package p01_numberProgram;

public class Q24_printNthNoFibonacciSeries {

	public static void main(String[] args) {

		int n = 7;
		int a = 0;
		int b = 1;
		int c = 0;

		for (int i = 1; i <= n; i++) {
		
			c = a + b;
			a = b;
			b = c;
		}
		System.out.println(a);
	}

}
