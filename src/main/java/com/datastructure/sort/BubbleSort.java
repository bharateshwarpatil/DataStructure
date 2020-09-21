package com.datastructure.sort;


import java.util.Arrays;

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

    public static void main(String[] args) {
        int [] arr={4,5,4,2,3,1};
        BubbleSort bubbleSort= new BubbleSort();
        bubbleSort.sort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
