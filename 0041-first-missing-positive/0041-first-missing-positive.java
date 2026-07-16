class Solution {
    public int firstMissingPositive(int[] nums) {
        int i=0;
        while(i<nums.length)
        {
            int idx=nums[i]-1;
            if(nums[i]<=0 || nums[i]>nums.length || nums[i]==i+1 || nums[i]==nums[idx])
            i++;
            else 
            swap(nums,i,idx);
        }
        for(i=0;i<nums.length;i++)
        {
            if(nums[i]!=i+1)
            return i+1;
        }
        return nums.length+1;
    }
    private void swap(int[] nums, int i, int idx) {
        int temp = nums[i];
        nums[i] = nums[idx];
        nums[idx] = temp;
    }
}