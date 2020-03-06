package com.selfguide.datastructure.graph;

import java.util.List;

/**
 *
 * @author Bharateshwar Patil
 * @param <E> Edge Data
 * @param <W> Weightage for the
 * @param <V> Vertex
 */
public class Graph<E, W extends Comparable, V> {

    private EdgeList<E, W, V> edgeList = new EdgeList<E, W, V>();

    private AdjacencyList<V> adjacencyList = new AdjacencyList<V>();

    public void addEdge(E edgeDetail, W weight, V vertex, V vertex2) {
        edgeList.addEdge(edgeDetail, weight, vertex, vertex2);
        adjacencyList.addAdjecentVertices(vertex, vertex2);
        adjacencyList.addAdjecentVertices(vertex2, vertex);
    }

    public void addVertex(V vertex, V vertex2) {
        adjacencyList.addAdjecentVertices(vertex, vertex2);
        adjacencyList.addAdjecentVertices(vertex2, vertex);
    }

    public void addSingleVertex(V vertex) {
        adjacencyList.addAdjecentVertices(vertex, null);
    }

    public List<Vertex<V>> getAllAdjecentVertices(Vertex<V> vertex) {
        return adjacencyList.getAllAdjecentVertices(vertex);
    }

    public List<Vertex<V>> getAllAdjecentVertices(V data) {
        return adjacencyList.getAllAdjecentVertices(data);
    }

    public List<Edge<E,W,V>> getEdges(){
      return  edgeList.getEdges();
    }


}