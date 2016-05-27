public class Solution {
    public int minimumTotal(List<List<Integer>> triangle) {
        if (triangle == null || triangle.size() == 0) return 0;
        int[] optimal = new int[triangle.size()];
        optimal[0] = triangle.get(0).get(0);
        int[] tmp = optimal.clone();
        for (int r = 1; r < triangle.size(); r++) {
            int len = triangle.get(r).size();
            for (int c = len - 1; c >= 0; c--) {
                if (c == len - 1) {
                    optimal[c] = tmp[c - 1] + triangle.get(r).get(c);
                } else if (c == 0){
                    optimal[c] = tmp[c] + triangle.get(r).get(c);
                } else {
                    optimal[c] = Math.min(tmp[c - 1], tmp[c]) + triangle.get(r).get(c);
                }
            }
            tmp = optimal.clone();
        }
        int min = optimal[0];
        for (int i = 1; i < optimal.length; i++) {
            min = Math.min(min, optimal[i]);
        }
        return min;
    }
}