package com.datastructure.amazon;

public class Converter {

    public String convertIntToString(int number) {
        int length = getLength(number);

        char[] arrayChar = new char[length];
        int indexChar = length - 1;
        while (number > 0) {
            arrayChar[indexChar] = (char) (48+ (number % 10));
            number = number / 10;
            indexChar--;
        }
        return new String(arrayChar);
    }

    /**
     * Get Length
     *
     * @param args
     * @return
     */
    private int getLength(int args) {
        int temp = 1;
        int length = 0;
        while (args > temp) {
            length++;
            temp = temp * 10;
        }
        return length;
    }


    public static void main(String[] args) {
        int number = 223;
        System.out.println(new Converter().convertIntToString(number)+"<><><<");
    }

}
