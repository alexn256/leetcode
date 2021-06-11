package issue1441;

import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

public class SolutionTest {

    private final Solution s = new Solution();

    @Test
    public void case1() {
        int[] target = {1, 3};
        int n = 3;
        List<String> list = s.buildArray(target, n);
        String[] actual = listToArray(list);
        String[] expected = {"Push","Push","Pop","Push"};
        assertArrayEquals(expected, actual);
    }

    @Test
    public void case2() {
        int[] target = {1, 2, 3};
        int n = 3;
        List<String> list = s.buildArray(target, n);
        String[] actual = listToArray(list);
        String[] expected = {"Push","Push","Push"};
        assertArrayEquals(expected, actual);
    }

    @Test
    public void case3() {
        int[] target = {1, 2};
        int n = 4;
        List<String> list = s.buildArray(target, n);
        String[] actual = listToArray(list);
        String[] expected = {"Push","Push"};
        assertArrayEquals(expected, actual);
    }

    @Test
    public void case4() {
        int[] target = {2, 3, 4};
        int n = 4;
        List<String> list = s.buildArray(target, n);
        String[] actual = listToArray(list);
        String[] expected = {"Push","Pop","Push","Push","Push"};
        assertArrayEquals(expected, actual);
    }

    private String[] listToArray(List<String> list) {
        String[] result = new String[list.size()];
        for (int i = 0; i < list.size(); i++) {
            result[i] = list.get(i);
        }
        return result;
    }
}