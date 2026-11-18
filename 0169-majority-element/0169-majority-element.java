class Solution {
    public int majorityElement(int[] nums) {
        int n = nums.length;

        int cand=0;
        int cnt=0;
        for(int i=0;i<n;i++)
        {
            if(cnt==0){
                cand = nums[i];
            }
            if(nums[i]==cand){
                cnt++;
            }else{
                cnt--;
            }
        }
        return cand;
    }
}