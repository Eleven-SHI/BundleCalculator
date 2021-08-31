package code_challenge_bundle_calculator;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class BundleCalculator {
	public static void calculate(String input) {
		Pattern imagePattern = Pattern.compile("^[0-9]+\\sIMG$", Pattern.CASE_INSENSITIVE);
		Matcher imageMatcher = imagePattern.matcher(input.trim());
		Pattern audioPattern = Pattern.compile("^[0-9]+\\sFLAC$", Pattern.CASE_INSENSITIVE);
		Matcher audioMatcher = audioPattern.matcher(input.trim());
		Pattern videoPattern = Pattern.compile("^[0-9]+\\sVID$", Pattern.CASE_INSENSITIVE);
		Matcher videoMatcher = videoPattern.matcher(input.trim());
		if (imageMatcher.find()) {
			ImageCalculator.calculate(Integer.parseInt(input.trim().split(" ")[0]));
		} else if (audioMatcher.find()) {
			AudioCalculator.calculate(Integer.parseInt(input.trim().split(" ")[0]));
		} else if (videoMatcher.find()) {
			VideoCalculator.calculate(Integer.parseInt(input.trim().split(" ")[0]));
		} else {
			System.out.println("----This line has no match---- " + input);
		}
	}

	public static void imageCalculator(int input) {
		System.out.println("IMG " + input);
	}

	public static void audioCalculator(int input) {
		System.out.println("FLAC " + input);
	}
	
	public static int[] division(int numerator, int denominator) {
		int quotient = Math.floorDiv(numerator, denominator);
		int remainder = Math.floorMod(numerator, denominator);
		int[] result = { quotient, remainder };

		return result;
	}

}
