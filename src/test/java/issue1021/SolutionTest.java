package issue1021;

import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {

    private Solution s = new Solution();

    @Test
    public void case1() {
        String input = "(()())(())";
        String expected = "()()()";
        String actual = this.s.removeOuterParentheses(input);
        assertEquals(expected, actual);
    }

    @Test
    public void case2() {
        String input = "(()())(())(()(()))";
        String expected = "()()()()(())";
        String actual = this.s.removeOuterParentheses(input);
        assertEquals(expected, actual);
    }

    @Test
    public void case3() {
        String input = "()()";
        String expected = "";
        String actual = this.s.removeOuterParentheses(input);
        assertEquals(expected, actual);
    }

    @Test
    public void case4() {
        String input = "(())";
        String expected = "()";
        String actual = this.s.removeOuterParentheses(input);
        assertEquals(expected, actual);
    }

    @Test
    public void case5() {
        String input = "()()()()(())";
        String expected = "()";
        String actual = this.s.removeOuterParentheses(input);
        assertEquals(expected, actual);
    }
}