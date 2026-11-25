class Solution:
    def productExceptSelf(self, nums: List[int]) -> List[int]:
        res = [1] * len(nums)

        prodL = 1
        for i in range(len(nums)):
            res[i] = prodL
            prodL *= nums[i]
        prodR = 1
        for i in range(len(nums) - 1, -1, -1):
            res[i] *= prodR
            prodR *= nums[i]
        
        return res