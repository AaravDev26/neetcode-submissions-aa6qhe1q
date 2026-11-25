class Solution:
    def productExceptSelf(self, nums: List[int]) -> List[int]:
        res = [1] * len(nums)

        prodL = 1
        prodR = 1
        for i in range(len(nums)):
            res[i] *= prodL
            prodL *= nums[i]
            res[~i] *= prodR
            prodR *= nums[~i]
        
        return res