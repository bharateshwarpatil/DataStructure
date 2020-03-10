package com.datastructure.sort;

import java.io.*;
import java.util.Arrays;

/**
 * @author Bharateshwar Patil
 */
public class ActivityNotification {

    static int activityNotifications(int[] expenditure, int d) {
        boolean isEven = false;
        int notificationCount = 0;
        if (d % 2 == 0) isEven = true;
        int prev = 0;
        int[] tmpArray = Arrays.copyOfRange(expenditure, 0, d);

        for (int i = 0; (i + d) < expenditure.length; i++) {
            if (i + d == d) {
                Quicksort(tmpArray, 0, d - 1);
            } else {
                InsertionSort(expenditure, i, prev, d, tmpArray);
            }
            int median = 0;
            if (isEven) {
                int mid = (d / 2);
                median = (tmpArray[mid] + tmpArray[(mid + 1)]) / 2;
            } else {
                int mid = ((d / 2));
                median = tmpArray[mid];
            }
            if (expenditure[i + d] >= (2 * median)) {
                notificationCount++;
            }
            prev = expenditure[i];
        }
        return notificationCount;
    }

    static void InsertionSort(int[] expenditure, int iloc, int prevEntry, int d, int[] tmpArray) {
        int newEntry = expenditure[iloc + d-1];
        int j = 0;
        System.out.println( "before remove "+Arrays.toString(tmpArray));
        while (j < d) {
            if (prevEntry == tmpArray[j]) {
                System.out.println("Removed item"+prevEntry+"newEntry"+newEntry);
                tmpArray[j] = newEntry;
                break;
            }
            j++;
        }
        if (j > 0 && tmpArray[j - 1] > tmpArray[j]) {
            while (j > 0 && tmpArray[j - 1] > newEntry) {
                tmpArray[j] = tmpArray[j - 1];
                j--;
            }

        } else {
            while (j + 1 < d && tmpArray[j+1] < newEntry) {
                tmpArray[j] = tmpArray[j+1];
                j++;
            }
        }
        tmpArray[j] = newEntry;
        System.out.println(Arrays.toString(tmpArray));


    }

    static void Quicksort(int[] expenditure, int start, int end) {
        if (start < end) {
            int pivote = sort(expenditure, start, end);
            Quicksort(expenditure, start, pivote - 1);
            Quicksort(expenditure, pivote, end);
        }
    }

    static int sort(int[] expenditure, int start, int end) {
        int pivote = (start + end) / 2;
        while (start <= end) {
            while (expenditure[start] < expenditure[pivote]) {
                start++;
            }
            while (expenditure[end] > expenditure[pivote]) {
                end--;
            }
            if (start <= end) {
                swap(expenditure, start, end);
                start++;
                end--;
            }
        }
        return start;
    }

    public static void swap(int[] expenditure, int i, int j) {
        int temp = expenditure[i];
        expenditure[i] = expenditure[j];
        expenditure[j] = temp;
    }

    public static void main(String[] args) {
        int[] expenditure = {2,3,4,2,3,6,8,8,16};

        //String data =ReadFromfile("/Users/Bharat/Documents/DataStructure/src/main/java/com/datastructure/sort/inputFileForActivityNotification");
       //String [] exp = data.split("\\s");
       // int[] array = Arrays.asList(exp).stream().mapToInt(Integer::parseInt).toArray();
        System.out.println(activityNotifications(expenditure, 5));
    }
    public static String ReadFromfile(String fileName) {
        StringBuilder returnString = new StringBuilder();
        InputStream fIn = null;
        InputStreamReader isr = null;
        BufferedReader input = null;
        try {
            fIn = new FileInputStream(new File(fileName));
            isr = new InputStreamReader(fIn);
            input = new BufferedReader(isr);
            String line = "";
            while ((line = input.readLine()) != null) {
                returnString.append(line);
            }
        } catch (Exception e) {
            e.getMessage();
        } finally {
            try {
                if (isr != null)
                    isr.close();
                if (fIn != null)
                    fIn.close();
                if (input != null)
                    input.close();
            } catch (Exception e2) {
                e2.getMessage();
            }
        }
        return returnString.toString();
    }
}
