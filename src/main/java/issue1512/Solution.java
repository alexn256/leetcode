package issue1512;

public class Solution {
    public int numIdenticalPairs(int[] nums) {
        int count = 0;
        for (int i = 0; i < nums.length - 1; i++) {
            int x = nums[i];
            for (int j = i + 1; j < nums.length; j++) {
                int y = nums[j];
                if (x == y) {
                    count++;
                }
            }
        }
        return count;
    }
}
