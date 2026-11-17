class Solution:
    def twoSum(self, nums: list[int], target: int) -> list[int]:
        mp={}
        for i in range(len(nums)):
            cpl = target-nums[i]
            if cpl in mp:
                return [mp[cpl],i]
            mp[nums[i]]=i
        
        return [-1,-1]
        