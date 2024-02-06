package tp02;

/**
 * OneDicePlayerGame
 */
public class OneDicePlayerGame {
    public static void main(String[] args) {
        Dice dice = new Dice(6);
        DicePlayer player = new DicePlayer("Dubsinho");
        
        player.playDice(dice);
        System.out.println(player);
    }
}