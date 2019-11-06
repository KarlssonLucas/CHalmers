package exercises;

public class klump {
    public static void main(String[] args) {
        new klump ().program ();
    }

    void program() {
        int[] arr = {1, 1, 2, 3, 3, 3, 4, 5, 5};

        arrklump (arr);
    }


    void arrklump(int[] arr) {
        int counter = 0;
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] == arr[i + 1]) {
                counter++;
            }
            while (i + 1 < arr.length && arr[i] == arr[i + 1]) {
                i++;
            }
        }
        System.out.println (counter);
    }
}