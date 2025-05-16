package p02_arrayProgram;

import java.util.Scanner;

public class Q01_takeInputFromUserAndPrint {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		System.out.println("Enter the size");
		int size = s.nextInt();

		System.out.println("Enter the element");
		int arr[] = new int[size];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = s.nextInt();
		}

		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		s.close();
	}
}
