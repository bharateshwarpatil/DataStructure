package com.datastructure.graph;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * @param <E> Edge Data
 * @param <W> Weightage for the
 * @param <V> Vertex
 * @author Bharateshwar Patil
 */
public class Graph<E, W extends Comparable, V> {

    private EdgeList<E, W, V> edgeList = new EdgeList<E, W, V>();

    private AdjacencyList<V> adjacencyList = new AdjacencyList<V>();

    private Set<Vertex<V>> vertices = new HashSet<Vertex<V>>();


    public void addEdge(E edgeDetail, W weight, V vertexData1, V vertexData2) {
        Vertex<V> vertex1 = new Vertex<V>(vertexData1);
        Vertex<V> vertex2 = new Vertex<V>(vertexData2);
        edgeList.addEdge(edgeDetail, weight, vertex1, vertex2);
        adjacencyList.addAdjecentVertices(vertex1, vertex2);
        adjacencyList.addAdjecentVertices(vertex2, vertex1);
        vertices.add(vertex1);
        vertices.add(vertex2);
    }

    public void addVertex(V vertexData1, V vertexData2) {
        Vertex<V> vertex1 = new Vertex<V>(vertexData1);
        Vertex<V> vertex2 = new Vertex<V>(vertexData2);
        adjacencyList.addAdjecentVertices(vertex1, vertex2);
        adjacencyList.addAdjecentVertices(vertex2, vertex1);
        vertices.add(vertex1);
        vertices.add(vertex2);
    }

    public Vertex<V> getRandomvertex() {
        return adjacencyList.getRandomvertex();
    }

    public List<Vertex<V>> getAllAdjecentVertices(Vertex<V> vertex) {
        return adjacencyList.getAllAdjecentVertices(vertex);
    }

    public List<Vertex<V>> getAllAdjecentVertices(V data) {
        return adjacencyList.getAllAdjecentVertices(data);
    }


    public List<Edge<E, W, V>> getEdges() {
        return edgeList.getEdges();
    }

    public Set<Vertex<V>> getAllVertices() {
        return vertices;
    }

}