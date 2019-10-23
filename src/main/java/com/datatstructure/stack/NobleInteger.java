package com.datatstructure.stack;

import java.util.ArrayList;
import java.util.Collections;

public class NobleInteger {

    public static void main(String[] args) {
        ArrayList<Integer> subResult=new ArrayList<>();
        subResult.add(4);
        subResult.add(18);
        subResult.add(18);
        subResult.add(0);
        subResult.add(2);



        System.out.println(solve(subResult));
   }

   static public int solve(ArrayList<Integer> A) {

        Collections.sort(A);

        for (int i = 0; i < A.size(); i++) {
            int count = 0;
            if (i < (A.size()-1) && A.get(i) == A.get(i+1)) {
                continue;
            }
            if(A.get(i)==(A.size()-(i+1))){
                return 1;
            }

        }

        return -1;
    }
}