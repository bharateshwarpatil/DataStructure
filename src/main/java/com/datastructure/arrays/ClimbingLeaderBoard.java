package com.selfguide.datastructure.arrays;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class ClimbingLeaderBoard {

    static int[] climbingLeaderboard(int[] scores, int[] alice) {
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        int duplicateCount = 0;
        int result[] = new int[alice.length];
        for (int i = 0; i < scores.length; i++) {
            if (map.get(scores[i]) != null) {
                duplicateCount++;
                continue;
            }
            map.put(scores[i], i - duplicateCount + 1);
        }
        for (int i = 0; i < alice.length; i++) {
            int start = 0;
            int end = scores.length - 1;
            int mid = 0;
            boolean checkforword = false;
            while (start < end) {
                mid = (start + end) / 2;
                if (scores[mid] == alice[i]) {
                    result[i] = map.get(scores[mid]);
                }
                if (scores[mid] > alice[i]) {
                    start = mid + 1;
                    checkforword = true;
                } else {
                    end = mid;
                    checkforword = false;
                }
            }

            if (checkforword) {
                while (mid < end && alice[i] < scores[mid]) {
                    mid++;
                }
                if(scores[mid]==alice[i]) {
                    result[i] = map.get(scores[mid]);
                }else if (mid < end || alice[i] > scores[mid]) {
                    result[i] = map.get(scores[mid]);
                } else result[i] = map.get(scores[end]) + 1;
            } else {
                while (mid > start && alice[i] > scores[mid]) {
                    mid--;
                }
                if(scores[mid]==alice[i]) {
                    result[i] = map.get(scores[mid]);
                }else if (mid > start ||  alice[i] < scores[mid]) {
                    result[i] = map.get(scores[mid]);
                }else {
                    result[i] = map.get(scores[end]);
                }
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int scores[] = {100, 90, 90, 80, 75, 60};
        int alice []={50,65,77,90,102};
       // int alice[] = {90};
        System.out.println(Arrays.toString(climbingLeaderboard(scores, alice)));


    }
}
