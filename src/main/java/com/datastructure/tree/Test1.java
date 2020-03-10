package com.datastructure.tree;

import java.util.HashSet;
import java.util.Set;

public class Test1 {

    public static int findSmallestDivisor(String s, String t) {
        int data = getDivideCount(s, t);
        if (data == -1) return data;

        int small = 0;



         return small ==-1 ? t.length(): t.length()/2;
    }

    private static int getDivideCount(String s, String t) {
        int index=0;
        int cnt=0;
        String tmp=s;
        while(index <s.length()){
            if(s.length() < index+t.length()) return -1;
            tmp=s.substring(index,index+t.length());
            index=index+t.length();
            if(!tmp.equals(t))return  -1;
            cnt++;
        }
        return cnt;
    }

    public static void main(String[] args) {

        System.out.println(findSmallestDivisor("bcdbcdbcdbcd","bcdbcd")+" -- Anser");
    }
}


