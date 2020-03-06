package com.selfguide.datastructure.sort;

import java.util.Arrays;

public class CountingSort {


    public void sort(int[] arr, int k) {
       int count[] = new int[k];
        Arrays.fill(count, 0);
        for (int i = 0; i < arr.length; i++) {
            count[arr[i]] = count[arr[i]] + 1;
        }
        for (int i = 0; i < k - 1; ++i) {
            count[i + 1] = count[i] + count[i + 1];
        }
        int result[] = new int[arr.length];
        for(int i=0;i<arr.length;i++) {
            int tmp=count[arr[i]]-1;
            count[arr[i]]=tmp;
            result[tmp]= arr[i];
        }
    }




}
