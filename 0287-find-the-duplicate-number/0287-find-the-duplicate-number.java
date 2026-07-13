class Solution {
    public int findDuplicate(int[] nums) {
         int n=nums.length;
        int i=0;
        while(i<nums.length)
        {
            if(nums[i]==i || nums[i]==n)
            i++;
            else
            {
                int idx=nums[i];
                swap(nums,i,idx);
                if(nums[i]==idx)
                return nums[i];
            }
        }
        for(i=0;i<nums.length;i++)
        {
            if(nums[i]!=i)
            return i;
        }
        return n;
    }
    private void swap(int[] arr,int i,int idx)
    {
        int temp=arr[i];
        arr[i]=arr[idx];
        arr[idx]=temp;
    }
}