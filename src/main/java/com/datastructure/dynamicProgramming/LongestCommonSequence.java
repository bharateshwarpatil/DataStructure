package com.selfguide.datastructure.dynamicProgramming;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LongestCommonSequence {


    static int[] longestCommonSubsequence(int[] a, int[] b) {
        int max = 0;
        int k = 0;
        int l = 0;
        int[][] comSq = new int[a.length + 1][b.length + 1];
        for (int i = 0; i <= a.length; i++) {
            for (int j = 0; j <= b.length; j++) {
                if (i == 0 || j == 0) {
                    comSq[i][j] = 0;
                } else if (a[i - 1] == b[j - 1]) {
                    comSq[i][j] = comSq[i - 1][j - 1] + 1;
                    if (max < comSq[i][j]) {
                        max = comSq[i][j];
                        k = i - 1;
                        l = j - 1;
                    }
                }
            }

        }
        List<Integer> list = new ArrayList<Integer>();
        while (k >= 0 && max > 0) {
            list.add(a[k]);
            k--;
            max--;
        }
        int[] result = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            result[i] = list.get(i);
        }
        return result;
    }

    /**
     *
     * @param args
     */

    public static void main(String[] args) {
        int s[] = {1, 2, 3, 4, 1};
        int a[] = {3, 4, 1, 2, 1, 3};
        System.out.println(Arrays.toString(longestCommonSubsequence(s, a)));
    }
}
