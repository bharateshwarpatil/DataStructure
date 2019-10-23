package com.datatstructure.stack;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import java.util.concurrent.atomic.AtomicInteger;

public class LargestNumber {

    public static void main(String[] args) {
        ArrayList<Integer> subResult=new ArrayList<>();
        subResult.add(3);
        subResult.add(30);
        subResult.add(34);
        subResult.add(5);
        subResult.add(9);

        /* subResult.add(472);
        subResult.add(663);
        subResult.add(964);
        subResult.add(722);
        subResult.add(485);
        subResult.add(852);
        subResult.add(635);
        subResult.add(4);
        subResult.add(368);
        subResult.add(319);*/
      Integer a[]= { 980, 674, 250, 359, 98, 969, 143, 379, 363, 106, 838, 923, 969, 880, 997, 664, 152, 329, 975, 377, 995, 943, 369, 515, 722, 302, 496, 124, 692, 993, 341, 785, 400, 113, 302, 563, 121, 230, 358, 911, 437, 438, 494, 599, 168, 866, 689, 444, 684, 365, 470, 176, 910, 204, 324, 657, 161, 884, 623, 814, 231, 694, 399, 126, 426 };
        Integer b []= { 782, 240, 409, 678, 940, 502, 113, 686, 6, 825, 366, 686, 877, 357, 261, 772, 798, 29, 337, 646, 868, 974, 675, 271, 791, 124, 363, 298, 470, 991, 709, 533, 872, 780, 735, 19, 930, 895, 799, 395, 905 };

     //   997-995-993-98-980975969969943923911910884880866838814785722694692689684674664657623599563515496494470444438437426400399379377369365363359358341329324302302250231230204176168161152143126124121113106
      //subResult.add(412);
        //991974940930905-895877872868825799798791782780-772-735-709-686-686-678-675-6-646-533-502-470-409-395-366-363-357-337-298-29-271-261-240-19-124-113
         //991-974-940-930-905-895-877-872-868-825-799-798-791-782-780-772-735-709-686-686-678-675-6-646-533-502-470-409-395-366-363-357-337-29-298-271-261-240-19-124-113-
        // 991-974-940-930-905-895-877-872-868-825-799-798-791-782-780-772-735-709-686-686-678-675-6-646-533-502-470-409-395-366-363-357-337-29-298-271-261-240-19-124-113-
        //    991-974-940-930-905-895-877-872-868-825-799-798-791-782-780-772-735-709-686-686-678-675-6-646-533-502-470-409-395-366-363-357-337-298-29-271-261-240-19-124-113-
        // int [] a={ , , , , 485, 852, 635, 4, 368, 368, 319, 412};
       System.out.println(largestNumber((List<Integer>) Arrays.asList(b)));
     //  System.out.println(largestNumber(subResult));

    }

    // DO NOT MODIFY THE LIST. IT IS READ ONLY
  static  public String largestNumber(final List<Integer> A) {

      List<List<Integer>> list = new ArrayList<>(10);
      int cnt=10;
      while( cnt >0){
          List<Integer> current_tmp = new ArrayList<Integer>();
          list.add(current_tmp);
          cnt--;
      }
      StringBuilder builder = new StringBuilder();
      for (int i = 0; i < A.size(); i++) {
          {
              int newVal = A.get(i);
              if(newVal==0){
                  List<Integer> current = list.get(newVal);
                  current.add(newVal);
                  continue;
              }
              if (newVal >= 10) {
                  newVal=Integer.valueOf(String.valueOf(newVal).substring(0,1));
              }
              List<Integer> current = list.get(newVal);
              if(current.isEmpty()) {
                  current.add(A.get(i));
                  continue;
              }
              boolean succes = false;
              int insertIndex=-1;

              for (int j = current.size()-1; j >=0 ; j--) {
                  int val = current.get(j);
                  int bitNumber = 1;
                  while (!succes) {
                      String newValStr = String.valueOf(A.get(i));
                      String valStr = String.valueOf(current.get(j));
                      if(Integer.valueOf(newValStr +valStr) < Integer.valueOf(valStr+newValStr)){
                          current.add(j+1,A.get(i));
                          succes=true;
                          break;
                      }else if (Integer.valueOf(newValStr +valStr) >= Integer.valueOf(valStr+newValStr)){
                          insertIndex=j;
                          break;
                      }

                  }
              }
              if(insertIndex >-1 && !succes){
                  current.add(insertIndex,A.get(i));
                  succes=true;
                  //  insertIndex=-1;
              }
              if (!succes) {
                  current.add(A.get(i));
              }


          }



      }
      java.util.concurrent.atomic.AtomicBoolean zero=new  java.util.concurrent.atomic.AtomicBoolean(true);
      for(int i=list.size();i >0;i--){
          List<Integer> integers= list.get(i-1);
          integers.forEach(x ->  {
              builder.append(x);
              // builder.append("-");
              if(x==0){
                  zero.set(zero.get() && true);
              }else{
                  zero.set(zero.get() && false);
              }
          });
      }
      if(zero.get()) return 0+"";
      return  builder.toString();

  }
}