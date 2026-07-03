class Solution:
    def isAnagram(self, s: str, t: str) -> bool:
        if len(s) != len(t):
            return False;
        
        counts = [0] * 26

        for i in range(len(s)):
            indexS = ord(s[i]) - ord('a')
            indexT = ord(t[i]) - ord('a')

            counts[indexS] += 1
            counts[indexT] -= 1
        
        for i in range(26):
            if counts[i] != 0:
                return False
        
        return True


        