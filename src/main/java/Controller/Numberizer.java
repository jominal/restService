package Controller;

public class Numberizer {

	public static int numberizer(String name) {
		int sum = 0;

		for (int i = 0; i < name.length(); i++) {
			char c = name.charAt(i);// pointing in the first letter of the name

			sum += c;
		}

		return sum;

	}
}
