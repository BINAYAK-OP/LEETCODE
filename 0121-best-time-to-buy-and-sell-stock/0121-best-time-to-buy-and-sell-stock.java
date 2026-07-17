class Solution {
    public int maxProfit(int[] prices) {
        int m = prices.length;
        int i;
        
        int min = Integer.MAX_VALUE;
        int maxp = 0;   // this will store max profit
        
        for(i = 0; i < m; i++)
        {
            if(prices[i] < min)
            {
                min = prices[i];
            }
            else
            {
                int profit = prices[i] - min;
                if(profit > maxp)
                {
                    maxp = profit;
                }
            }
        }
        return maxp;
    }
}