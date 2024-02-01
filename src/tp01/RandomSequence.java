package tp01;

import java.util.Random;

/**
 * RandomSequence
 */
public class RandomSequence {
    public static void main(String[] args) {
        boolean integer = true;
        if (args.length == 3 && args[2].equals("REAL")) integer = false;
        if (args.length >= 2 && args.length <= 3) {
            int nbElt = Integer.parseInt(args[0]), maxVal = Integer.parseInt(args[1]);
            Random alea = new Random();

            for (int i = 0; i < nbElt; i++) {
                if (integer) {
                    System.out.println(alea.nextInt(maxVal));
                } else {
                    System.out.println(alea.nextDouble(maxVal));
                }
            }
        } else {
            System.out.println("Correct usage : <nbElt> <maxVal> [INTEGER|REAL]");
        }
    }
}