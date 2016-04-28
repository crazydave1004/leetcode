public class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
	    Arrays.sort(nums);
	    List<List<Integer>> res = new ArrayList<List<Integer>>();
	    for (int i = 0; i < nums.length - 3; i++) {
	        if (nums[i] * 4 > target) return res;
	        if (i != 0 && nums[i] == nums[i - 1]) continue;
		    for (int j = nums.length - 1; j > i + 2; j--) {
		        if (nums[j] * 4 < target) break;
		        if (j != nums.length - 1 && nums[j] == nums[j + 1]) continue;
			    int k = i + 1;
			    int l = j - 1;
			    while (k < l) {
				    int sum = nums[i] + nums[j] + nums[k] + nums[l];
				    if (sum > target) {
					    l--;
				    } else if (sum < target) {
					    k++;
				    } else if (sum == target) {
					    res.add(Arrays.asList(nums[i], nums[k], nums[l], nums[j]));
					    k++;
					    l--;
					    while (k < l && nums[k] == nums[k - 1]) k++;
					    while (k < l && nums[l] == nums[l + 1]) l--;
				    }
			    }
		    }
	    }
	    return res;
    }
}