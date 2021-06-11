package issue17;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Solution {
    public List<String> letterCombinations(String digits) {
        Map<Integer, List<String>> map = new HashMap<>();
        map.put(2, Arrays.asList("a", "b", "c"));
        map.put(3, Arrays.asList("d", "e", "f"));
        map.put(4, Arrays.asList("g", "h", "i"));
        map.put(5, Arrays.asList("j", "k", "l"));
        map.put(6, Arrays.asList("m", "n", "o"));
        map.put(7, Arrays.asList("p", "q", "r", "s"));
        map.put(8, Arrays.asList("t", "u", "v"));
        map.put(9, Arrays.asList("w", "x", "y", "z"));
        if (digits.isEmpty()) {
            return new ArrayList<>();
        }
        List<String> result = new ArrayList<>();
        for (int i = 0; i < digits.length(); i++) {
            String s = digits.substring(i, i + 1);
            int n = Integer.parseInt(s);
            List<String> strings = map.get(n);
            if (result.isEmpty()) {
                result.addAll(strings);
            } else {
                List<String> middle = new ArrayList<>();
                for (int j = 0; j < result.size(); j++) {
                    String s1 = result.get(j);
                    for (int k = 0; k < strings.size(); k++) {
                        String s2 = strings.get(k);
                        middle.add(s1 + s2);
                    }
                }
                result = middle;
            }
        }
        return result;
    }
}
