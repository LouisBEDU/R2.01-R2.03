package tp01;

import java.util.Random;

/**
 * Irregular
 */
public class Irregular {
    int[][] tab;

    Irregular(int[] lineSize) {
        tab = new int[lineSize.length][];
        for (int i = 0; i < lineSize.length; i++) {
            tab[i] = new int[lineSize[i]];
        }
    }

    void randomFilling() {
        Random alea = new Random();
        for (int i = 0; i < tab.length; i++) {
            for (int j = 0; j < tab[i].length; j++) {
                tab[i][j] = alea.nextInt(10);
            }
        }
    }

    String display() {
        String res = "";
        for (int i = 0; i < tab.length; i++) {
            for (int j = 0; j < tab[i].length; j++) {
                res += tab[i][j] + " ";
            }
            res += '\n';
        }
        return res;
    }

    boolean isCommun(int element) {
        boolean isIn = false;
        for (int i = 0; i < tab.length; i++) {
            for (int j = 0; j < tab[i].length; j++) {
                if (tab[i][j] == element) isIn = true;
            }
            if (!isIn) return false;
            isIn = false;
        }
        return true;
    }

    boolean existCommon() {
        boolean isIn = false;
        for (int i = 0; i < tab[0].length; i++) {
            isIn = this.isCommun(tab[0][0]);
        }
        return isIn;
    }
}