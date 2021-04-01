package issue1470;

import org.junit.Assert;
import org.junit.Test;


public class SolutionTest {

    Solution s = new Solution();

    @Test
    public void case1() {
        int[] nums = {2,5,1,3,4,7};
        int n = 3;
        int[] expected = {2,3,5,4,1,7};
        int[] actual = s.shuffle(nums, n);
        Assert.assertArrayEquals(actual, expected);
    }

    @Test
    public void case2() {
        int[] nums = {1,2,3,4,4,3,2,1};
        int n = 4;
        int[] expected = {1,4,2,3,3,2,4,1};
        int[] actual = s.shuffle(nums, n);
        Assert.assertArrayEquals(actual, expected);
    }

    @Test
    public void case3() {
        int[] nums = {1,1,2,2};
        int n = 2;
        int[] expected = {1,2,1,2};
        int[] actual = s.shuffle(nums, n);
        Assert.assertArrayEquals(actual, expected);
    }
}