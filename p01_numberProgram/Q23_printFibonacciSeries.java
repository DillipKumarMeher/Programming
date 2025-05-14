package p01_numberProgram;

/*The Fibonacci Series is a sequence of numbers where:
You start with 0 and 1

Each next number is the sum of the two previous numbers

So it goes like this:
Start: 0, 1
Next: 0 + 1 = 1 → Now the sequence is: 0, 1, 1
Then: 1 + 1 = 2 → 0, 1, 1, 2
Then: 1 + 2 = 3 → 0, 1, 1, 2, 3
Then: 2 + 3 = 5 → 0, 1, 1, 2, 3, 5
...and so on.*/

public class Q23_printFibonacciSeries {

	public static void main(String[] args) {

		int n = 7;
		int a=0;
		int b=1;
		int c=0;
		
		for (int i = 1; i <= n; i++) {
			System.out.println(a);
			c = a + b;
			a = b;
			b = c;
		}
	}

}
