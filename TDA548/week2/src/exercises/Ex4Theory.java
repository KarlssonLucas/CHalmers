package exercises;

/*
 *  For each of the section below. Uncomment and explain
 *
 */
public class Ex4Theory {

    public static void main(String[] args) {
        new Ex4Theory ().program ();
    }


    void program() {

        // 1. -------------------------------------------

        // Uncomment and run. Which value is correct for the volume of a sphere?

        int r = 10;
        double pi = 3.141;
        double vol1 = 4 * pi / 3 * r * r * r;
        double vol2 = pi * r * r * r * (4 / 3);
        double vol3 = 4 / 3 * pi * r * r * r;
        double vol4 = 4 / (3 * pi) * r * r * r;
        System.out.println (vol1);
        System.out.println (vol2);
        System.out.println (vol3);
        System.out.println (vol4);

        // 2. ---------------------------------------------------

        // Uncomment section below and you will get compile errors. Why?
        int x = 0;
        int y = 0;
        {
            x = 0;
            {
                x = 0;
                y = 0;
                System.out.println (x);
                System.out.println (y);
            }
            x = 0;
            y = 0;
            System.out.println (x);
            System.out.println (y);
        }
        System.out.println (x);
        System.out.println (y);


        // 3. ----------------------------------------------------------

        // Uncomment and run. Explain result!

        double d1 = 1.0;
        double d2 = 1.0;
        d1 = d1 - 0.7 - 0.3;
        d2 = d2 - 0.6 - 0.4;
        System.out.println (d1 == 0);
        System.out.println (d2 == 0);
        System.out.println (d1 == d2);


        // 4. -----------------------------------------------------

        // Uncomment and run. Explain output!

        System.out.println (1 + 2);
        System.out.println ("2 + 1");
        System.out.println (1 + 2.0 + "a");
        System.out.println ("a" + 1 + 2);
        System.out.println ('a' + 1 + 2);
        System.out.println ("a" + 'a');


        // 5. ---------------------------------
        // Why is there no return type for a constructor?

    }
}
