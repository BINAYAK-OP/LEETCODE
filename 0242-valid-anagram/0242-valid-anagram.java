// class Solution {
//     public boolean isAnagram(String s, String t) {
//         if(s.length()!=t.length())
//         return false;
//         int[] count=new int[26];
//         for(int i=0;i<s.length();i++)
//         {
//             count[s.charAt(i)-'a']++;
//             count[t.charAt(i)-'a']--;
//         }
//         for(int i=0;i<26;i++)
//         {
//             if(count[i]!=0)
//             return false;
//         }
//         return true;
//     }
// }

class Solution {
     public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length())
           return false;
           HashMap<Character,Integer> maps = new HashMap<>();
          for(int i=0;i<s.length();i++)
          {
            char ele=s.charAt(i);
            maps.put(ele,maps.getOrDefault(ele,0)+1);
        }
         for(int i=0;i<t.length();i++)
         {
        char ele=t.charAt(i);  
            if(!maps.containsKey(ele) || maps.get(ele)==0)
            return false;
            maps.put(ele,maps.get(ele)-1);

         }
         return true;
     }
}