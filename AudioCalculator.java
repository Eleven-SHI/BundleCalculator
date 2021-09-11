package code_challenge_bundle_calculator;

public class AudioCalculator {
	static int bundle1Amount = 9;
	static double bundle1Price = 1147.5;
	static int bundle2Amount = 6;
	static int bundle2Price = 810;
	static int bundle3Amount = 3;
	static double bundle3Price = 427.5;

	static int total;
	static int bundle1;
	static int remainder1;
	static int bundle2;
	static int remainder2;
	static int bundle3;
	static int remainder3;

	public static void calculate(int input) {
		total = input;
		bundle1 = Math.floorDiv(total, bundle1Amount);
		remainder1 = Math.floorMod(total, bundle1Amount);
		if (remainder1 > bundle2Amount) {
			bundle1 += 1;
			bundle2 = 0;
			printAudioResult();
		} else {
			bundle2 = Math.floorDiv(remainder1, bundle2Amount);
			remainder2 = Math.floorMod(remainder1, bundle2Amount);
			if (remainder2 > bundle3Amount) {
				bundle2 += 1;
				bundle3 = 0;
			} else {
				bundle3 = Math.floorDiv(remainder2, bundle3Amount);
				remainder3 = Math.floorMod(remainder2, bundle3Amount);
				if (remainder3 != 0) {
					bundle3 += 1;
				}
			}
			printAudioResult();
		}
	}

	public static void printAudioResult() {
		System.out.println(total + " FLAC $" + String.format("%.2f", bundle1 * bundle1Price + bundle2 * bundle2Price));
		if (bundle1 > 0) {
			System.out.println("   " + bundle1 + " x " + bundle1Amount + " $" + String.format("%.2f", bundle1 * bundle1Price));
		}
		if (bundle2 > 0) {
			System.out.println("   " + bundle2 + " x " + bundle2Amount + " $" + bundle2 * bundle2Price);
		}
	}
}
