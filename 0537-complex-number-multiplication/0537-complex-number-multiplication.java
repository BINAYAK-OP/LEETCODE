class Solution {
    public String complexNumberMultiply(String num1, String num2) {
        int i=1;
         String p="";
          String q="";
           String r="";
            String s="";
        while(i<num1.length())
        {
            if(num1.charAt(i)=='+' || num1.charAt(i)=='-')
            {
             p=num1.substring(0,i);
             q=num1.substring(i+1,num1.length()-1 );
             break;
            }
            i++;
        }
        i=1;
          while(i<num2.length())
        {
            if(num2.charAt(i)=='+' || num2.charAt(i)=='-')
            {
             r=num2.substring(0,i);
             s=num2.substring(i+1,num2.length()-1);
             break;
            }
            i++;
        }
        int real1=Integer.parseInt(p);
        int imag1=Integer.parseInt(q);
        int real2=Integer.parseInt(r);
        int imag2=Integer.parseInt(s);

        int real=(real1*real2) -(imag1*imag2);
        int imag=(real1*imag2)+(real2*imag1);

        return (real +"+"+imag+ "i");
    }
    
}