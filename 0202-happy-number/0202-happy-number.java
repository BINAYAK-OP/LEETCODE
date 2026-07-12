import java.util.HashSet;
class Solution {
    public boolean isHappy(int n) {
        if(n<0)
        return false;
        HashSet<Integer>seen =new HashSet<>();
        while(n!=1 && !seen.contains(n))
        {
            seen.add(n);
            int sum=0;
        while(n>0)
        {
            int d=n%10;
            sum=sum+(d*d);
            n/=10;
            
        }
        n=sum;
        }
        return n==1;
    }
}