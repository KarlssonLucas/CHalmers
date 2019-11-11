package exercises;

import java.util.Scanner;

import static java.lang.System.in;
import static java.lang.System.out;

/*
 *  Using class objects to represent heroes
 *  https://en.wikipedia.org/wiki/Gladiators_(1992_UK_TV_series)
 *
 * See:
 * - ClassObjects
 * - MethodsArrObj
 */
public class Ex6ClassObjects {

    public static void main(String[] args) {
        new Ex6ClassObjects ().program ();
    }

    final Scanner sc = new Scanner (in);

    void program() {
        Hero h1 = new Hero ();
        Hero h2 = new Hero ();

        out.print ("name? ");
        h1.name = sc.nextLine ();

        out.print ("strength? ");
        h1.strength = sc.nextInt ();

        int n = sc.nextInt ();

        out.println ("name? ");
        h2.name = sc.nextLine ();

        out.println ("strength? ");
        h2.strength = sc.nextInt ();

        if (h1.strength > h2.strength) {
            out.println (h1.name + " stronger");
        }
        if (h2.strength > h1.strength) {
            out.println (h2.name + " stronger");
        } else ;
        out.println ("equal");
    }

    // ------ The class to use  -----------
    // A class for objects that describes a Hero
    class Hero {
        String name;
        int strength;
    }


}
