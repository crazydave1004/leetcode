public class Solution {
    public int reverse(int x) {
        boolean positive = x >= 0 ? true : false;
        long num = Math.abs(x);
        long sum = 0;
        while (num > 0) {
            long rem = num % 10;
            sum = sum * 10 + rem;
            if (sum > Integer.MAX_VALUE || -sum < Integer.MIN_VALUE) return 0;
            num /= 10;
        }
        if (positive) return (int) sum;
        return (int) -sum;
    }
}