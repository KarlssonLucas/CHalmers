package exercises;

public class klump {
    public static void main(String[] args) {
        String s = "aaaaabbbbccccc";
        s = sKomp (s);
        System.out.println (s);
    }

    static String sKomp(String s) {
        int n = 1;
        StringBuilder sDes = new StringBuilder ();

        for (int i = 0; i < s.length (); i++) {
            if (i + 1 < s.length () && s.charAt (i) == s.charAt (i + 1)) {
                n += 1;
                continue;
            }
            if (s.length () == 1) {
                sDes.append (s.length ());
                sDes.append (s.charAt (0));

                return sDes.toString ();
            }
            sDes.append (n);
            sDes.append (s.charAt (i - 1));
            n = 1;
        }
        s = sDes.toString ();
        return s;
    }
}

