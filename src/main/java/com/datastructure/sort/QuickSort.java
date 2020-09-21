package com.datastructure.sort;

public class QuickSort {


    public void quickSort(int [] arr,int start,int end){
        if(start > end){
           int pivote = sort(arr,start,end);
            quickSort(arr,start,pivote-1);
            quickSort(arr,pivote,end);
        }

    }

    public int sort(int [] arr,int start,int end){
        int pivote=(start+end)/2;
        while(start<=end){
            while(arr[start]<arr[pivote]){
                start++;
            }
            while(arr[end]>arr[pivote]){
                end--;
            }
            if(start<=end){
            swap(start,end,arr);
            start++;
            end--;
            }
        }
        return  start;
     }

    private void swap(int j, int i, int[] arr) {
        int temp = arr[j];
        arr[j]=arr[i];
        arr[i]=temp;
    }

}
