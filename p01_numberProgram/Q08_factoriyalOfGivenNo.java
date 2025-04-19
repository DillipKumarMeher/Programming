package p01_numberProgram;

/*Factorial of a number is
multiplying all numbers from 1 to n.

Example (5!):
5! = 5 × 4 × 3 × 2 × 1 = 120

How:
Start from 1

Keep multiplying till n*/

public class Q08_factoriyalOfGivenNo {
	public static void main(String[] args) {

		int n = 5;
		int factorial = 1;
		
		for (int i = n; i >= 1; i--) {
			factorial *= i;
		}
		System.out.println(factorial);
	}
}
