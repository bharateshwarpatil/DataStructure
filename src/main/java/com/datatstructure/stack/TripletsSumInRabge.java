package com.datatstructure.stack;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TripletsSumInRabge {

    public static void main(String[] args) {

       // String[] a = {  "0.503094", "0.648924", "0.999298", "0.853928", "3.457635", "5.030008", "2.434625", "3.081333", "4.629904", "0.551040", "2.950470", "2.248522", "1.426132", "4.848954", "4.624663", "1.095358", "0.980046", "3.620912", "3.504833", "1.930379" };
        //String[] a = { "0.902804", "0.000298", "0.748024", "0.139023", "0.082317", "0.013348", "4.209490", "0.098512", "0.055635", "0.060427", "3.290499", "0.073212", "0.071914", "0.065654", "0.044422", "0.024968", "0.110226", "0.090197", "0.060240", "0.100432", "0.109920", "0.023673", "0.081927", "0.066987", "0.058557", "0.043674", "0.057256", "0.050478", "0.024976", "0.048124", "0.071043", "0.048199", "0.023894", "0.058934", "0.047465", "0.088664", "0.002571", "0.070546", "0.042776" };
       // String[] a = {"0.038089", "0.345795", "0.226426", "0.236377", "0.022112", "0.205749", "0.251645", "0.176912", "0.385263", "0.343043"   };
       // String[]  a = {"0.366507", "0.234601", "2.126313", "1.372403", "2.022170", "0.308558", "2.120754", "1.561462"};
       // String [] a={ "0.843965", "0.929296", "1.525570", "1.469064", "1.318529", "1.207967", "1.294448", "1.145449", "1.767975", "1.008212"};
        String [] a={"0.843965", "0.929296", "1.525570", "1.469064", "1.318529", "1.207967", "1.294448", "1.145449", "1.767975", "1.008212" };
        System.out.println(solve((List<String>) Arrays.asList(a)));
    }

    static public int solve(List<String> A) {
        if(A.size() <3) return 0;
        List<Float> lessThan = new ArrayList<>();
        List<Float> greterThan = new ArrayList<>();
        int cnt=1;
        float sum=0;
        for (String data : A) {
            float dat = Float.valueOf(data);
            cnt=0;
            sum=0;
            if (dat <= 1) {
                  int i=Math.max(lessThan.size(),0);
                  while( i>0 && !lessThan.isEmpty() && lessThan.get(i-1) > dat){
                      i--;
                    }
                     lessThan.add(i,dat);
                if(lessThan.size() >3){
                    sum= lessThan.get(lessThan.size()-1)+
                            lessThan.get(lessThan.size()-2)+
                            lessThan.get(lessThan.size()-3);
                    if(sum > 1 && sum <2){
                        return 1;
                    }
                }
             }else  if (dat < 2){

                int i=Math.max(greterThan.size(),0);
                while( i>0 && !greterThan.isEmpty() && greterThan.get(i-1) > dat){
                    i--;
                }
                if(greterThan.size() >3) {
                    sum = greterThan.get(greterThan.size() - 1) +
                            greterThan.get(greterThan.size() - 2) +
                            greterThan.get(greterThan.size() - 3);
                    if (sum > 1 && sum < 2) {
                        return 1;
                    }
                }
                greterThan.add(i,dat);

             }
            }

        if(lessThan.size() < 3){
            lessThan.addAll(greterThan);
            greterThan.clear();
        }
         sum =0;

         sum= lessThan.get(lessThan.size()-1)+
                lessThan.get(lessThan.size()-2)+
                lessThan.get(lessThan.size()-3);
        if(sum > 1 && sum <2){
            return 1;
        }

        sum=0;
        if(greterThan.size() >0 && lessThan.size() >=2){
            sum=greterThan.get(0)+lessThan.get(0)+lessThan.get(1);
            if(sum >1  && sum< 2) {
                return 1;
            }
        }


           sum=0;
         for(int i=0;i<lessThan.size()-3;i++){
                sum=lessThan.get(i)+lessThan.get(i+1)+lessThan.get(i+2);
                if(sum >1  && sum< 2) {
                    return 1;
                }
        }


        return 0;
    }


}
