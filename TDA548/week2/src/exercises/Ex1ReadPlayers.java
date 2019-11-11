package exercises;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

import static java.lang.System.in;
import static java.lang.System.out;

/*
 *  Utilities to input/output player data for a command line game
 *
 *  See:
 *  - UseAConstructor
 *  - ObjectArrMeth
 *
 */
public class Ex1ReadPlayers {
    public static void main(String[] args) {
        new Ex1ReadPlayers ().program ();
    }

    final Scanner sc = new Scanner (in);

    void program() {
        Player[] players = inputPlayers ();
        outPlayers (players);
    }

    // This class captures the concept of a Player
    class Player {
        String name;   // A Player has a name and...
        int points;    // ... and points

        Player(String n, Integer p) {
            name = n;
            points = p;
        }

    }

    // ---------- Methods -------------------

    Player[] inputPlayers() {
        Player[] players;
        out.println ("How many players? > ");
        players = new Player[Integer.parseInt (sc.nextLine ())];   // Hard coded players, replace *last* of all with ... (see below)
        for (int i = 0; i <= players.length - 1; i++) {

            out.println ("Enter name of player " + (i + 1) + " :");
            String str = sc.nextLine ();
            players[i] = new Player (str, 0);

        }

        return players;
    }

    void outPlayers(Player[] players) {
        out.println ("Players are:");
        for (int i = 0; i < players.length; i++) {
            out.println (players[i].name + " have " + players[i].points + " points");
        }
    }


}
