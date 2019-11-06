package calc;

import java.util.*;

import static java.lang.Double.NaN;
import static java.lang.Math.pow;
import static java.lang.System.out;


/*
 *   A calculator for rather simple arithmetic expressions
 *
 *   This is not the program, it's a class declaration (with methods) in it's
 *   own file (which must be named Calculator.java)
 *
 *   NOTE:
 *   - No negative numbers implemented
 */
class Calculator {

    // Here are the only allowed instance variables!
    // Error messages (more on static later)
    final static String MISSING_OPERAND = "Missing or bad operand";
    final static String DIV_BY_ZERO = "Division with 0";
    final static String MISSING_OPERATOR = "Missing operator or parenthesis";
    final static String OP_NOT_FOUND = "Operator not found";

    // Definition of operators
    final static String OPERATORS = "+-*/^";

    // Method used in REPL
    double eval(String expr) {
        if (expr.length () == 0) {
            return NaN;
        }
        List<String> tokens = tokenize (expr);
        List<String> postfix = infix2Postfix (tokens);
        return evalPostfix (postfix);
    }

    // ------  Evaluate RPN expression -------------------

    public double evalPostfix(List<String> postfix) {
        return 0;  // TODO
    }


    double applyOperator(String op, double d1, double d2) {
        switch (op) {
            case "+":
                return d1 + d2;
            case "-":
                return d2 - d1;
            case "*":
                return d1 * d2;
            case "/":
                if (d1 == 0) {
                    throw new IllegalArgumentException (DIV_BY_ZERO);
                }
                return d2 / d1;
            case "^":
                return pow (d2, d1);
        }
        throw new RuntimeException (OP_NOT_FOUND);
    }

    // ------- Infix 2 Postfix ------------------------

    public List<String> infix2Postfix(List<String> tokens) {
        return null; // TODO
    }


    int getPrecedence(String op) {
        if ("+-".contains (op)) {
            return 2;
        } else if ("*/".contains (op)) {
            return 3;
        } else if ("^".contains (op)) {
            return 4;
        } else {
            throw new RuntimeException (OP_NOT_FOUND);
        }
    }

    Assoc getAssociativity(String op) {
        if ("+-*/".contains (op)) {
            return Assoc.LEFT;
        } else if ("^".contains (op)) {
            return Assoc.RIGHT;
        } else {
            throw new RuntimeException (OP_NOT_FOUND);
        }
    }

    enum Assoc {
        LEFT,
        RIGHT
    }

    public List<String> tokenize(String expr) {
        String digits = "1234567890";
        List<String> afterTokenize = new ArrayList<String> ();
        StringBuilder temp = new StringBuilder ();

        for (int i = 0; i < expr.length (); i++) {
            char ch = expr.charAt (i);
            if (Character.isWhitespace (ch)) {
                continue;
            }
            if (digits.contains (String.valueOf (ch))) {
                temp.append (ch);
            }
            if (digits.contains (String.valueOf (ch)) && i == expr.length () - 1) {
                afterTokenize.add (String.valueOf (temp));
                continue;
            }
            if (!digits.contains (String.valueOf (ch)) && !(temp.length () == 0)) {
                afterTokenize.add (String.valueOf (temp));
                temp.setLength (0);
            }
            if (!digits.contains (String.valueOf (ch))) {
                afterTokenize.add (String.valueOf (ch));
            }
        }
        return afterTokenize;
    }
}
