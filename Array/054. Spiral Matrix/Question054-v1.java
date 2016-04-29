public class Solution {
    public List<Integer> spiralOrder(int[][] A) {
        List<Integer> res = new ArrayList<Integer>();
        int m = A.length;
        if (m == 0) return res;
        int n = A[0].length;
        int c = 0, i = 0, j = 0, rowDirection = 1, colDirection = 1, l = 1;
        boolean flag = true;
        while (c < m * n) {
            res.add(A[i][j]);
            if (flag) {
                if (rowDirection == 1) {
                    if (j < n - l) j++;
                    else {
                        i++;
                        rowDirection = -1;
                        flag = false;
                    }
                } else {
                    if (j >= l) j--;
                    else {
                        i--;
                        rowDirection = 1;
                        flag = false;
                        l++;
                    }
                }
            } else {
                if (colDirection == 1) {
                    if (i < m - l) i++;
                    else {
                        j--;
                        colDirection = -1;
                        flag = true;
                    }
                } else {
                    if (i >= l) i--;
                    else {
                        j++;
                        colDirection = 1;
                        flag = true;
                    }
                }
            }
            c++;
        }
        return res;
    }
}