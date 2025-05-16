package p03_stringProgram;

public class Q06_toCountVowelsConsonantsDigitsAndSpecialCharactersInAGivenString {
	public static void main(String[] args) {
		String str = "Hello@123World!";
		int vowels = 0, consonants = 0, digits = 0, specialCharacters = 0;

		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);

			if (ch >= 'A' && ch <= 'Z' || ch > 'a' && ch <= 'z') {
				if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || ch == 'A' || ch == 'E' || ch == 'I'
						|| ch == 'O' || ch == 'U') {
					vowels++;
				} else {
					consonants++;
				}

			} else if (ch >= '0' && ch <= '9') {
				digits++;
			} else {
				specialCharacters++;
			}
		}
		System.out.println("Vowels: " + vowels);
		System.out.println("Consonants: " + consonants);
		System.out.println("Digits: " + digits);
		System.out.println("Special Characters: " + specialCharacters);
	}
}
