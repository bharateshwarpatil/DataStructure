package com.datastructure.graph;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class BFS {

    /**
     * @param graph
     *
     */
    public void bfsSearch(Graph<String, Integer, Integer> graph) {
        Vertex<Integer> vertex = graph.getRandomvertex();
        Queue<Vertex> queue = new LinkedList<Vertex>();
        vertex.changeColor();
        queue.offer(vertex);
        while(!queue.isEmpty()){
            vertex=queue.poll();
            vertex.changeColor();//change to black
            System.out.println(vertex);
            List<Vertex<Integer>> vertices = graph.getAllAdjecentVertices(vertex);
            vertices.stream().filter(vertex1 -> !vertex1.isvisited()).forEach(vertex1->{
                vertex1.changeColor();//change to Gray
                queue.offer(vertex1);
            });
        }
    }

}
