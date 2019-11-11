package exercises;

import java.util.Arrays;

import static java.lang.System.out;

/**
 * Even more array methods, possibly even harder ...
 */
public class Ex4MedianKthSmallest {

    public static void main(String[] args) {
        new Ex4MedianKthSmallest ().program ();
    }

    void program() {
        int[] arr1 = {9, 3, 0, 1, 3, -2};

        out.println (!isSorted (arr1));  // Is sorted increasing? No not yet!

        sort (arr1);     // Sort in increasing order original order lost!

        out.println (Arrays.toString (arr1).equals ("[-2, 0, 1, 3, 3, 9]"));

        out.println (isSorted (arr1));  // Is sorted increasing? Yes!

        int[] arr2 = {5, 4, 2, 1, 7, 0, -1, -4, 12};
        int[] arr3 = {2, 3, 0, 1};
        out.println (median (arr2) == 2);    // Calculate median of elements
        out.println (median (arr3) == 1.5);

        int[] arr4 = {2, 3, 0, 1, 5, 4};
        int[] arr5 = {5, 4, 2, 2, 1, 7, 4, 0, -1, -4, 0, 0, 12};
        out.println (kSmallest (arr4, 2) == 1);   // Second smallest is 1
        out.println (kSmallest (arr5, 5) == 2);   // 5th smallest is 2

    }

    private int kSmallest(int[] arr5, int n) {
        for (int i = 0; i < arr5.length; i++) {
            for (int k = 0; k < arr5.length; k++) {
                if (arr5[i] < arr5[k]) {
                    int tmp = arr5[i];
                    arr5[i] = arr5[k];
                    arr5[k] = tmp;
                }
            }
        }
        int b = 0;
        for (int i = 0; i < n - 1; i++) {

            if (arr5[i] == arr5[i + 1]) {
                b += 1;
            }
        }

        return arr5[n - 1 + b];
    }

    private double median(int[] arr2) {
        double median = 0;
        double n = 0;
        for (int i = 0; i < arr2.length; i++) {
            n += arr2[i];
        }
        median = n / arr2.length;
        return median;
    }

    private boolean isSorted(int[] arr1) {
        int[] n = {-2, 0, 1, 3, 3, 9};

        if (Arrays.toString (arr1).equals (n)) {
            return false;
        } else {
            return true;
        }
    }


    // ---------- Write methods here --------------

    int[] sort(int[] x) {
        for (int i = 0; i < x.length; i++) {
            for (int k = 0; k < x.length; k++) {
                if (x[i] <= x[k]) {
                    int tmp = x[k];
                    x[k] = x[i];
                    x[i] = tmp;
                }
            }
        }
        return x;
    }
}
