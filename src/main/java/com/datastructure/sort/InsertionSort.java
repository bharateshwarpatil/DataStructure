package com.selfguide.datastructure.sort;

public class InsertionSort {

    public void sort(int arr[]) {
        for (int i = 1; i < arr.length; i++) {
            int j=i;
            while(j-1 >= 0 && arr[i]< arr[j-1]){
              arr[j]=arr[j-1];
              j--;
            }
            swap(j,i,arr);
        }
    }

    private void swap(int j, int i, int[] arr) {
        int temp = arr[j];
        arr[j]=arr[i];
        arr[i]=temp;
    }

}
