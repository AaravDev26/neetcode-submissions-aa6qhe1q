class Solution:
    def groupAnagrams(self, strs: List[str]) -> List[List[str]]:
        myMap = {}
        for s in strs:
            key = ''.join(sorted(s));
            if key not in myMap:
                myMap[key] = [s]
            else:
                myMap[key].append(s)

        return list(myMap.values())

        