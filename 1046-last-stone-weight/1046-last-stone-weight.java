class Solution {
    public int lastStoneWeight(int[] arr) {
        PriorityQueue<Integer> pq=new PriorityQueue<>(Collections.reverseOrder());
        for(int ele:arr)
        {
            pq.add(ele);
        }
        while(pq.size()>1)
        {
        int x=pq.remove();
        int y=pq.remove();
        if(x!=y)
        {
            pq.add(x-y);
        }
        }
        return pq.isEmpty()? 0: pq.peek();
    }
}