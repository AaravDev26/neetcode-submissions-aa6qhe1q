class Solution {
    public int longestConsecutive(int[] nums) {
        if (nums.length == 0) {
            return 0;
        }

        Set<Integer> set = new HashSet<>();
        for (int n : nums) {
            set.add(n);
        }

        int ans = 1;

        for (int n : set) {
            if (!set.contains(n-1)) {
                int length = 0;
                while (set.contains(n + length)) {
                    length++;
                }
                ans = Math.max(ans, length);
            }
        }

        return ans;
    }
}
