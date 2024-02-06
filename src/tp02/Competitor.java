package tp02;

/**
 * Competitor
 */
public class Competitor {
    private String numberSign;
    private int time;
    private int score;
    
    public Competitor(int numberSign, int score, int min, int sec) {
        if ((numberSign >= 1 && numberSign <= 100) && (score >= 0 && score <= 50) && (sec >= 0 && sec <= 60)) {
            this.numberSign = "No" + numberSign;
        } else {
            this.numberSign = null;
        }
        this.score = score;
        this.time = min * 60 + sec;
    }

    public String display() {
        return "[" + this.numberSign + ", " + this.score + " points, " + this.time + "s]";
    }

    public static void main(String[] args) {
        Competitor[] tab = new Competitor[]{
            new Competitor(1,45,15,20),
            new Competitor(2,32,12,45),
            new Competitor(5,12,13,59),
            new Competitor(12,12,15,70),
            new Competitor(32,75,15,20),
        };

        for (Competitor competitor : tab) {
            if (competitor.numberSign != null) {
                System.out.println(competitor.display());
            }
        }
    }
}