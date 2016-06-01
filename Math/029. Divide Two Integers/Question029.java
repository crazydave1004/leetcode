public class Solution {
    public int divide(int dividend, int divisor) {
        long a = Math.abs(dividend);
        long b = Math.abs(divisor);
        long res = 0;
        long c = 0;
        while (a >= b) {
        	c = b;
        	for (int i = 0; a >= c; i++, c<<=1) {
            	a -= c;
            	res += (1<<i);
            }
        }
        if(dividend > 0 ^ divisor > 0) {
            return (int) Math.max((long) Integer.MIN_VALUE, -res);
        }else{
            return (int) Math.min((long) Integer.MAX_VALUE, res);
        }
    }
}