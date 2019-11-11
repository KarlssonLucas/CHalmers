package exercises.ex1useaclass;

import static java.lang.Math.abs;

/*
 *    A class representing a rational number
 *
 *    NOTE: No IO here, this is just the logical concept.
 *
 *    Test the class by running Ex1TestRational.
 *
 * See:
 * - useaclass/
 * - UseAMap
 */

public class Rational {

    private final int num;    // rational =  num / denom
    private final int denom;

    Rational(int num, int denom) {
        this.num = num;
        this.denom = denom;
    }

    int getNum() {
        if (num % denom == 1) {
            return num;
        } else {
            return div (num, denom);
        }
    }

    int getDenom() {
        for (int i = (int) Math.sqrt (denom); i < denom; i++) {
            if (denom % i == 0) {
                return denom % i;
            }
        }
        return denom;
    }

    int div(int a, int b) {
        if (b == 0 | a % b == 0) {
            return a;
        }
        return (div (b, a % b));
    }
}

