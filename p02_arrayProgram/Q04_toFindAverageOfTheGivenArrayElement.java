package p02_arrayProgram;

public class Q04_toFindAverageOfTheGivenArrayElement {
	public static void main(String[] args) {
		int[] arr = { 10,20,30 };
		int sum =0;

		for(int i=0; i<arr.length; i++) {
			sum+=arr[i];
		}
		double average =sum/arr.length;
		System.out.println("Average: "+average);
	}
}
