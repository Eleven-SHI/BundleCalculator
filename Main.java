package code_challenge_bundle_calculator;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		try {
			File myObj = new File("input.txt");
			Scanner myReader = new Scanner(myObj);
			while (myReader.hasNextLine()) {
				String line = myReader.nextLine();
				BundleCalculator.calculate(line);
			}
			myReader.close();
		} catch (FileNotFoundException e) {
			System.out.println("Error reading file");
			e.printStackTrace();
		}

//		for (int i = 0; i < 100; i++) {
//			VideoCalculator.calculate(i);
//			System.out.println("---------------------------------------");
//		}
//		VideoCalculator.getSolutionNotFoundList();
		
	}

	public static void process_data(String input) {

	}
}
