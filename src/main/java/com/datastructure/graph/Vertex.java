package com.datastructure.graph;

import java.util.ArrayList;
import java.util.List;

public class Vertex<T> {

    private T data;

    private volatile Color nodeVisit = Color.WHITE;

    public Vertex(T data) {
        this.data = data;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }


    public void changeColor() {
        if (Color.WHITE == nodeVisit) {
            nodeVisit=Color.GRAY;
        }else if(Color.GRAY == nodeVisit){
            nodeVisit=Color.BLACK;
        }
    }

    public static enum Color {
        WHITE, GRAY, BLACK;

        public Color getValue(String colorEnum){
            for(Color colorenum:values()){
                if(colorenum.name().equals(colorEnum)){
                    return colorenum;
                }
            }
            throw new IllegalArgumentException(String.format("Not valid  %s color  for the node ",colorEnum));
        }
    }

    public boolean isvisited(){
        if(nodeVisit == Color.WHITE){
          return   false;
        }
        return true;
    }

    public void resetVisitedFlag(){
        nodeVisit=Color.WHITE;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Vertex)) return false;
        Vertex<?> vertex = (Vertex<?>) o;
        return getData().equals(vertex.getData());
    }

    @Override
    public int hashCode() {
        return getData() != null ? getData().hashCode() : 0;
    }

    @Override
    public String toString() {
        return "Vertex{" +
                "data=" + data +
                ", nodeVisit=" + nodeVisit +
                '}';
    }
}
