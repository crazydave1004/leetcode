public class Solution {
    public int nthSuperUglyNumber(int n, int[] primes) {
        int l = primes.length;
        int num[] = new int[n];
        int index[] = new int[l];
        int val[] = new int[l];
        num[0] = 1;
        for (int i = 1; i < n; i++) {
            for (int j = 0; j < l; j++) {
                val[j] = num[index[j]] * primes[j];
            }
            num[i] = findMin(val);
            for (int j = 0; j < l; j++) {
                if (val[j] == num[i]) {
                    index[j] += 1;
                }
            }
        }
        return num[n - 1];
    }
    public int findMin(int[] nums) {
        int min = nums[0];
        for (int i = 1; i < nums.length; i++) {
            min = Math.min(min, nums[i]);
        }
        return min;
    }
}