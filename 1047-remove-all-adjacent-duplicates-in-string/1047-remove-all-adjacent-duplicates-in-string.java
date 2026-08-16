class Solution {
    public String removeDuplicates(String s) {
        int n=s.length();
        Stack<Character> st=new Stack<>();
        for(int i=0;i<n;i++)
        {
            char ch=s.charAt(i);
           if(st.isEmpty())
           st.push(ch);
           else 
           {
             char top=st.peek();
             if(ch!=top)
            st.push(ch);
            else
            st.pop();
           }
        }
        String ans="";
        while(!st.isEmpty())
        {
            ans=st.pop()+ans;
        }
        return ans;
    }
}