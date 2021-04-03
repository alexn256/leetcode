package issue1512;

import org.junit.Assert;
import org.junit.Test;

public class SolutionTest {

    private Solution s = new Solution();

    @Test
    public void case1() {
        int[] nums = {1, 2, 3, 1, 1, 3};
        int expected = 4;
        int actual = s.numIdenticalPairs(nums);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void case2() {
        int[] nums = {1, 1, 1, 1};
        int expected = 6;
        int actual = s.numIdenticalPairs(nums);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void case3() {
        int[] nums = {1, 2, 3};
        int expected = 0;
        int actual = s.numIdenticalPairs(nums);
        Assert.assertEquals(expected, actual);
    }

}