package p01_numberProgram;

/*Power of n^p (n to the power p) means multiplying n by itself p times.

Example:
If n = 2, p = 3
→ 2^3 = 2 × 2 × 2 = 8

Formula:
n^p = n × n × n × ... (p times)*/

public class Q10_powerOf_nxp {
	public static void main(String[] args) {
		int n = 2; // base
		int p = 3; // power
		int result = 1;

		for (int i = 1; i <= p; i++) {
			result = result * n;
		}

		System.out.println(result);
	}
}
