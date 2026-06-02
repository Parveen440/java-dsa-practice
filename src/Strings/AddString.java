package Strings;
//Leetcode-415
public class AddString {
    public String addStrings(String num1, String num2) {

        int i = num1.length() - 1;
        int j = num2.length() - 1;
        int carry = 0;
        StringBuilder result = new StringBuilder();
        // Process digits from right to left
        while (i >= 0 || j >= 0 || carry != 0) {
            int digit1 = (i >= 0) ? num1.charAt(i) - '0' : 0;
            int digit2 = (j >= 0) ? num2.charAt(j) - '0' : 0;
            int sum = digit1 + digit2 + carry;
            carry = sum / 10;
            result.append(sum % 10);
            i--;
            j--;
        }
        // Reverse because digits were added backwards
        return result.reverse().toString();
    }
}
//Time Complexity: O(n)
//Space Complexity: O(1)
