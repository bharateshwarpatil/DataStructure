package com.selfguide.datastructure.graph;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @Author Bharateshwar Patil
 */
public class AdjacencyMetrics {

    boolean [][] metrics = null;

    public AdjacencyMetrics(int sizex, int sizey) {
        metrics = new boolean[sizex][sizey];
        for (boolean array[]:metrics) {
            Arrays.fill(array,false);
        }
    }

    public void addEdge(int i,int j) {
        metrics[i][j]=true;
    }

    public void removeEdge(int i,int j) {
        metrics[i][j]=false;
    }





    public static void main(String[] args) {
        AdjacencyMetrics metrics = new AdjacencyMetrics(4,5);
    }

}
