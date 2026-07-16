class Solution {
    public int[] findErrorNums(int[] nums) {
        int[] ans=new int[2];
        int n=nums.length;
        int i=0;
        while(i<n)
        {
            int idx=nums[i]-1;
            if(nums[i]==i+1 || nums[i]==nums[idx])
            i++;
            else 
            swap(nums,i,idx);
        }
        for(i=0;i<n;i++)
        {
            if(nums[i]!=i+1)
            {
            ans[0]=nums[i];
            ans[1]=(i+1);
        }
        }
        return ans;
        }

    private void swap(int[] nums, int i, int idx) {
        int temp = nums[i];
        nums[i] = nums[idx];
        nums[idx] = temp;
    }
}