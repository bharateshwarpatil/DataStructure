package com.selfguide.datastructure.graph;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * @author Bharateshwar Patil
 * @param <E>
 * @param <W>
 * @param <V>
 */
public class EdgeList<E,W extends Comparable,V> {

   private List<Edge<E,W,V>> edgeList = new ArrayList<Edge<E,W,V>>();

   public void addEdge(E data, V vertices1, V vertices2) {
        edgeList.add(new Edge<E,W,V>(data, new Vertex<V>(vertices1), new Vertex<V>(vertices2)));
    }

    /**
     *
     * @param data
     * @param weight
     * @param vertices1
     * @param vertices2
     */
    public void addEdge(E data, W weight,V vertices1, V vertices2) {
        edgeList.add(new Edge<E,W,V>(data, weight,new Vertex<V>(vertices1), new Vertex<V>(vertices2)));
    }

   /**
     *
     * @param edge
     * @param v1
     * @param v2
     */
    public void addEdge(Edge<E,W,V> edge, Vertex<V> v1, Vertex<V> v2) {
        edge.setVertex1(v1);
        edge.setVertex2(v2);
    }

    /**
     *
     * @param edgeInfo
     * @return
     */
   public Edge<E,W,V> findVerticeForEdge(E edgeInfo) {
        for (Edge<E,W,V> edge : edgeList) {
            if (edge.getEdgeDetail().equals(edgeInfo)) {
                return edge;
            }
        }
        return null;
    }

    /**
     *
     * @return
     */
    public List<Edge<E,W,V>> getSortedEdgeList(){
        Collections.sort(edgeList, new Comparator<Edge<E, W,V>>() {
            public int compare(Edge<E, W,V> o1, Edge<E, W,V> o2) {
                return o1.compareTo((W) o2);
            }
        });
        return edgeList;
    }

    /**
     *
     * @param
     * @return
     */
    public List<Edge<E,W,V>> getEdges(){
        return edgeList;
    }

}
