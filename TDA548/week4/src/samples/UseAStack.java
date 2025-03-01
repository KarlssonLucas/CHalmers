package samples;

import java.util.ArrayDeque;
import java.util.Deque;

import static java.lang.System.out;

/*
 * Using a Stack
 *
 * A Stack is very much like a list but we insert and remove from at specific
 * position called the "top" (= index 0)
 *
 * As with ArrayList, Java stacks are generic and we separate implementation and
 * interface (the specification)
 *
 * See: https://en.wikipedia.org/wiki/Stack_(abstract_data_type)
 *
 * You don't need to learn all the methods by heart,
 * if allowed to use on exam you'll get a list.
 */

public class UseAStack {


    public static void main(String[] args) {
        new UseAStack ().program ();
    }

    void program() {
        // Stack has a "strange" type in Java
        // Interface is Deque and implementation is ArrayDeque
        Deque<Integer> stack = new ArrayDeque<> ();

        out.println (stack.isEmpty ());  // [ ]    (the empty stack)

        stack.push (1);                 // [ 1 ] add on top (index 0)
        out.println (stack.peek ());         // Just read
        stack.push (2);                  // [ 2, 1 ] add on top
        out.println (stack.peek ());
        stack.push (3);                  // [ 3, 2, 1, ] add on top
        out.println (stack.peek ());
        out.println (stack.size () == 3);   // true

        int i = stack.pop ();              // [ 2, 1 ], remove 3 from top
        out.println (i == 3);
        out.println (stack.size () == 2);  // true

        stack.pop ();                     // [ 1 ], remove from top
        stack.pop ();                     // [ ], remove from top
        out.println (stack.isEmpty ());    // true

        stack.push (99);                   // [ 99 ]
        stack.push (100);                  // [ 100, 99  ]
        stack.clear ();                    // [ ]
        out.println (stack.isEmpty ());     // true

        // ----- Stack with other element types -------------

        Deque<String> sStack = new ArrayDeque<> ();
        Deque<Double> dStack = new ArrayDeque<> ();
        Deque<Character> chStack = new ArrayDeque<> ();
    }

}
