package issue16;

import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {

    private Solution s = new Solution();

    @Test
    public void case1() {
        int[] nums = {-1, 2, 1, -4};
        int target = 1;
        int actual = s.threeSumClosest(nums, target);
        int expected = 2;
        assertEquals(expected, actual);
    }

    @Test
    public void case2() {
        int[] nums = {1, 1, 1, 0};
        int target = 100;
        int actual = s.threeSumClosest(nums, target);
        int expected = 3;
        assertEquals(expected, actual);
    }

}