class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> arr= new ArrayList<>();
        back(nums,0,new ArrayList<>(),arr);
        return arr;
    }
    public void back(int[] nums,int idx,List<Integer>brr,List<List<Integer>> arr)
    {
        if(idx==nums.length)
        {
        arr.add(new ArrayList<>(brr));
        return;
        }
        brr.add(nums[idx]);
        back(nums,idx+1,brr,arr);
        brr.remove(brr.size()-1);
        back(nums,idx+1,brr,arr);

    }
}