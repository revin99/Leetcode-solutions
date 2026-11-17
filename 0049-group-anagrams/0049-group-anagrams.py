class Solution:
    def groupAnagrams(self, strs: list[str]) -> list[list[str]]:
        mp={}
        for str in strs:
            sort = ''.join(sorted(str))
            if sort not in mp:
                mp[sort]=[]
            mp[sort].append(str)

        ans=[]
        for key in mp:
            ans.append(mp[key])

        return ans;
        