public class Solution {
    public int hIndex(int[] citations) {
        int[] counter = new int[citations.length + 1];
        for (int i = 0; i < citations.length; i++) {
            if (citations[i] > citations.length) {
                counter[citations.length]++;
            } else {
                counter[citations[i]]++;
            }
        }
        int sum = 0;
        for (int i = counter.length - 1; i >= 0; i--) {
            if (counter[i] + sum >= i) return i;
            sum += counter[i];
        }
        return 0;
    }
}