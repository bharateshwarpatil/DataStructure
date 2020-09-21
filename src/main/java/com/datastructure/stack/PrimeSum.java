package com.datastructure.stack;

import java.util.ArrayList;

public class PrimeSum {

    public static void main(String[] args) {

        System.out.println(primesum(80));
    }

  static  public ArrayList<Integer> primesum(int A) {

        ArrayList<Integer>  list = new ArrayList<Integer> ();
        if (A <=2 ){
            return list;
        }
      int val= 2;
         while(val < A){
             if(val*2==A){
                 list.add(val);
                 list.add((A-val));
                 break;
             }
             if(val==2) val++;
            if(A %val ==0) {
               do{
                   val++;
               } while (!isPrime(val));
                continue;
             } else{
                 if(isPrime(A-val)){
                     list.add(val);
                     list.add((A-val));
                     break;
                 }
                do{
                    val++;
                } while (!isPrime(val));
                 continue;
             }
         }
        return list;
   }



    private static boolean isPrime(int num) {
        for (int i = 2; i <num/2; i++) {
            if(num%i == 0) {
                return false;
            }
        }
        return true;
    }
}
