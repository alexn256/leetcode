package issue1047;

import java.util.HashMap;
import java.util.Map;

public class Solution {
    public String removeDuplicates(String s) {
        final Map<Character, Integer> map = new HashMap<>();
        final char[] chars = new char[s.length()];
        boolean hasDuplicates = false;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (i < s.length() -1) {
                char n = s.charAt(i + 1);
                if (c != n) {
                    chars[i] = c;
                } else {
                    hasDuplicates = true;
                    i++;
                }
            } else {
                chars[i] = c;
            }
        }
        final StringBuilder builder = new StringBuilder();
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] == 0) {
                continue;
            }
            builder.append(chars[i]);
        }
        String result = builder.toString();
        if (hasDuplicates) {
            return removeDuplicates(result);
        }
        return result;
    }
}
