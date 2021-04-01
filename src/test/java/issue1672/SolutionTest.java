package issue1672;


import org.junit.Assert;
import org.junit.Test;

public class SolutionTest {

    Solution s = new Solution();

    @Test
    public void case1() {
        int[][] input = {{1, 2, 3}, {3, 2, 1}};
        int expected = 6;
        int actual = s.maximumWealth(input);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void case2() {
        int[][] input = {{1, 5}, {7, 3}, {3, 5}};
        int expected = 10;
        int actual = s.maximumWealth(input);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void case3() {
        int[][] input = {{2, 8, 7}, {7, 1, 3}, {1, 9, 5}};
        int expected = 17;
        int actual = s.maximumWealth(input);
        Assert.assertEquals(expected, actual);
    }
}