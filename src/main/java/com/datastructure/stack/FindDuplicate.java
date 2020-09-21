package com.datastructure.stack;

import java.util.ArrayList;
import java.util.List;

public class FindDuplicate {

    public static void main(String[] args) {
        List<Integer> a =new ArrayList<>();
        a.add(3);
        a.add(4);
        a.add(1);
        a.add(2);
        a.add(1);

        System.out.println(repeatedNumber(a));
    }

  static  public int repeatedNumber(final List<Integer> a) {
        int [] array = new int[a.size()];
        for(int i=0;i<a.size();i++){
            if(array[a.get(i)] > -1){
                array[a.get(i)] = -Math.abs(a.get(i));
            }else{
                return a.get(i);
            }
        }
        return -1;
    }

}
