public class Solution {
    public int nthUglyNumber(int n) {
        int[] primes = {2, 3, 5};
        int[] index = new int[3];
        int[] tmp = new int[3];
        int[] num = new int[n];
        num[0] = 1;
        for (int i = 1; i < n; i++) {
            int minValue = Integer.MAX_VALUE;
            int minIndex = -1;
            for (int j = 0; j < 3; j++) {
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