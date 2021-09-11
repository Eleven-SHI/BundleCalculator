package code_challenge_bundle_calculator;
public class ImageCalculator {
    static int bundle1Amount = 10;
    static int bundle1Price = 800;
    static int bundle2Amount = 5;
    static int bundle2Price = 450;

    static int total;
    static int bundle1;
    static int remainder1;
    static int bundle2;
    static int remainder2;
   // int flacbundle = BundleType.getFlacKey();


    public static void calculate(int input) {
        total = input;
        bundle1 = Math.floorDiv(total, bundle1Amount);
        remainder1 = Math.floorMod(total, bundle1Amount);
        if (remainder1 > bundle2Amount) {
            bundle1 += 1;
            bundle2 = 0;
           // printImageResult();
        } else {
            bundle2 = Math.floorDiv(remainder1, bundle2Amount);
            remainder2 = Math.floorMod(remainder1, bundle2Amount);
            if (remainder2 != 0) {
                bundle2 += 1;
            }
            printImageResult();
        }
    }

    public static void printImageResult() {
        System.out.println(total + " IMG $" + (bundle1 * bundle1Price + bundle2 * bundle2Price));
        if (bundle1 > 0) {
            System.out.println("   " + bundle1 + " x " + bundle1Amount + " $" + bundle1 * bundle1Price);
        }
        if (bundle2 > 0) {
            System.out.println("   " + bundle2 + " x " + bundle2Amount + " $" + bundle2 * bundle2Price);
        }
    }
}


