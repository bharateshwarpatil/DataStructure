package com.datastructure.other;

import java.util.HashMap;
import java.util.Map;

public class SherlokValidString {

    static String isValid(String s) {

        Map<Character,Integer> cache= new HashMap<Character,Integer>();
        Map<Integer,Integer> indexCache= new HashMap<Integer, Integer>();
        int min=1;
        int max=1;
        for(int i=0;i<s.length();i++){
            Integer val =cache.get(s.charAt(i));
            if(val==null){
                cache.put(s.charAt(i),1);
            }else{
              val++;
                cache.put(s.charAt(i),val);
            }
         }

        for (Map.Entry<Character,Integer> entry : cache.entrySet()){
            Integer count=indexCache.get(entry.getValue());

            if(count==null){
                indexCache.put(entry.getValue(),1);
            }else{
                count++;
                indexCache.put(entry.getValue(),count);

                if(max<count) max=count;
                if(min>count) min=count;

            }
        }
        if(indexCache.size() > 2 ){
            return "NO";
        }

         if(max-min !=min) {
             return "NO";
         }
        boolean notValid=true;
        for (Map.Entry<Integer,Integer> entry : indexCache.entrySet()){
           if(entry.getValue()==1) notValid=false;
        }

        if(notValid) return "NO" ;
        return "YES";
    }

    public static void main(String[] args) {
        System.out.println( isValid("aabbcccc"));
    }
}
