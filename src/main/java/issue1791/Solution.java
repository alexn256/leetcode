package issue1791;

public class Solution {
    public int findCenter(int[][] edges) {
        int x = 0;
        int y = 0;
        for (int i = 0; i < edges.length; i++) {
            int[] edge = edges[i];
            if (x == 0 && y == 0) {
                x = edge[0];
                y = edge[1];
            } else {
                if (x == edge[0]) {
                    return x;
                }
                if (x == edge[1]) {
                    return x;
                }
                if (y == edge[0]) {
                    return y;
                }
                if (y == edge[1]) {
                    return y;
                }
            }
        }
        return 0;
    }
}
