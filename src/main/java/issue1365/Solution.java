package issue1365;

public class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int[] result = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            int count = 0;
            int n = nums[i];
            for (int j = 0; j < nums.length; j++) {
                if (i != j) {
                    int a = nums[j];
                    if (n > a) {
                        count++;
                    }
                }
            }
            result[i] = count;
        }
        return result;
    }
}
