package com.datastructure.dynamicProgramming;

import java.util.Arrays;

public class SubSetSum {



    public static boolean subsetSum (int[]input,int sum,int current){
        if(sum==0) return true;
        if(current>input.length-1 || sum <0) return false;
        if(sum >= input[current]){
            int newsum=sum-input[current];
            return subsetSum(input,newsum ,current-1) || subsetSum(input,sum,current-1);
        }
        return subsetSum(input,sum,current-1);
    }

    /**
     *
     * int [] array={1,2,3,4,5,6};
     *       int sum =6;
     *
     *      1(6)
     *    /      \
     *    2(5)
     *  / \
     *             BPT   Y   A   B   C   D E F
     *
     * @param input
     * @param sum
     * @param current
     * @param subSet
     * @return
     */
    public static int   subsetSumMemoization (int[]input,int sum,int current,int subSet[][]){
        if(sum==0) return 1;
        if(current > 0 || sum <0) return 0;
        if(subSet==null){
            subSet= new int[input.length+1][sum+1];
            for(int i=0;i<subSet.length;i++){
                Arrays.fill(subSet[i],-1);
            }
        }
        if(sum >= input[current]){
            if(subSet[current][sum]== -1) {
                int newsum = sum - input[current];
                subSet[current][sum]= subsetSumMemoization(input, newsum, current - 1, subSet)  | subsetSumMemoization(input, sum, current -1, subSet);
            }
          return  subSet[current][sum];
        }
        return subsetSumMemoization(input,sum,current+1,subSet);
    }



    /**
     *
     *
     * @param args
     */
    public static void main(String[] args) {
      int [] array={1,2,3,4,5,6};
       int sum =9;
        System.out.println(subsetSum(array,sum,5));
        System.out.println(subsetSumMemoization(array,sum,5,null));

    }

}
