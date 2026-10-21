class Solution {
    public void sortColors(int[] nums) {
        int n=nums.length;
        int p=0,q=0,r=0;
        for(int i:nums)
        {
            if(i==0)
            p++;
            else if(i==1)
            q++;
            else
            r++;
        }
        int i=0;
            while(p!=0)
            {
                nums[i++]=0;
                p--;
            }
            while(q!=0)
            {
                nums[i++]=1;
                q--;
            }
            while(r!=0)
            {
                nums[i++]=2;
                r--;
            }
    }
}

// class Solution {
//     public void sortColors(int[] nums) {
//         int n=nums.length;
//         int lo=0,int hi=n-1;
//         int mid=lo+(hi-lo/2);
//         while(lo<hi && lo<=mid)
//         {
//            mid=lo+(hi-lo/2);
//            if(nums[lo]>nums[mid] && nums[lo]>nums[hi])
//            swap(lo,mid);
//            else if(nums[lo]>nums[mid] && nums[lo]<nums[hi])
//            swap()
//         }
//     }
// }