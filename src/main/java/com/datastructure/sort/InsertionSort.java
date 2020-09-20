package com.selfguide.datastructure.sort;

import java.util.Arrays;

public class InsertionSort {

    public void sort(int arr[]) {
        for (int i = 1; i < arr.length; i++) {
            int j=i;
            int v = arr[i];
            while(j >0 && arr[j-1]>v){
              arr[j]=arr[j-1];
              j--;
            }
           arr[j]=v;
        }
    }


    public static void main(String[] args) {
        int [] arr={4,5,4,2,3,1};
        InsertionSort insertionSort= new com.selfguide.datastructure.sort.InsertionSort();
        insertionSort.sort(arr);
        System.out.println(Arrays.toString(arr));
    }

}
