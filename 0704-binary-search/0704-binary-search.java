class Solution {
    public int search(int[] nums, int target) {
        int n=nums.length;
       int lo=0,hi=n-1;
       while(hi>=lo)
       {
        int mid=(hi+lo)/2;
        if(nums[mid]>target)
        {
        hi=mid-1;
        }
        else if(nums[mid]<target)
        {
            lo=mid+1;
        }
        else
        {
            return mid;
        }
        
       }
       return -1;
    }
}