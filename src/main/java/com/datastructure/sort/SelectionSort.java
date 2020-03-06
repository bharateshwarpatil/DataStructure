package com.selfguide.datastructure.sort;

public class SelectionSort {

    public void sort(int arr[]) {

        for (int i = 0; i < arr.length; i++) {
            int min =i;
            for (int j = i+1; j < arr.length; j++) {
                if(arr[min] > arr[j]){
                    min=j;
                }
            }
            swap(i,min,arr);
        }
    }

    private void swap(int j, int i, int[] arr) {
        int temp = arr[j];
        arr[j]=arr[i];
        arr[i]=temp;
    }
}
