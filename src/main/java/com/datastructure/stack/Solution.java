package com.datastructure.stack;



import java.util.ArrayList;

public class Solution {

    public static void main(String [] args){
        System.out.println(10%10);
        System.out.println(1%10);
        ArrayList<Integer> A =new ArrayList<Integer>();
        A.add(1);
        A.add(3);
        A.add(9);
        A.add(9);;

        System.out.println( plusOne(A));
    }

    static  public ArrayList<Integer> plusOne(ArrayList<Integer> A) {
        int reminder=0;
         while(A.get(0)==0){
             A.remove(0);
         }
        int i = A.size()-1;
        do{
            int tmp=reminder;
            reminder=0;
            int data =0;
            data = A.get(i);
            if(tmp>0){
                data = data+tmp;
            }else{
                data = data+1;
            }
            int lowByte =data;
            if(data >10) {
                reminder = data % 10;
                lowByte = (int)data >> 8;
            }
            if(data==10){
                reminder=1;
                lowByte = (int)data >> 8;
            }
            A.set(i,lowByte);
            i--;
        }while(reminder > 0 && i >= 0);
        if(reminder >0){
            A.add(0,reminder);
        }
      return A;
    }
}
