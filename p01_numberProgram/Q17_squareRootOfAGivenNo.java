package p01_numberProgram;

/*The square root of a number is the value that, when multiplied by itself, gives the original number.

Example:
√9 = 3 (because 3 × 3 = 9)
√16 = 4 (because 4 × 4 = 16)*/

public class Q17_squareRootOfAGivenNo {
	public static void main(String[] args) {
		int n = 9;
		boolean flag=false;
		
		
		for (int i = 1; i <= n; i++) {
			if ((i * i) == n) {
				flag=true;
				System.out.println(i);
			}
		}
		if(flag==false) {
			System.out.println("There is no squre root of this value");
		}
	}
}
