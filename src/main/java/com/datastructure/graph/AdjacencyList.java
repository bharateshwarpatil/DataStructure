package com.selfguide.datastructure.graph;

import java.util.*;

/**
 * @param <V>
 * @author Bharateshwar Patil
 */
public class AdjacencyList<V> {

    private Map<Vertex<V>, Set<Vertex<V>>> adjacencyMap = new HashMap<Vertex<V>, Set<Vertex<V>>>();
    /**
     *
     * @param vertex
     * @param adjecentVertices
     */
    public void addAdjecentVertices(Vertex<V> vertex, Vertex<V>... adjecentVertices) {
        Set<Vertex<V>> vertexList = adjacencyMap.get(vertex);
        if (vertexList == null) {
            vertexList = new HashSet<Vertex<V>>();
            adjacencyMap.put(vertex, vertexList);
        }
        Collections.addAll(vertexList, adjecentVertices);
    }

    /**
     *
     * @param vertexValue
     * @param adjecentVertices
     */
    public void addAdjecentVertices(V vertexValue, V... adjecentVertices) {
        Vertex vertex = new Vertex<V>(vertexValue);
        Set<Vertex<V>> vertexList = adjacencyMap.get(vertex);
        if (vertexList == null) {
            vertexList = new HashSet<Vertex<V>>();
            adjacencyMap.put(vertex, vertexList);
        }
        if (adjecentVertices != null) for (V vertexVal : adjecentVertices) vertexList.add(new Vertex<V>(vertexVal));

    }

    /**
     *
     *
     * @param vertex
     * @return
     */
    public List<Vertex<V>> getAllAdjecentVertices(Vertex<V> vertex) {
        List<Vertex<V>> vertices=    new ArrayList<Vertex<V>>();
        vertices.addAll(adjacencyMap.get(vertex));
        return vertices;
    }

    /**
     *
     * @param data
     * @return
     */
    public List<Vertex<V>> getAllAdjecentVertices(V data) {
        List<Vertex<V>> vertices=    new ArrayList<Vertex<V>>();
        vertices.addAll(adjacencyMap.get(new Vertex<V>(data)));
        return vertices;
    }

}
