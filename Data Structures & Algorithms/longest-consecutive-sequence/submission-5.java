class Solution {
    public int longestConsecutive(int[] nums) {
        if (nums.length == 0) return 0;
        Arrays.sort(nums);

        int curLen = 1;
        int ans = 1;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] == nums[i-1] + 1) {
                curLen++;
                ans = Math.max(ans, curLen);
            }
            else if (nums[i] == nums[i-1]) {
                
            }
            else {
                curLen = 1;
            }
        }

        return ans;
    }
}
