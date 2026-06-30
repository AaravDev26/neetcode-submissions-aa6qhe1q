class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map <Integer, Integer> map = new HashMap<>();

        for (int n : nums) {
            map.put(n, map.getOrDefault(n, 0) + 1);
        }

        List<List<Integer>> freq = new ArrayList<>();
        for (int i = 0; i < nums.length + 1; i++) {
            freq.add(new ArrayList<>());
        }
        
        for (int key : map.keySet()) {
            int value = map.get(key);
            freq.get(value).add(key);
        }

        int[] ans = new int[k];
        int index = 0;
        for (int i = nums.length; i >= 0; i--) {
            List<Integer> list = freq.get(i);
            if (list.size() > 0) {
                for (int j = 0; j < list.size(); j++) {
                    if (index >= k) {
                        break;
                    }
                    ans[index] = list.get(j);
                    index++;
                }
            }
            if (index >= k) {
                    break;
                }
        }

        return ans;
    }
}
