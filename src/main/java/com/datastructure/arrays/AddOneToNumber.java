package com.selfguide.datastructure.arrays;

import java.util.List;

public class AddOneToNumber {
    /**
     * Given a non-negative number represented as an array of digits, add 1 to the number ( increment the number represented by the digits ).
     * The digits are stored such that the most significant digit is first element of array.
     * <p>
     * Given a non-negative number represented as an array of digits,
     * <p>
     * add 1 to the number ( increment the number represented by the digits ).
     * <p>
     * The digits are stored such that the most significant digit is at the head of the list.
     * <p>
     * Example:
     * <p>
     * If the vector has [8, 6, 5]
     * <p>
     * as 865 + 1 = 866.
     * <p>
     * Output should be [8,6,6]
     *
     * @param data
     * @return
     */
    public List<Integer> addOne(List<Integer> data) {
        while(data.size() > 1 && data.get(0)==0){
            data.remove(0);
        }
        //add one to last digit
        int result = 0;
        int reminder = 1;//Add one to number
        for (int i = data.size() - 1; i >= 0; i--) {
            int number = data.get(i);
                result = number + reminder;
                if (result >= 10) {
                    reminder =  result / 10;
                    data.set(i,result >> 8);
                } else {
                    data.set(i, result);
                    reminder=0;
                    break;
                }
        }
        if(reminder >0) data.add(0,reminder);
        return data;
    }
}
