package p03_stringProgram;

public class Q10_toCountOccurrencesOfEachCharacter {
	public static void main(String[] args) {
		String str = "ImTheBoss";

		for (int i = 0; i < str.length(); i++) {
			char current = str.charAt(i);

			boolean alreadyCount = false;
			for (int j = 0; j < i; j++) {
				if (str.charAt(j) == current) {
					alreadyCount = true;
					break;
				}
			}
			if (alreadyCount) {
				continue;
			}
			int count = 0;
			for (int k = 0; k < str.length(); k++) {
				if (str.charAt(k) == current) {
					count++;
				}
			}
			System.out.println(current + ":" + count);
		}
	}
}
