package exercises.ex1useaclass;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class klump {
    public static void main(String[] args) {
        int[] array = {1, 2, 2, 2, 2, 2, 2, 2, 3, 4, 5};
        int[] array1 = {1, 2, 3, 4, 5};

        System.out.println (nClump (array));
        System.out.println (nClump (array1));
    }

    static int nClump(int arr[]) {
        int n = 0;
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] == arr[i + 1]) {

                n++;
            }
            // NOTE: Order of conjunction!
            while (i < arr.length - 1 && arr[i] == arr[i + 1]) {
                i++;
            }
        }
        return n;
    }
}
