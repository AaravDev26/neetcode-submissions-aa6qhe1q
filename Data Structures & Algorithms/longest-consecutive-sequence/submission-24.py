class Solution:
    def longestConsecutive(self, nums: List[int]) -> int:
        hashset = set(nums)

        cur = 0
        res = 0
        for n in hashset:
            if n-1 not in hashset:
                num = n
                while num in hashset:
                    cur += 1
                    num += 1
                if cur > res:
                    res = cur
            cur = 0
        
        return res