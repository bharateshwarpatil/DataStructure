package com.datastructure.stack;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class SquareMatric {

    public static void main(String[] args) {

        ArrayList<ArrayList<Integer>> result=new ArrayList<>();
        ArrayList<Integer> subResult=new ArrayList<>();
        result.add(subResult);
        subResult.add(1);
        subResult.add(2);
        subResult.add(3);
        subResult=new ArrayList<>();
        result.add(subResult);

        subResult.add(4);
        subResult.add(5);
        subResult.add(6);

        subResult=new ArrayList<>();
        result.add(subResult);

        subResult.add(7);
        subResult.add(8);
        subResult.add(9);
        System.out.println(diagonal(result));

    }

   static  public ArrayList<ArrayList<Integer>> diagonal(ArrayList<ArrayList<Integer>> A) {
        ArrayList<ArrayList<Integer>> result=new ArrayList<>();
        Map<Integer,Integer> map =new HashMap<>();
        int j=0;
        boolean done=false;
        boolean up=true;

        while(!done){

          if(j<0) break;
          if(j==A.size()-1) up=false;
            int i=0;
            ArrayList<Integer> subResult=new ArrayList<>();
            result.add(subResult);
            int count =0;
            while(count<j+1){
               Integer len= map.get(i);
                if(len==null){
                    map.put(i,1);
                    len=1;
                }
                 if (len <= A.size()){
                    subResult.add(A.get(i).get(len-1));
                     count++;
                     map.put(i,len+1);
                 }
                i++;
            }
            if(up){
                j++;
            }else{
                j--;
            }

        }
         return result;
    }
}
