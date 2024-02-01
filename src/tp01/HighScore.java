package tp01;

/**
 * HighScore
 */
public class HighScore {
    Score[] top;

    HighScore(int lenght) {
        this.top = new Score[lenght];
    }

    boolean ajout(Score newScore) {
        Score tmp1, tmp2;
        for (int i = 0; i < top.length; i++) {
            if (this.top[i] == null) {
                this.top[i] = newScore;
                return true;
            } else if (newScore.score >= this.top[i].score) {
                tmp1 = top[i];
                top[i] = newScore;

                for (int j = i + 1; j < top.length; j++) {
                    tmp2 = top[j];
                    top[j] = tmp1;
                    tmp1 = tmp2;
                }

                return true;
            }
        }

        return false;
    }

    public String toString() {
        String res = "TOP SCORE:\n";
        for (int i = 0; i < top.length; i++) {
            res += top[i] + "\n";
        }
        return res;
    }
}