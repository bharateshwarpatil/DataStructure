package com.datastructure.math;

/**
 * Given a column title as appears in an Excel sheet, return its corresponding column number.
 *
 * Example:
 *
 *     A -> 1
 *
 *     B -> 2
 *
 *     C -> 3
 *
 *     ...
 *
 *     Z -> 26
 *
 *     AA -> 27
 *
 *     AB -> 28
 */
public class ColumnTitle {

   static public String titleToNumber(String A) {
        A=A.toUpperCase();
        char [] chars =new char[A.length()];
        A.getChars(0,A.length(),chars,0);
        short z=(short)'Z'-(short)'A'+1;
        short a=(short)'A';
         if(A.length()==1) return String.valueOf(A.charAt(0)-a+1);
          int cnt=1;
          int val=0;
          int factZ=factorial(z);
       System.out.println(factZ);
       int factD=(factorial((A.length()-1))*factorial((z-(A.length()-1))));
       System.out.println(factD);
       long basevalue= (factZ/factD);
       basevalue=((A.charAt(0)-a))*z*basevalue;
             while (cnt <=A.length()) {
                 short charat = (short) A.charAt(cnt - 1);
                 val = (int) (basevalue+z + (short) charat - a + 1);
                 cnt++;
             }
       StringBuilder builder =new StringBuilder();
       builder.append(val);
     return  builder.toString();



    }
    static int factorial(int n){
        if (n == 0)
            return 1;
        else
            return(n * factorial(n-1));
    }

    public static void main(String[] args) {

        System.out.println(titleToNumber("BB"));
    }
}
