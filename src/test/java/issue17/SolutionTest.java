package issue17;

import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

public class SolutionTest {

    private Solution s = new Solution();

    @Test
    public void case1() {
        String input = "23";
        List<String> expected = List.of("ad","ae","af","bd","be","bf","cd","ce","cf");
        List<String> actual = s.letterCombinations(input);
        assertEquals(expected, actual);
    }

    @Test
    public void case2() {
        String input = "";
        List<String> expected = List.of();
        List<String> actual = s.letterCombinations(input);
        assertEquals(expected, actual);
    }

    @Test
    public void case3() {
        String input = "2";
        List<String> expected = List.of("a","b","c");
        List<String> actual = s.letterCombinations(input);
        assertEquals(expected, actual);
    }
}