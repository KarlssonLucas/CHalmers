class matrixsquare {
    public static void main(String[] args) {
        String str = "aaabbbcccbbb";
        String s = StringCompr (str);
        System.out.println (s);
    }

    private static String StringCompr(String str) {
        StringBuilder sb = new StringBuilder ();
        int nChar = 1;

        for (int i = 0; i < str.length () - 1; i++) {
            char ch = str.charAt (i);
            if (ch == str.charAt (i + 1)) {
                nChar++;
                continue;
            } else if (ch != str.charAt (i + 1) || i == str.length () - 1) {
                sb.append (nChar);
                sb.append (ch);
                nChar = 1;
                continue;
            }
            sb.append (nChar);
            sb.append (ch);
        }
        System.out.println (sb.toString ());
        return sb.toString ();
    }

}





