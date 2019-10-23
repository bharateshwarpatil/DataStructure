package com.datatstructure.stack;

import java.util.ArrayList;

public class Solution3 {


    public static void main(String[] args) {
        System.out.println(generateMatrix(1));

    }
    static public ArrayList<ArrayList<Integer>> generateMatrix(int A) {
        int [][] mainArray=new int [A][A];
        int count=0;
        for(int i=0;i<A;i++){
            mainArray[i]=new int[A];
        }
        int[] f_a = mainArray[0];
        for(int i=0;i<A;i++){
            f_a[i]=i+1;
            int [] tmp=mainArray[i];
            tmp[A-1]=A+i;
        }
        boolean zigZag=true;
        Integer lastvar=mainArray[A-1][A-1];
        int lastrow=A-2;
        int toprow=0;
        int lastColProcess=0;
       int [] tmp= mainArray[A-1];
        for(int j=A-2;j>=0;j--){
            ++lastvar;
            tmp[j]=lastvar;
        }
        if(mainArray.length <=1){
            ArrayList<ArrayList<Integer>> listReturn = new ArrayList<>();
            for (int [] array : mainArray) {
                ArrayList<Integer> retli= new ArrayList<>();
                for(int i:array){
                    retli.add(i);
                }
                listReturn.add(retli);
            }
            return listReturn;
        }
        boolean up=true;
        boolean right=true;
        boolean done=false;

        while(!done){
            done=true;
            while(mainArray[lastrow][lastColProcess] <= 0){
             ++lastvar;
             mainArray[lastrow][lastColProcess]=lastvar;
            if(up) {
                lastrow--;
            }else{
                lastrow++;
            }
            done=false;
         }
        if(up){
            lastrow++;
        }else{
            lastrow--;
        }
       if(!right) {
                lastColProcess--;
            }else{
                lastColProcess++;
            }
            while( mainArray[lastrow][lastColProcess] <= 0){
            ++lastvar;
            mainArray[lastrow][lastColProcess]=lastvar;
            if(right) {
                lastColProcess++;
            }else{
                lastColProcess--;
            }
            done=false;
        }
            if(right) {
                lastColProcess--;
            }else{
                lastColProcess++;
            }
            up=!up;
            right=!right;
            if(!up){
                lastrow++;
            }else{
                lastrow--;
            }
   }
        ArrayList<ArrayList<Integer>> listReturn = new ArrayList<>();
        for (int [] array : mainArray) {
            ArrayList<Integer> retli= new ArrayList<>();
            for(int i:array){
                retli.add(i);
            }
            listReturn.add(retli);
        }
        return listReturn;
    }
}
