package p01_numberProgram;

/*✅ Example:
Input: 1210 → first+last = 1+0 = 1, middle sum = 2+1 = 3 → Not equal → Phloem
Input: 12321 → first+last = 1+1 = 2, middle sum = 2+3 = 5 → Not equal → Phloem
Input: 143 → first+last = 1+3 = 4, middle sum = 4 → Equal → Xylem
*/

public class Q33_givenNoIsXylemOrPhloemNoOrNot {

	public static void main(String[] args) {
		int num = 143;
		int n = num;
		int last = n % 10;

		int middleSum = 0;
		n = n / 10;

		while (n >= 10) {
			int digit = n % 10;
			middleSum = middleSum + digit;
			n = n / 10;
		}

		int first = n;
		int edgeSum = first + last;

		if (edgeSum == middleSum) {
			System.out.println(num + " is a Xylem number");
		} else {
			System.out.println(num + " is a Phloem number");
		}
	}
}
