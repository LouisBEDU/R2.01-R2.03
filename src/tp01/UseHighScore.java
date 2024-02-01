package tp01;

/**
 * UseHighScore
 */
public class UseHighScore {
    public static void main(String[] args) {
        HighScore leaderBoard = new HighScore(3);
        leaderBoard.ajout(new Score("Alice", 300, "29/01"));
        leaderBoard.ajout(new Score("Bob",800, "29/01"));
        leaderBoard.ajout(new Score("Alice", 42, "30/01"));
        leaderBoard.ajout(new Score("Alice", 650, "31/01"));
        System.out.println(leaderBoard);
    }
}