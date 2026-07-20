class Solution {
    public int[] searchRange(int[] nums, int target) {
        int c[]=new int[2];
        int lo=0,hi=nums.length-1;
        int idx=-1;
        while(hi>=lo)
        {
            int mid=(hi+lo)/2;
            if(nums[mid]>target)
            hi=mid-1;
            else if(nums[mid]<target)
            lo=mid+1;
            else
            {
                idx=mid;
                hi=mid-1;
            }
        }
        c[0]=idx;
        lo=0;
        hi=nums.length-1;
        idx=-1;
        while(hi>=lo)
        {
            int mid=(hi+lo)/2;
            if(nums[mid]>target)
            hi=mid-1;
            else if(nums[mid]<target)
            lo=mid+1;
            else
            {
                idx=mid;
                lo=mid+1;
            }
        }
        c[1]=idx;
        return c;
    }
}