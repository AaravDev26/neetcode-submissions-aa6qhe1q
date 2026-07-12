class Solution:
    def threeSum(self, nums: List[int]) -> List[List[int]]:
        res = []
        
        nums.sort()

        index = 0

        for i in range(len(nums) - 2):
            n = nums[index]
            l = index + 1
            r = len(nums) - 1

            while l < r:
                if nums[l] + nums[r] == n * -1:
                    arr = [nums[index], nums[l], nums[r]]
                    if arr not in res:
                        res.append(arr)
                    l += 1
                    r -= 1
                elif nums[l] + nums[r] < n * -1:
                    l += 1
                else:
                    r -= 1
            
            while nums[index] == n and index < len(nums) - 1:
                index += 1

        return res

