package issue1047;

import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {

    private Solution s = new Solution();

    @Test
    public void case1() {
        final String input = "abbaca";
        final String expected = "ca";
        String actual = this.s.removeDuplicates(input);
        assertEquals(expected, actual);
    }

    @Test
    public void case2() {
        final String input = "aababaab";
        final String expected = "ba";
        String actual = this.s.removeDuplicates(input);
        assertEquals(expected, actual);
    }

    @Test
    public void case3() {
        final String input = "azxxzy";
        final String expected = "ay";
        String actual = this.s.removeDuplicates(input);
        assertEquals(expected, actual);
    }
}