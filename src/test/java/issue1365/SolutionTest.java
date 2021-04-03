package issue1365;

import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {

    private Solution s = new Solution();

    @Test
    public void case1() {
        int[] nums = {8,1,2,2,3};
        int[] expected = {4,0,1,1,3};
        int[] actual = s.smallerNumbersThanCurrent(nums);
        assertArrayEquals(expected, actual);
    }

    @Test
    public void case2() {
        int[] nums = {6,5,4,8};
        int[] expected = {2,1,0,3};
        int[] actual = s.smallerNumbersThanCurrent(nums);
        assertArrayEquals(expected, actual);
    }

    @Test
    public void case3() {
        int[] nums = {7,7,7,7};
        int[] expected = {0,0,0,0};
        int[] actual = s.smallerNumbersThanCurrent(nums);
        assertArrayEquals(expected, actual);
    }
}