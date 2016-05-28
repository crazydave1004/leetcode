public class Solution {
    public List<String> summaryRanges(int[] nums) {
        List<String> res = new ArrayList<String>();
        if (nums == null || nums.length == 0) return res;
        for (int i = 0; i < nums.length; i++) {
            if (i == nums.length - 1) {
                res.add("" + nums[i]);
            } else {
                for (int j = i + 1; j < nums.length; j++) {
                    if (nums[j] != nums[j - 1] + 1) {
                        if (i == j - 1) {
                            res.add("" + nums[j - 1]);
                        } else {
                            res.add(nums[i] + "->" + nums[j - 1]);
                        }
                        i = j - 1;
                        break;
                    } else if (j == nums.length - 1){
                        res.add(nums[i] + "->" + nums[j]);
                        i = j;
                        break;
                    }
                }
            }
        }
        return res;
    }
}