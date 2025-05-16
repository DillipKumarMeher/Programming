package p03_stringProgram;

import java.util.Arrays;

/*Examples:
"listen" → "silent" ✅ (anagram)
"race" → "care" ✅ (anagram)
"hello" → "hell" ❌ (not an anagram — missing a letter)
"rat" → "tar" ✅ (anagram)*/

public class Q07_toCheckWetherTheTwoStringISAnagramOrNot {
	public static void main(String[] args) {
		String st1 = "silesnt";
		String st2 = "listen";

		if (st1.length() != st2.length()) {
			System.out.println("Not a Anagram");
			return;
		}
		char[] arr1 = st1.toCharArray();
		char[] arr2 = st2.toCharArray();

		Arrays.sort(arr1);
		Arrays.sort(arr2);

		if (Arrays.equals(arr1, arr2)) {
			System.out.println("Anagram");
		} else {
			System.out.println("Not a Anagram");
		}
	}
}
