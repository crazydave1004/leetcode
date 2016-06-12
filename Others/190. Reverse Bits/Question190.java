public class Solution {
    // you need treat n as an unsigned value
    public int reverseBits(int n) {
        int answer = 0;
        for (int i = 0; i < 32; i++) {
            answer <<= 1;
            answer |= ((n >> i) & 1);
        }
        return answer;
    }
}