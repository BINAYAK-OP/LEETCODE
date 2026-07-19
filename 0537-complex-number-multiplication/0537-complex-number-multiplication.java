class Solution {
    public String complexNumberMultiply(String num1, String num2) {
      
            int idx=num1.indexOf('+');
            String p=num1.substring(0,idx);
             String q=num1.substring(idx+1,num1.length()-1 );

             idx=num2.indexOf('+');
            String r=num2.substring(0,idx);
            String s=num2.substring(idx+1,num2.length()-1);
             
        int real1=Integer.parseInt(p);
        int imag1=Integer.parseInt(q);
        int real2=Integer.parseInt(r);
        int imag2=Integer.parseInt(s);

        int real=(real1*real2) -(imag1*imag2);
        int imag=(real1*imag2)+(real2*imag1);

        return (real +"+"+imag+ "i");
    }
    
}