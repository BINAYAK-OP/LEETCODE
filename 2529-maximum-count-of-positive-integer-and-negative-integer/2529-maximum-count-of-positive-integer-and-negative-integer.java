class Solution {
    public int maximumCount(int[] nums) {
        int n=nums.length;
        int lo=0,hi=n-1;
        while(lo<=hi)
        {
            int mid=(lo+hi)/2;
            if(nums[mid]>=0)
            hi=mid-1;
            else
            lo=mid+1;
        }
        int neg=lo;
        lo=0;
        hi=n-1;
         while(lo<=hi)
        {
            int mid=(lo+hi)/2;
            if(nums[mid]<=0)
            lo=mid+1;
            else
            hi=mid-1;
        }
        int pos=n-lo;
        return (Math.max(neg,pos));
    }
}