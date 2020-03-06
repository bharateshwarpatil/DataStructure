package com.selfguide.datastructure.arrays;

import java.util.ArrayList;
import java.util.List;

public class MinSteps {



    public static String longestKInterspaceSubstring(String word, int k) {
        // Write your code here

        StringBuilder builder = new StringBuilder();
        int maxLength=Integer.MIN_VALUE;
        int currentLength=0;
        boolean lastappend=false;
        for(int i=0;i<word.length()-1;i++){
            System.out.println(word.charAt(i)-word.charAt(i+1));
            if((Math.abs(word.charAt(i)-word.charAt(i+1))<= k) && currentLength >= maxLength){
                if(!lastappend)builder.append(word.charAt(i));
                builder.append(word.charAt(i+1));
                currentLength++;
                maxLength=currentLength;
                lastappend=true;
            }else{
                currentLength=0;
                lastappend=false;
            }
        }

        return builder.toString();
    }
    public static void main(String[] args) {
        int i=args.length;
        ArrayList list = new ArrayList();
        list.add(3);

        list.add(1);
        list.add(2);
        list.add(1);

        System.out.println(calculateTotalRegion(list));
    }

    public static long calculateTotalRegion(List<Integer> heights) {
        // Write your code here
        int frwrd=0;
        int backwrd=0;
        long totalsum=0;
        for(int i=1;i<heights.size(); i++){
            int j=i+1;
            while(j < heights.size() && heights.get(i) <= heights.get(j)){
                frwrd ++;
                j++;
            }
            j=i-1;
            while(j > 0 && heights.get(i) <= heights.get(j-1)){
                backwrd++;
                j--;
            }

            totalsum+=frwrd+backwrd+heights.get(i);
            System.out.println(totalsum+"<><>"+i);
            frwrd=0;
            backwrd=0;
        }

        return totalsum;
    }


}
