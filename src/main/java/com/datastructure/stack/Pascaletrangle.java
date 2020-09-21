package com.datastructure.stack;

import java.util.ArrayList;

public class Pascaletrangle {

    public static void main(String[] args) {

        System.out.println(solve(5));
    }

    static public ArrayList<ArrayList<Integer>> solve(int A) {
        ArrayList<ArrayList<Integer>> arrayList =new ArrayList<>();

        for(int i=0;i<A;i++){
            ArrayList<Integer> currentList=new ArrayList<>(i+1);
            if(i>0){
                ArrayList<Integer> lastlist = arrayList.get(i-1);
                currentList.add(lastlist.get(0));
                for(int j=1; j<lastlist.size();j++){
                    currentList.add(lastlist.get(j-1) +lastlist.get(j));
                }
            //    currentList.add(lastlist.get(1));

            }
                currentList.add(1);

             arrayList.add(currentList);
          }

         return arrayList;
  }
}
