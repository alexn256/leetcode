package issue1021;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public String removeOuterParentheses(String s) {
        int opened = 0;
        int closed = 0;
        int first = 0;
        List<Integer> indexes = new ArrayList<>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == '(') {
                opened++;
                if (opened > closed + 1) {

                } else {
                    first = i;
                }
            }
            if (c == ')') {
                closed++;
            }
            if (opened == closed) {
                opened = 0;
                closed = 0;
                indexes.add(first);
                indexes.add(i);
            }
        }
        List<String> strings = new ArrayList<>();
        for (int i = 0; i < indexes.size() - 1; i = i + 2) {
            String substring = s.substring(indexes.get(i), indexes.get(i + 1) + 1);
            strings.add(substring.substring( 1, substring.length() - 1 ));
        }
        StringBuilder builder = new StringBuilder();
        for (String str : strings) {
            builder.append(str);
        }
        return builder.toString();
    }
}
