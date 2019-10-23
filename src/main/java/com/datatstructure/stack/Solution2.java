package com.datatstructure.stack;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution2 {
    static ArrayList<Integer> a=new ArrayList<>();
    static  ArrayList<Integer> b=new ArrayList<>();

    public static void main(String[] args) {
        Integer [] array= {  24115, -75629, -46517, 30105, 19451, -82188, 99505, 6752, -36716, 54438, -51501, 83871, 11137, -53177, 22294, -21609, -59745, 53635, -98142, 27968, -260, 41594, 16395, 19113, 71006, -97942, 42082, -30767, 85695, -73671 };

        List<Integer> A = Arrays.asList(array);
        System.out.println( maxset(A));

    }

    public static  ArrayList<Integer> maxset(List<Integer> A) {
        int isNegative=-1;
        boolean firstHalf=true;
        long sumA=0;
        long sumB=0;

        for(int i=0;i<A.size();i++){
            if(A.get(i) < 0){
                isNegative++;
                firstHalf=!firstHalf ;
                if(sumA >sumB) {
                    b = a;
                    sumB = sumA;
                    a=new ArrayList<>();
                    sumA=0;
                }else if(sumB >sumA){

                    a=new ArrayList<>();
                    sumA=0;
                    continue;
                }else if (a.size()==b.size()){
                  continue;
                }else if(a.size() >b.size()){
                    b=a;
                    a=new ArrayList<>();
                    sumB = sumA;
                    sumA=0;
                }
                continue;
            }
            a.add(A.get(i));
            sumA=sumA+A.get(i);
        }
        if(sumA >sumB){
            return a;
        }else if(sumB>sumA){
            return b;
        }else if (a.size()==b.size()){
           return b;
        }

        return a.size() < b.size()?b:a;

    }
}
