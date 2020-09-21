package com.datastructure.stack;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Given an array A of integers, find the maximum of j - i subjected to the constraint of A[i] <= A[j].
 *
 * If there is no solution possible, return -1.
 *
 *A : [3 5 4 2]
 *
 * Output : 2
 * for the pair (3, 4)
 *
 */
public class MaximumGap {


    public static void main(String[] args) {
    Integer [] a ={    5, 5,5,5,5,5};
        List<Integer> list =new ArrayList<>();
        list.add(5);
        list.add(5);
        list.add(5);
        list.add(5);
        list.add(5);

        System.out.println(maximumGap(Arrays.asList(a)));

    }

    public static  int maximumGap(final List<Integer> A) {
        int lastFound=0;
        int minNumber = Integer.MAX_VALUE;
        int maxNumber = Integer.MIN_VALUE;

        int RMax[] = new int[A.size()];
        int LMin[] = new int[A.size()];

        /* Construct LMin[] such that LMin[i] stores the minimum value
           from (arr[0], arr[1], ... arr[i]) */
        LMin[0] = A.get(0);
        for (int i = 1; i < A.size(); ++i)
            LMin[i] = min(A.get(i), LMin[i - 1]);
        int n=A.size();
        /* Construct RMax[] such that RMax[j] stores the maximum value
           from (arr[j], arr[j+1], ..arr[n-1]) */
        RMax[n - 1] = A.get(n - 1);
        for (int j = n - 2; j >= 0; --j)
            RMax[j] = max(A.get(j), RMax[j + 1]);
    int i=0; int j=0;
         int maxdiff=Integer.MIN_VALUE;
        while ( j < n  && i <n ){
            if(RMax[j] >= LMin[i]){
                maxdiff=Math.max(maxdiff,j - i);
                j++;
            }else{

                i++;
            }
        }

     return maxdiff;
    }

    static int max(int x, int y)
    {
        return x > y ? x : y;
    }

   static  int min(int x, int y)
    {
        return x < y ? x : y;
    }

}



