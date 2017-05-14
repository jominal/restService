package Controller;

public class NumMatcher {

	public static String numMatcher(int sum) {
		String femalename = "";

		if (sum < 800) {
			femalename = "Maria";
		} else if (sum >= 800 && sum < 1200) {
			femalename = "Elena";
		} else if (sum >= 1200 && sum < 1600) {
			femalename = "Marina";
		} else if (sum >= 1600) {
			femalename = "Nancy";
		}
		return femalename;
	}
}
