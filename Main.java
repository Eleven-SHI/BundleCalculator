package code_challenge_bundle_calculator;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        File myObj = new File("input.txt");
        try {
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
        // new code below
        File myFile = new File("input.text");
        try (Scanner myReader = new Scanner(myFile)) {
            while (myReader.hasNextLine()) {
                String line = myReader.nextLine();
                System.out.println(line);
            }
            myReader.close();
        } catch (FileNotFoundException e) {
            System.out.println("Error reading file");
            e.printStackTrace();
        }


    }

}