package issue1470;

import java.util.Arrays;

public class Solution {
    public int[] shuffle(int[] nums, int n) {
        int[] xs = Arrays.copyOfRange(nums, 0, n);
        int[] ys = Arrays.copyOfRange(nums, n, nums.length);
        int[] result = new int[nums.length];
        int idx = 0;
        for (int i = 0; i < n; i++) {
            result[idx] = xs[i];
            idx++;
            result[idx] = ys[i];
            idx++;
        }
        return result;
    }
}
