package issue1313;

import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {

    private Solution s = new Solution();

    @Test
    public void case1() {
        int[] nums = {1, 2, 3, 4};
        int[] expected = {2, 4, 4, 4};
        int[] actual = s.decompressRLElist(nums);
        assertArrayEquals(expected, actual);
    }

    @Test
    public void case2() {
        int[] nums = {1, 1, 2, 3};
        int[] expected = {1, 3, 3};
        int[] actual = s.decompressRLElist(nums);
        assertArrayEquals(expected, actual);
    }
}