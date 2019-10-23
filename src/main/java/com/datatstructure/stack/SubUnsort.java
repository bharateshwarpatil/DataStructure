package com.datatstructure.stack;

import java.util.ArrayList;
import java.util.Collections;

public class SubUnsort {
    public static void main(String[] args) {
        ArrayList<Integer> list =new ArrayList<>();
        list.add(1);
        list.add(3);
        list.add(4);
        list.add(2);
        list.add(5);
        System.out.println(subUnsort(list));
    }
   static public ArrayList<Integer> subUnsort(ArrayList<Integer> A) {
        ArrayList<Integer> original = new ArrayList<Integer>(A);
        Collections.sort(A);
        int start =-1;
        int end = -1;
        for(int i=0;i<A.size();i++){
            if(A.get(i)!=original.get(i)){
                start =i;
                break;
            }
        }
        for(int i=A.size()-1;i>=0;i--){
            if(A.get(i)!=original.get(i)){
                end =i;
                break;
            }
        }
        ArrayList<Integer> result = new ArrayList<Integer>();
        if(start!=-1 && end!=-1){
            result.add(start);
            if(start!=end)
                result.add(end);
        }else
            result.add(-1);
        return result;
    }
}





