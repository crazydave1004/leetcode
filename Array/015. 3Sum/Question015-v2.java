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
                    //Arrays.asList() converts array to arraylist
                    res.add(Arrays.asList(nums[i], nums[left], nums[right]));
                    left++;
                    right--;
                    while (left < right && nums[left] == nums[left - 1]) left++;
                    while (left < right && nums[right] == nums[right + 1]) right--;
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