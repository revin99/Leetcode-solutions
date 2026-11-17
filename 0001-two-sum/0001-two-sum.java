class Solution {
    public int[] twoSum(int[] nums, int target) {

        Map<Integer,Integer> mp = new HashMap<>();
        for(int i=0;i<nums.length;i++)
        {
            int compl = target-nums[i];
            if(mp.containsKey(compl)) {
                return new int[]{mp.get(compl),i};
            }
            mp.put(nums[i],i);
        }
        return new int[]{-1,-1};
    }
}