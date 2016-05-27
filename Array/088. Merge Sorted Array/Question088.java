public class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        for (int i = m - 1; i >= 0; i--) {
            nums1[n + i] = nums1[i];
        }
        int p1 = n, p2 = 0, cnt = 0;
        while (p1 < m + n && p2 < n) {
            if (nums1[p1] > nums2[p2]) {
                nums1[cnt++] = nums2[p2++];
            } else {
                nums1[cnt++] = nums1[p1++];
            }
        }
        while (p2 < n) {
            nums1[cnt++] = nums2[p2++];
        }
    }
}