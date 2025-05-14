package p01_numberProgram;

public class Q27_givenNoFirstNoIsEvenOrAdd {

	public static void main(String[] args) {

		int n = 54478;

		while (n > 9) {
			n = n / 10;
		}
		if (n % 2 == 0) {
			System.out.println("Even No: " + n);
		} else {
			System.out.println("Add no: " + n);
		}

	}

}
