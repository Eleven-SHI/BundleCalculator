package code_challenge_bundle_calculator;

//import java.util.ArrayList;

public class VideoCalculator {
	static int bundle1Amount = 9;
	static int bundle1Price = 1530;
	static int bundle2Amount = 5;
	static int bundle2Price = 900;
	static int bundle3Amount = 3;
	static int bundle3Price = 570;
	
	static int total;
	static int bundle1;
	static int remainder1;
	static int bundle2;
	static int remainder2;
	static int bundle3;
	static int remainder3;

//	static ArrayList<Integer> solutionNotFoundList = new ArrayList<Integer>();

	public static void calculate(int input) {
		total = input;
		bundle1 = Math.floorDiv(total, bundle1Amount);
		remainder1 = Math.floorMod(total, bundle1Amount);
//		System.out.println(total + "/" + bundle1Amount + " = " + bundle1 + "..." + remainder1);
		calculateLv2();
	}

//	public static void getSolutionNotFoundList() {
//		System.out.println("These Solutions were not found:");
//		for (Integer i : solutionNotFoundList) {
//			System.out.println(i);
//		}
//	}
public static void calculateLv2() {
	bundle2 = Math.floorDiv(remainder1, bundle2Amount);
	remainder2 = Math.floorMod(remainder1, bundle2Amount);
//		System.out.println(remainder1 + "/" + bundle2Amount + " = " + bundle2 + "..." + remainder2);
	calculateLv3();
}
	public static void calculateLv3() {
		bundle3 = Math.floorDiv(remainder2, bundle3Amount);
		remainder3 = Math.floorMod(remainder2, bundle3Amount);
//		System.out.println(remainder2 + "/" + bundle3Amount + " = " + bundle3 + "..." + remainder3);
		if (remainder3 != 0) {
			if (bundle2 > 0) {
				bundle2 -= 1;
				remainder2 += bundle2Amount;
				calculateLv3();
			} else if (bundle1 > 0) {
				bundle1 -= 1;
				remainder1 += bundle1Amount;
				calculateLv2();
			} else {
//				solutionNotFoundList.add(total);
//				System.out.println(total + " solution not found");
				VideoImperfectSolutionFinder.calculate(total);
			}
		} else {
			printVideoResult();
		}
	}



	public static void printVideoResult() {
		System.out
				.println(total + " VID $" + (bundle1 * bundle1Price + bundle2 * bundle2Price + bundle3 * bundle3Price));
		if (bundle1 > 0) {
			System.out.println("   " + bundle1 + " x " + bundle1Amount + " $" + bundle1 * bundle1Price);
		}
		if (bundle2 > 0) {
			System.out.println("   " + bundle2 + " x " + bundle2Amount + " $" + bundle2 * bundle2Price);
		}
		if (bundle3 > 0) {
			System.out.println("   " + bundle3 + " x " + bundle3Amount + " $" + bundle3 * bundle3Price);
		}
	}
}
