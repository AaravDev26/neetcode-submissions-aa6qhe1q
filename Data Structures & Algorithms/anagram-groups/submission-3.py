class Solution:
    def groupAnagrams(self, strs: List[str]) -> List[List[str]]:
        myMap = defaultdict(list)
        for s in strs:
            key = ''.join(sorted(s));
            myMap[key].append(s)

        return list(myMap.values())

        