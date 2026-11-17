class Solution:
    def containsDuplicate(self, nums: list[int]) -> bool:
        dct={}
        for num in nums:
            if num in dct:
                return True
            dct[num]=1
        
        return False
        