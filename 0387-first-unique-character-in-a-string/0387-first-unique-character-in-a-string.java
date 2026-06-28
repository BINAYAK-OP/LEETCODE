class Solution {
    public int firstUniqChar(String s) {
        int n=s.length();
        int[] freq=new int[26]; 
        int i;
        for(i=0;i<s.length();i++)
        {
            freq[s.charAt(i)-'a']++;
        }
        for(i=0;i<s.length();i++)
        {
            if(freq[s.charAt(i)-'a']==1)
            return i;
        }
        return -1;
    }
}