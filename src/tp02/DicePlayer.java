package tp02;

/**
 * DicePlayer
 */
public class DicePlayer {
    String name;
    int totalValue = 0;
    int nbDiceRolls = 0;

    public DicePlayer(String name) {
        this.name = name;
    }

    void playDice(Dice dice) {
        while (this.totalValue < 20) {
            this.nbDiceRolls++;
            dice.roll();
            this.totalValue += dice.value;
        }
    }

    public String toString() {
        return this.name + ": " + this.totalValue + " points en " + this.nbDiceRolls + " coups.";
    }
}