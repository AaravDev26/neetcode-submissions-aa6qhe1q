class Solution:
    def topKFrequent(self, nums: List[int], k: int) -> List[int]:
        freq = defaultdict(int)
        for n in nums:
            freq[n] += 1
        
        arr = [[] for i in range(len(nums) + 1)]

        for n, c in freq.items():
            arr[c].append(n)
        
        res = []
        for n in reversed(arr):
            for i in n:
                res.append(i)
                if len(res) == k:
                    return res

        