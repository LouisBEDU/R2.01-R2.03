package tp02;

import java.util.Random;

/**
 * Dice
 */
public class Dice {
    int numberSides = 1;
    Random rand = new Random();
    int value;

    public Dice(int numberSides) {
        if (numberSides > 0) this.numberSides = numberSides;
        this.value = rand.nextInt(this.numberSides) + 1;
    }
    
    public void roll() {
        this.value = rand.nextInt(this.numberSides) + 1;
    }

    public String toString() {
        return "La valeur du dé est de : " + this.value;
    }
}