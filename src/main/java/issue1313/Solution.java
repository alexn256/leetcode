package issue1313;


public class Solution {
    public int[] decompressRLElist(int[] nums) {
        int[] result = null;
        for (int i = 0; i < nums.length; i++) {
            if (i + 1 < nums.length) {
                int f = nums[i];
                int v = nums[i + 1];
                int[] sublist = new int[f];
                for (int j = 0; j < f; j++) {
                    sublist[j] = v;
                }
                if (result == null) {
                    result = sublist;
                } else {
                    int[] tmp = new int[result.length + sublist.length];
                    System.arraycopy(result, 0, tmp, 0, result.length);
                    System.arraycopy(sublist, 0, tmp, result.length, sublist.length);
                    result = tmp;
                }
                i++;
            }
        }
        return result;
    }
}
