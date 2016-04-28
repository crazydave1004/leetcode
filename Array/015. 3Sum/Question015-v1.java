public class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> res = new ArrayList<List<Integer>>();
        if (nums == null || nums.length == 0) return res;
        Arrays.sort(nums);
        for (int i = 0; i < nums.length - 2; i++) {
            if (i > 0 && nums[i] == nums[i - 1]) continue;
            int target = - nums[i];
            int left = i + 1, right = nums.length - 1;
            while (left < right) {
                int tmp = nums[left] + nums[right];
                if (tmp == target) {
                    List<Integer> list = new ArrayList<Integer>();
                    list.add(nums[i]);
                    list.add(nums[left]);
                    list.add(nums[right]);
                    if (!res.contains(list))res.add(new ArrayList<Integer>(list));
                    left++;
                    right--;
                } else if (tmp < target){
                    left++;
                } else {
                    right--;
                }
            }
        }
        return res;
    }
}