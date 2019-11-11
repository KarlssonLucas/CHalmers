package exercises;

import java.util.Arrays;

import static java.lang.System.out;

/*
    Find three elements in sorted array that adds up to 0.
    Return indices to the elements as an array.

 */
public class Ex6ThreeSumToZero {

    public static void main(String[] args) {
        new Ex6ThreeSumToZero ().program ();
    }


    void program() {
        int[] arr1 = {-25, -10, -7, -3, 2, 4, 8, 10}; // Must be sorted
        int[] arr2 = {0, 1, 2, 4, 8, 10};
        int[] arr3 = {-2, 1, 1};
        int[] arr4 = {0, 0, 0, 0};


        out.println (Arrays.toString (getThreeSum (arr1)));    // [1, 4, 6]
        out.println (Arrays.toString (getThreeSum (arr2)));    // []
        out.println (Arrays.toString (getThreeSum (arr3)));    // [0, 1, 2]
        out.println (Arrays.toString (getThreeSum (arr4)));    // [ 0, 1 ,3 ] or any
    }

    private int[] getThreeSum(int[] arr2) {
        int[] arr10 = new int[3];

        for (int i = 0; i < arr2.length; i++) {
            for (int k = 0; k < arr2.length; k++) {
                for (int m = 0; m < arr2.length; m++) {
                    if (arr2[m] + arr2[k] + arr2[i] == 0) {
                        arr10[0] = arr2[m];
                        arr10[1] = arr2[k];
                        arr10[2] = arr2[i];
                    }
                }
            }
        }

        return arr10;

    }


}
