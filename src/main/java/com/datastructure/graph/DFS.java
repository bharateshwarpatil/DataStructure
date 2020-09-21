package com.datastructure.graph;

import com.datastructure.stack.Stack;

import java.util.List;

public class DFS {

    /**
     * @param graph
     */
    public void DFSSearch(Graph<String, Integer, Integer> graph) {
        Vertex<Integer> vertex = graph.getRandomvertex();
        Stack<Vertex<Integer>> stack = new Stack<Vertex<Integer>>();
        dfs(graph, vertex, stack);


    }

    /***
     *
     * @param graph
     * @param vertex
     * @param stack
     */
    private void dfs(Graph<String, Integer, Integer> graph, Vertex<Integer> vertex, Stack<Vertex<Integer>> stack) {
        if (vertex == null || vertex.isvisited()) return;
        vertex.changeColor();
        System.out.println(vertex);
        stack.push(vertex);
        List<Vertex<Integer>> vertices = graph.getAllAdjecentVertices(vertex);
        if (!vertices.isEmpty()) {
            vertices.forEach(vertex1 -> {
                dfs(graph, vertex1, stack);
            });
        } else {
            dfs(graph, stack.peek(), stack);
        }
    }


}
