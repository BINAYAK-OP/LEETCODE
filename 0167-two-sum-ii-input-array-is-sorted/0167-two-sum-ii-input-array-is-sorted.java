class Solution {
    public int[] twoSum(int[] arr, int target) {
        int ans[]=new int[2];
        int lo=0,hi=arr.length-1;
        int idx1=-1;
        while(lo<hi)
        {
            int sum=arr[lo]+arr[hi];
            if(sum==target)
            {
            ans[0]=lo+1;
            ans[1]=hi+1;
            return ans;
            }
            else if(sum>target)
            {
                hi--;
            }
            else 
            {
                lo++;
            }
        }
        return ans;
    }
}