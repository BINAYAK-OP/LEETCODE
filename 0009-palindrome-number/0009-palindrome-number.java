class Solution {
    public boolean isPalindrome(int x) {
        int a=0,s,b=x;
        while(x>0)
        {
            s=x%10;
            a=a*10+s;
            x=x/10;
        }
        if(a==b)
        return true;
        else
        return false;
        
    }
}