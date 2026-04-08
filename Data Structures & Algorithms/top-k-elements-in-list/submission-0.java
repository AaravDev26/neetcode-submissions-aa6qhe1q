class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int n : nums) {
            map.put(n, map.getOrDefault(n, 0) + 1);
        }

        ArrayList<Integer>[] frequencies = new ArrayList[nums.length + 1];
        for (int key: map.keySet()) {
            int freq = map.get(key);
            if (frequencies[freq] == null) {
                frequencies[freq] = new ArrayList<>();
            }
            frequencies[freq].add(key);
        }

        int[] ans = new int[k];
        int count = 0;

        for (int i = nums.length; i >= 0; i--) {
            ArrayList<Integer> list = frequencies[i];
            if (list != null) {
                for (int n : list) {
                    ans[count] = n;
                    count++;
                }
                if (count == k) {
                    return ans;
                }
            }
        }
        return ans;
    }
}
