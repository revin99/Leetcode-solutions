class Solution:
    def minimizeSum(self, nums: List[int]) -> int:
        n = len(nums)
        nums.sort()

        a = nums[n-2]-nums[1]
        b = nums[n-3]-nums[0]
        c = nums[n-1]-nums[2]

       

        return min(a,min(b,c))
        

        # 1 4 5 7 8