class Solution:
    def removeElement(self, nums: list[int], val: int) -> int:
        i = 0
        j = len(nums)-1
        n = len(nums)

        while i<=j and i<n:
            if nums[i]==val and nums[j]!=val:
                nums[i]=nums[j]
                nums[j]=val
                i+=1
                j-=1
            elif nums[i]==val and nums[j]==val:
                j-=1
            else:
                i+=1
        
        return i
        