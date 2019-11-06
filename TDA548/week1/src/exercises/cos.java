package exercises;

public class cos {
    public static void main(String[] args) {
        new cos ().program ();
    }

    void program() {
        double deg = 45;
        int n = 5;
        double rad = deg * (Math.PI / 180);
        double sig = 1, fac = 1, power = 1;
        double pow = 2;
        double cos = 0;
        for (int i = 0; i < n; i++) {
            sig = sig * -1;
            fac = fact (pow);
            power = Math.pow (rad, pow);
            pow = pow + 2;
            cos = cos + sig * (power / fac);
        }
        System.out.println (1 - cos);
    }

    int fact(double pow) {
        if (pow <= 1) {
            return 1;
        } else {
            return (int) (pow * fact (pow - 1));
        }
    }
}
