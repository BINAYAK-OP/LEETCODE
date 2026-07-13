class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        List<Integer> ans=new ArrayList<>();
        int i=0;
        while(i<nums.length)
        {
            int idx=nums[i]-1;
            if(nums[i]==i+1 || nums[idx]==nums[i])
            i++;
            else
            swap(nums,i,idx);
        }
        for(i=0;i<nums.length;i++)
        {
            if(nums[i]!=i+1)
            ans.add(nums[i]);
        }
        return ans;
    }
         private void swap(int[] arr,int i,int idx)
    {
        int temp=arr[i];
        arr[i]=arr[idx];
        arr[idx]=temp;
    }
}