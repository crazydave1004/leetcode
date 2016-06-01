public class Solution {
    public double myPow(double x, int n) {
        double res = 1;
        long m = Math.abs((long) n);
        while(m > 0) {
            if((m & 1) == 1) res *= x;
            m >>= 1;
            x *= x;
        }
        return n < 0 ?  1 / res : res;
    }
}