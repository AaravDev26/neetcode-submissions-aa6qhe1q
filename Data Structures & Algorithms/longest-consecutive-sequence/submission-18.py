class Solution:
    def longestConsecutive(self, nums: List[int]) -> int:
        if not nums:
            return 0

        mySet = set()
        for n in nums:
            mySet.add(n)

        
        res = 1
        for n in mySet:
            if n - 1 not in mySet:
                cur = 1
                num = n
                while num + 1 in mySet:
                    cur += 1
                    num += 1
                res = max(res, cur)

        return res
            
        