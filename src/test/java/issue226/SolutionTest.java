package issue226;

import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {

    private Solution s = new Solution();

    @Test
    public void case1() {
        var root = new TreeNode(4,
                new TreeNode(2,
                        new TreeNode(1),
                        new TreeNode(3)),
                new TreeNode(7,
                        new TreeNode(6),
                        new TreeNode(9)));

        var expected = new TreeNode(4,
                new TreeNode(7,
                        new TreeNode(9),
                        new TreeNode(6)),
                new TreeNode(2,
                        new TreeNode(3),
                        new TreeNode(1)));

        var actual = s.invertTree(root);
        assertTrue(expected.equals(actual));
    }

    @Test
    public void case2() {
        var root = new TreeNode(2,
                new TreeNode(1),
                new TreeNode(3));

        var expected = new TreeNode(2,
                new TreeNode(3),
                new TreeNode(1));

        var actual = s.invertTree(root);
        assertTrue(expected.equals(actual));
    }

    @Test
    public void case3() {
        var actual = s.invertTree(null);
        assertNull(actual);
    }

}