public class Solution {
    public List<Integer> majorityElement(int[] nums) {
        List<Integer> res = new ArrayList<Integer>();
        if (nums == null || nums.length == 0) return res;
        if (nums.length == 1) {
            res.add(nums[0]);
            return res;
        }
        int m1 = nums[0], m2 = 0, c1 = 1, c2 = 0;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] == m1) {
                c1++;
            } else if (nums[i] == m2) {
                c2++;
            } else if (c1 == 0) {
                m1 = nums[i];
                c1 = 1;
            } else if (c2 == 0) {
                m2 = nums[i];
                c2 = 1;
            } else {
                c1--;
                c2--;
            }
        }
        c1 = 0;
        c2 = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == m1) c1++;
            if (nums[i] == m2) c2++;
        }
        if (c1 > nums.length / 3) res.add(m1);
        if (c2 > nums.length / 3 && m1 != m2) res.add(m2);
        return res;
    }
}