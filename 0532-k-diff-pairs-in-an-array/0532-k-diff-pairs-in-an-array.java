class Solution {
    public int findPairs(int[] arr, int k) {
       if(k<0)
       return 0;
       HashMap<Integer,Integer> map=new HashMap<>();
       for(int ele:arr)
       {
        map.put(ele,map.getOrDefault(ele,0)+1);
       }
       int pairs=0;
       for(int ele:map.keySet())
       {
        int rem1=ele-k;
        int rem2=ele+k;
        if(k==0)
        {
             if(k==0 && map.get(ele)>=2)
        pairs++;
        }
        else
        {
        if(map.containsKey(rem1))
        pairs++;
        if(map.containsKey(rem2))
        pairs++;
        }
       }
       return k==0?pairs:pairs/2;
    }
}