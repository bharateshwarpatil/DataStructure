package com.datastructure.list.singlylist;

public class TestJava {


    public static int getCounGroup(int [] [] args){
        int totalGroups=0;
        for(int i=0;i<args.length;i++){
            int row =i;
            int col=0;
            boolean isPass=false;
            while(true){
                if(args[row][col]==1 && col+1 < args[row].length){
                col++;
                    isPass=true;
                }else if(row+1 < args.length){
                     row++;
                    continue;
                }else if(col+1 < args[row].length){
                    col++;
                }
                break;
              }
              if(isPass){
                  totalGroups++;
                  isPass=false;
              }
          }

          return totalGroups;
    }


    public  static void main(String [] args){
        int a[][]=new int[][]{
                { 0, 0, 0},
                { 0, 1, 0},
                { 0, 1, 0}};

        System.out.println(getCounGroup(a));
    }
}
