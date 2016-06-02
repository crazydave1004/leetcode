public class Solution {
    public int nthSuperUglyNumber(int n, int[] primes) {
        int l = primes.length;
        int[] index = new int[l];
        int[] tmp = new int[l];
        int[] num = new int[n];
        num[0] = 1;
        for (int i = 1; i < n; i++) {
            int minValue = Integer.MAX_VALUE;
            int minIndex = -1;
            for (int j = 0; j < l; j++) {
                tmp[j] = num[index[j]] * primes[j];
                if (tmp[j] < minValue) {
                    minValue = tmp[j];
                    minIndex = j;
                }
            }
            if (num[i - 1] != minValue) {
                num[i] = minValue;
            } else {
                i--;
            }
            index[minIndex]++;
        }
        return num[n - 1];
    }
}