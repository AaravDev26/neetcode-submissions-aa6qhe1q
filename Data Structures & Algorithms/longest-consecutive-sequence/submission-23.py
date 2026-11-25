class Solution:
    def longestConsecutive(self, nums: List[int]) -> int:
        if not nums:
            return 0
        arr = sorted(nums)
        max = 1
        cur = 1
        for i in range(1, len(arr)):
            if arr[i] == arr[i-1] + 1:
                cur += 1
                if cur > max:
                    max = cur
            elif arr[i] == arr[i-1]:
                pass
            else:
                cur = 1
        return max
            