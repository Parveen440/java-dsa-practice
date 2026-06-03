package Strings;
//Leetcode-08
public class StringToInteger {
    public int myAtoi(String s) {
        s = s.trim();
        int count = 0;
        long result = 0; // use long to detect overflow
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            if (count != 1 && (s.charAt(i) == '+' || s.charAt(i) == '-')) {
                // sign handling
                if (s.charAt(i) == '-') {
                    sb.append('-');
                }
                count = 1; // sign found
            }
            else if (Character.isDigit(s.charAt(i))) {
                count = 1;
                sb.append(s.charAt(i));
            }
            else {
                break; // stop when non-digit found
            }
        }

        String st = sb.toString();
        if (st.isEmpty() || st.equals("-") || st.equals("+")) {
            return 0;
        }

        try {
            result = Long.parseLong(st); // parse as long to detect overflow
        } catch (NumberFormatException e) {
            // number is too large or too small
            if (st.charAt(0) == '-') return Integer.MIN_VALUE;
            else return Integer.MAX_VALUE;
        }

        if (result > Integer.MAX_VALUE) return Integer.MAX_VALUE;
        if (result < Integer.MIN_VALUE) return Integer.MIN_VALUE;

        return (int) result;
    }
}
//Time Complexity : O(n)
//Space Complexity : O(n)
