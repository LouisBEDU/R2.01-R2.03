package tp02;

import util.Keyboard;

/**
 * NDicePlayerGame
 */
public class NDicePlayerGame {
    DicePlayer[] players;

    NDicePlayerGame(int number) {
        this.players = new DicePlayer[number];
        for (int i = 0; i < this.players.length; i++) {
            this.players[i] = new DicePlayer("Joueur" + (i + 1));
        }
    }

    DicePlayer[] winner() {
        int minRolls = Integer.MAX_VALUE;
        for (DicePlayer player : this.players) {
            if (player.nbDiceRolls < minRolls) {
                minRolls = player.nbDiceRolls;
            }
        }

        int countWinners = 0;
        for (DicePlayer player : this.players) {
            if (player.nbDiceRolls == minRolls) {
                countWinners++;
            }
        }

        DicePlayer[] winners = new DicePlayer[countWinners];
        int index = 0;
        for (DicePlayer player : this.players) {
            if (player.nbDiceRolls == minRolls) {
                winners[index] = player;
                index++;
            }
        }

        return winners;
    }

    public static void main(String[] args) {
        Dice dice = new Dice(6);
        NDicePlayerGame game = new NDicePlayerGame(Keyboard.readInt("Saisir un entier :"));

        for (int i = 0; i < game.players.length; i++) {
            game.players[i].playDice(dice);
        }

        DicePlayer[] winner = game.winner();
        System.out.println("Les vainqueurs:");
        for (DicePlayer dicePlayer : winner) {
            System.out.println(dicePlayer);
        }
    }
}