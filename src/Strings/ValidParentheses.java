package Strings;
import java.util.*;
public class ValidParentheses {
    public boolean isValid(String s) {

        // Stack to store opening brackets
        Stack<Character> st = new Stack<>();
        for (char c : s.toCharArray()) {
            // Push opening brackets
            if (c == '(' || c == '{' || c == '[') {

                st.push(c);
            }
            // Handle closing brackets
            else {
                // Invalid if stack is empty
                if (st.isEmpty()) {
                    return false;
                }
                char top = st.pop();
                // Checking matching pair
                if ((c == ')' && top != '(') ||
                        (c == '}' && top != '{') ||
                        (c == ']' && top != '[')) {
                    return false;
                }
            }
        }
        // Stack should be empty for valid parentheses
        return st.isEmpty();
    }
    public static void main(String[] args) {

        ValidParentheses vp = new ValidParentheses();

        System.out.println(vp.isValid("()[]{}"));
    }
}
