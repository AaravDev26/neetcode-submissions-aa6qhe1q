class Solution:
    def trap(self, height: List[int]) -> int:
        res = 0

        n = len(height)
        l = 0
        r = n - 1
        maxLeft = height[0]
        maxRight = height[n - 1]

        while l < r:
            if maxLeft <= maxRight:
                water = maxLeft - height[l]
                if water > 0:
                    res += water
                l += 1
                maxLeft = max(maxLeft, height[l])
            else:
                water = maxRight - height[r]
                if water > 0:
                    res += water
                r -= 1
                maxRight = max(maxRight, height[r])

        return res

