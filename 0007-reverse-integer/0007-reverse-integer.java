class Solution {
    public int reverse(int x) {
        int d,k=0;
        while(x!=0)
        {
            d=x%10;
            
             if (k > Integer.MAX_VALUE / 10 || k < Integer.MIN_VALUE / 10) {
                return 0;
            }
            k=k*10+d;
            x/=10;
        }
        return k;
    }
}