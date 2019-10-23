package com.datastructure.math;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class RotateMatrix {


    static void rotateMatrix(int N, ArrayList<ArrayList<Integer>> mat)
    {
        System.out.println(mat);
        // Consider all squares one by one
        for (int x = 0; x < N / 2; x++)
        {
            // Consider elements in group of 4 in
            // current square
            for (int y = x; y < N-x-1; y++)
            {
                // store current cell in temp variable
                int temp = mat.get(x).get(y);    //[1, 2, 3], [4, 5, 6], [7, 8, 9]]

                // move values from right to top
                mat.get(x).set(y,mat.get(y).get(N-1-x));//[[3, 2, 3], [4, 5, 6], [1, 8, 7]]
              //  System.out.println(x+"<>1<y="+y+"<sr>1<>"+mat);
//                // move values from bottom to right
//              //  mat[y][N-1-x] = mat[N-1-x][N-1-y];
                 mat.get(y).set(N-1-x,mat.get(N-1-x).get(N-1-y));//[[3, 2, 9], [4, 5, 6], [1, 8, 7]]
               //  System.out.println(x+"<>2<y="+y+"<sr>2<>"+mat);

//                // move values from left to bottom
//              //  mat[N-1-x][N-1-y] = mat[N-1-y][x];
                 mat.get(N-1-x).set(N-1-y,mat.get(N-1-y).get(x));
              //  System.out.println(x+"<>3<y="+y+"<sr>3<>"+mat);
//
//                // assign temp to left
////                mat[N-1-y][x] = temp;
                mat.get(N-1-y).set(x,temp);
               // System.out.println(mat);


            }
        }
    }
    /**
     * @param a
     */
    public static void rotate(int N,ArrayList<ArrayList<Integer>> a) {
        for (int x = 0; x < N / 2; x++) {
            // Consider elements in group of 4 in
            // current square
            for (int y = x; y < N - x - 1; y++) {
                int temp = a.get(x).get(y);





            }
        }

    }

    /**
     *
     * @param a
     */
    public static void transpose(ArrayList<ArrayList<Integer>> a) {
        for (int x = 0; x < a.size(); x++) {
            for (int y = x; y <a.size(); y++) {
                int temp = a.get(x).get(y);
                a.get(x).set(y,a.get(y).get(x));
                a.get(y).set(x,temp);
            }
        }
   }

    public static void reverse(ArrayList<ArrayList<Integer>> a) {
        for (int x = 0; x <= a.size()/2; x++) {
            for (int y = x; y <a.size(); y++) {
                int temp = a.get(x).get(y);
                a.get(x).set(y,a.get(a.size()-1-x).get(y));
                a.get(a.size()-1-x).set(y,temp);
            }
        }
    }

    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> result=new ArrayList<>();
 for(int i=0;i<5;i++){

        ArrayList<Integer> subResult=new ArrayList<>();
        subResult.add(1);
        subResult.add(2);
        subResult.add(3);
        //result.add(subResult);
    // subResult=new ArrayList<>();
        subResult.add(4);
       subResult.add(5);
//        subResult.add(6);
//        //result.add(subResult);
//   //  subResult=new ArrayList<>();
//        subResult.add(7);
//        subResult.add(8);
//        subResult.add(9);
//        subResult.add(10);
//        subResult.add(11);
//        subResult.add(12);
//        subResult.add(13);
//        subResult.add(14);
//       subResult.add(15);

     result.add(subResult);

 }

 //System.out.println(result);


        transpose(result);
        reverse(result);
        //System.out.println(result);
        //rotateMatrix(result.size(),result);
        System.out.println(result);



    }
}