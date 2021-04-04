package issue1791;

import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {

    private Solution s = new Solution();

    @Test
    public void case1() {
        int[][] edges = {{1,2},{2,3},{4,2}};
        int expected = 2;
        int actual = s.findCenter(edges);
        assertEquals(actual, expected);
    }

    @Test
    public void case2() {
        int[][] edges = {{1,2},{5,1},{1,3},{1,4}};
        int expected = 1;
        int actual = s.findCenter(edges);
        assertEquals(actual, expected);
    }
}