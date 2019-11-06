package exercises.ex1useaclass;

public class Cosinus {
    public static void main(String[] args) {
        cosinus ();
    }

    static void cosinus() {
        int n = 5;
        double degrees = 90;
        double cosVar = 1;
        double rad = rad (degrees);

        int termPos = 1;

        int pow = 2;
        for (int i = 0; i < n; i++) {
            termPos = termPos * -1;
            cosVar = cosVar + (termPos * ((Math.pow (rad, pow)) / fauc (pow)));
            System.out.println (cosVar);
            pow += 2;
        }
        System.out.println (cosVar);
    }

    static int fauc(int fau) {
        if (fau == 0) {
            return 1;
        } else {
            return fauc (fau - 1) * fau;
        }
    }

    static double rad(double degrees) {
        return ((degrees * Math.PI) / 180);
    }
}

