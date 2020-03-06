package com.selfguide.datastructure.sort;


public class BubbleSort {

    /**
     *
     * @param arr
     */
    public void sort(int arr[]) {

        for (int i = 0; i < arr.length; i++) {
            for (int j = 1; j < arr.length - i; j++) {
                if (arr[j - 1] > arr[j]) {
                    swap(j, j - 1, arr);
                }
            }
        }
    }

    private void swap(int j, int i, int[] arr) {
          int temp = arr[j];
          arr[j]=arr[i];
          arr[i]=temp;
    }
}
