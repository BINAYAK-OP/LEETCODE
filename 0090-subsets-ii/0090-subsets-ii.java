class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        List<List<Integer>> arr=new ArrayList<>();
        Arrays.sort(nums);
        back(nums,0,new ArrayList<>(),arr);
        return arr;
    }
    public void back(int[] nums,int idx,List<Integer>brr,List<List<Integer>>arr)
    {
        arr.add(new ArrayList<>(brr));
       for(int i=idx;i<nums.length;i++)
       {
        if(i>idx && nums[i]==nums[i-1])
        continue;
        brr.add(nums[i]);
        back(nums,i+1,brr,arr);
        brr.remove(brr.size()-1);
       }
    }
}