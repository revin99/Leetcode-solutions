class Solution {
    public int removeElement(int[] nums, int val) {
        int i=0;
        int j=nums.length-1;
        int n = j+1;
        while(i<=j && i<n)
        {
            if(nums[i]==val && nums[j]!=val){
                int tmp = nums[j];
                nums[i]=tmp;
                nums[j]=val;
                i++;j--;
            }else if(nums[i]!=val && nums[j]==val){
                i++;j--;
            }else if(nums[i]!=val && nums[j]!=val){
                i++;
            }else if(nums[i]==val && nums[j]==val){
                j--;
            }
        }
        return i;
    }
}