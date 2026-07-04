class Solution:
    def productExceptSelf(self, nums: List[int]) -> List[int]:
        res = [0] * len(nums)

        prod = 1
        zeroes = 0

        for n in nums:
            if n == 0:
                zeroes += 1
            else:
                prod *= n
        
        for i, n in enumerate(nums):
            if zeroes >= 2:
                return res
            elif zeroes == 1:
                if n == 0:
                    res[i] = prod
                else:
                    res[i] = 0
            else:
                res[i] = prod // n

        return res

        
        
        