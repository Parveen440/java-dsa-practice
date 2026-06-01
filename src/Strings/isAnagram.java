package Strings;
import java.util.*;
//Leetcode-242
public class isAnagram {
    public boolean isAnagram(String s, String t) {

        // Anagrams must have same length
        if (s.length() != t.length()) {
            return false;
        }
        // Frequency array for lowercase letters
        int[] freq = new int[26];
        // Count characters in first string
        for (int i = 0; i < s.length(); i++) {
            freq[s.charAt(i) - 'a']++;
        }
        // Remove characters using second string
        for (int i = 0; i < t.length(); i++) {
            freq[t.charAt(i) - 'a']--;
        }
        // Verify all frequencies become zero
        for (int count : freq) {
            if (count != 0) {
                return false;
            }
        }
        return true;
    }
}

//Time Complexity: O(n)
//Space Complexity: O(1)
