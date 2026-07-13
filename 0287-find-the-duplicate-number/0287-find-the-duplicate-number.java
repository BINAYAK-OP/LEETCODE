class Solution {
    public int findDuplicate(int[] nums) {
        int i=0;
        while(i<nums.length)
        {
            if(nums[i]!=i+1)
            {
                int idx=nums[i]-1;
                if(nums[i]==nums[idx])
                return nums[i];
                swap(nums,i,idx);
            }

            else
            {
               i++;
            }
        }
        return -1;
    }
    private void swap(int[] arr,int i,int idx)
    {
        int temp=arr[i];
        arr[i]=arr[idx];
        arr[idx]=temp;
    }
}