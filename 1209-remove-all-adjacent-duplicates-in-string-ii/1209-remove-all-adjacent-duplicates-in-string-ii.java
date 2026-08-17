class Solution {
    public String removeDuplicates(String s, int k) {
         int n=s.length();
        Stack<Character> st=new Stack<>();
        Stack<Integer> count=new Stack<>();
        for(int i=0;i<n;i++)
        {
            char ch=s.charAt(i);
           if(st.isEmpty() || st.peek()!=ch)
           {
           st.push(ch);
           count.push(1);
           }
           else 
           {
            int c=count.pop();
            c++;
            if(c==k)
            {
                st.pop();
            }
            else
            {
                count.push(c);
            }
           }
        }
        StringBuilder ans=new StringBuilder();
        while(!st.isEmpty())
        {
            char ch=st.pop();
            int c=count.pop();

            while(c>0)
            {
                ans.append(ch);
                c--;
            }
        }
        return ans.reverse().toString();
    }
}