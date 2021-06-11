package issue1441;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public List<String> buildArray(int[] target, int n) {
        List<String> result = new ArrayList<>();
        int y = 0;
        for (int i = 1; i <= n; i++) {
            int x = target[y];
            if (x == i) {
                result.add("Push");
                y++;
            } else if (i < x) {
                result.add("Push");
                result.add("Pop");
            }
            if (y == target.length) {
                break;
            }
        }
        return result;
    }
}
