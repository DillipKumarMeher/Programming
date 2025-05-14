package p01_numberProgram;

public class Q35_printNthOfPrimeNo {

	public static void main(String[] args) {

		int n = 3;
		int count = 0;

		int num = 2;

		while (true) {
			int div = 0;

			for (int i = 1; i <= num; i++) {
				if (num % i == 0) {
					div++;
				}
			}
			if (div == 2) {
				count++;

				if (count == n) {
					System.out.println(n + "th prime number is: " + num);
					break;
				}
			}
			num++;
		}
	}
}
