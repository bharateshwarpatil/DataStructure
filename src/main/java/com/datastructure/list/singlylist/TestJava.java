package com.datastructure.list.singlylist;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;

public class TestJava {


    public static int getCounGroup(int [] [] args){
        int totalGroups=0;
        for(int i=0;i<args.length;i++){
            int row =i;
            int col=0;
            boolean isPass=false;
            while(true){
                if(args[row][col]==1 && col+1 < args[row].length){
                col++;
                    isPass=true;
                }else if(row+1 < args.length){
                     row++;
                    continue;
                }else if(col+1 < args[row].length){
                    col++;
                }
                break;
              }
              if(isPass){
                  totalGroups++;
                  isPass=false;
              }
          }

          return totalGroups;
    }


    public  static void main(String [] args) {
 Pattern pattern = Pattern.compile("[\\(,\\)\\[\\]\\{\\}]");
        char a = 'b';
        if("abc".indexOf(a)!=-1){

        }

        System.out.println(EmpCode.getEnum(1001));

     StringBuilder builder =new StringBuilder();
     builder.append(1);
    }


    public enum EmpCode {
        ASSOCIATE(1001),SENIOR_ASSOCIATE(1002),MANAGER(1003),SENIOR_MANAGER(1004);

        private int code;
        EmpCode(int vcode){
            code=vcode;
        }
        // also implement this method properly

        public static EmpCode getEnum(int code) {
            EmpCode empCodereturCode=null;
            for (EmpCode empCodeV : EmpCode.values()){
                if(empCodeV.code==code){
                    empCodereturCode= empCodeV;
                    break;
                }

            }

            return empCodereturCode;
        }

    }

}

