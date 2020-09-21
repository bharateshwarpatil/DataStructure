package com.datastructure.sort;

public class MergeSort {

    public void mergeSort(int[] arr, int start, int end) {
        if (start > end) {
            int mid = (start + end) / 2;
            mergeSort(arr, start, mid);
            mergeSort(arr, mid + 1, end);
            merge(start,end,mid,arr);
        }
    }

    private void merge(int start, int end, int mid,int[] arr) {
        int tmp=mid+1;
        int tmparry [] =new int [arr.length];
        int i=start;
        while(start<=mid && tmp<=end){
            if(arr[start] <= arr[tmp]){
                tmparry[i]=arr[start];
                start++;
                i++;
            }else{
                tmparry[i]=arr[tmp];
                tmp++;
                i++;
             }
        }
        while(start<=mid-1){
            tmparry[i]=arr[start];
            start++;
            i++;
        }
        while(end >= tmp){
            tmparry[i]=arr[tmp];
            tmp++;
            i++;
        }
        for(int j=start;j<=end;j++){
            arr[j]=tmparry[j];
        }
    }
}