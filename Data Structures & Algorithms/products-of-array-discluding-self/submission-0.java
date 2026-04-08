class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] l = new int[nums.length];
        int[] r = new int[nums.length];

        int left = 1;
        int right = 1;

        for (int i = 0; i < nums.length; i++) {
            l[i] = left;
            left *= nums[i];
        }
        for (int i = nums.length - 1; i >= 0; i--) {
            r[i] = right;
            right *= nums[i];
        }

        int[] ans = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            ans[i] = l[i] * r[i];
        }
        return ans;
    }
}  
