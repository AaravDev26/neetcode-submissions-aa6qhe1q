class Solution:
    def productExceptSelf(self, nums: List[int]) -> List[int]:
        left = [1] * len(nums)
        right = [1] * len(nums)

        prodL = 1
        prodR = 1
        for i in range(len(nums)):
            left[i] = prodL
            prodL *= nums[i]
            right[~i] = prodR
            prodR *= nums[~i]

        res = []
        for i in range(len(nums)):
            res.append(left[i] * right[i])
        
        return res