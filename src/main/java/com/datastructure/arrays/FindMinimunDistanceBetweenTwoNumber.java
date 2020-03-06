package com.selfguide.datastructure.arrays;

public class FindMinimunDistanceBetweenTwoNumber {

    /**
     * @param a
     * @param firstNumber
     * @param secondNumber
     * @return
     */
    public int findMinDistance(int a[], int firstNumber, int secondNumber) {
        int min_distance = Integer.MAX_VALUE;
        int prev = 0;
        int i = 0;
        for (; i < a.length; i++) {

            if (a[i] == firstNumber || a[i] == secondNumber) {
                prev = i;
                break;
            }
        }
        i++;
        for (; i < a.length; i++) {
            if (a[i] == firstNumber || a[i] == secondNumber) {
                if (a[i] != prev && (i - prev) < min_distance) {
                    min_distance = i - prev;
                }
                prev = i;
            }
        }
        return  min_distance;
    }
}
