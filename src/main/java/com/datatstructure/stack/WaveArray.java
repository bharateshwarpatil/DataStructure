package com.datatstructure.stack;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class WaveArray {

    public static void main(String[] args) {
        Integer [] a={1, 2, 3, 4};
        System.out.println(wave((List<Integer>)Arrays.asList(a)));
    }

   static  public List<Integer> wave(List<Integer> A) {
          java.util.Collections.sort(A);
          for(int i=0 ;i<A.size()-1;i=i+2){
              int tmp=A.get(i);
              A.set(i,A.get(i+1));
              A.set(i+1,tmp);
          }
       return A;
    }

}
