package com.selfguide.datastructure.list;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class FileProcess {


    public void read(){



    }

    public static void main(String[] args) {

        List<String> list = new ArrayList<String>();


        LinkedList<String> lklist = new LinkedList<String>();
        lklist.offer("bharat");
        lklist.offer("Gubbi");
        //lklist.remove();
        lklist.offer("poonam");
        list.addAll(lklist);

        System.out.println(list);

    }

}
