package tp02;

/**
 * TwoDicePlayerGame
 */
public class TwoDicePlayerGame {
    DicePlayer player1;
    DicePlayer player2;

    public TwoDicePlayerGame(String name1, String name2) {
        this.player1 = new DicePlayer(name1);
        this.player2 = new DicePlayer(name2);
    }

    public DicePlayer winner() {
        if (this.player1.nbDiceRolls < this.player2.nbDiceRolls) {
            return this.player1;
        } else if (this.player2.nbDiceRolls < this.player1.nbDiceRolls) {
            return this.player2;
        } else if (this.player1.totalValue > this.player2.totalValue) {
            return this.player1;
        }
        return this.player2;
    }

    public static void main(String[] args) {
        TwoDicePlayerGame game = new TwoDicePlayerGame("Dubsinho", "Scavonade");
        Dice dice = new Dice(6);

        game.player1.playDice(dice);
        game.player2.playDice(dice);
        System.out.println(game.winner());
    }
}