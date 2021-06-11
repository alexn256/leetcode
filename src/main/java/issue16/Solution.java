package issue16;

public class Solution {
    public int threeSumClosest(int[] nums, int target) {
        int sum = 0;
        int act = 0;
        for (int i = 0; i < nums.length - 2; i++) {
            int a = nums[i];
            for (int j = i + 1; j < nums.length - 1; j++) {
                int b = nums[j];
                for (int k = j + 1; k < nums.length; k++) {
                    int c = nums[k];
                    sum = a + b + c;
                    if (act == 0) {
                        act = sum;
                    }
                    if (Math.abs(target - sum) < Math.abs(target - act)) {
                        act = sum;
                    }
                    if (sum == target) {
                        return sum;
                    }
                }
            }
        }
        return act;
    }
}
