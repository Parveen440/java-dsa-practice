package Strings;
import java.util.*;
//Leetcode-205
public class IsomorphicStrings {
    public boolean isIsomorphic(String s, String t) {
        int l1 = s.length();
        int l2 = t.length();
        if (l1!= l2) {
            return false;
        }

        HashMap<Character, Character> mapST = new HashMap<>(); // s -> t mapping
        HashMap<Character, Character> mapTS = new HashMap<>(); // t -> s mapping

        for (int i = 0; i < l1; i++) {
            char original = s.charAt(i);
            char replacement = t.charAt(i);

            // Check s -> t mapping
            if (mapST.containsKey(original)) {
                if (mapST.get(original)!= replacement) {
                    return false; // s char already mapped to different t char
                }
            } else {
                mapST.put(original, replacement);
            }

            // Check t -> s mapping
            if (mapTS.containsKey(replacement)) {
                if (mapTS.get(replacement)!= original) {
                    return false; // t char already mapped to different s char
                }
            } else {
                mapTS.put(replacement, original);
            }
        }
        return true;
    }
}
//Time Complexity: O(n)
//Space Complexity: O(k) where k = size of character set
