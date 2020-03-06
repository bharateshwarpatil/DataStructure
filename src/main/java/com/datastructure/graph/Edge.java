package com.selfguide.datastructure.graph;

/**
 *
 * @author Bharat
 * @param <T>
 * @param <W>
 */
public class Edge<T , W extends Comparable, V > implements Comparable<W> {

   private  T edgeDetail;

   private  W  weightage;

   private Vertex<V> vertex1;

   private Vertex<V> vertex2;

    public Edge(Vertex vertex1, Vertex vertex2) {
        this.vertex1 = vertex1;
        this.vertex2 = vertex2;
    }

    public Edge(T edgeDetail, Vertex vertex1, Vertex vertex2) {
        this(vertex1, vertex2);
        this.edgeDetail = edgeDetail;
    }

    public Edge(T edgeDetail,W weightage, Vertex<V> vertex1, Vertex<V> vertex2) {
        this(edgeDetail,vertex1, vertex2);
        this.weightage = weightage;
    }

    public void setVertex1(Vertex vertex1) {
        this.vertex1 = vertex1;
    }

    public void setVertex2(Vertex vertex2) {
        this.vertex2 = vertex2;
    }

    public T getEdgeDetail() {
        return edgeDetail;
    }

    public Vertex getVertex1() {
        return vertex1;
    }

    public Vertex getVertex2() {
        return vertex2;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Edge)) return false;
        Edge<?, ?,?> edge = (Edge<?, ?,?>) o;
        return getEdgeDetail() != null ? getEdgeDetail().equals(edge.getEdgeDetail()) : edge.getEdgeDetail() == null;
    }

    @Override
    public int hashCode() {
        return getEdgeDetail() != null ? getEdgeDetail().hashCode() : 0;
    }

    public int compareTo(W o) {
           if(o == null) return  1;
           if(weightage == null) return -1;
        return this.weightage.compareTo(o);
    }
}
