package com.datastructure.graph;

import com.datastructure.stack.Stack;
import java.util.HashSet;
import java.util.Set;

public class TopologySort {
    /**
     * @param graph
     */
    public Stack<Vertex<Integer>> sort(Graph<String, Integer, Integer> graph) {
       final Set<Vertex<Integer>> set = new HashSet<Vertex<Integer>>();
        Stack<Vertex<Integer>> stack = new Stack<Vertex<Integer>>();
        Set<Vertex<Integer>> setVertices= graph.getAllVertices();
         setVertices.stream().filter(vertex1 -> !set.contains(vertex1)).forEach(vertex1 -> {
            toplogySort(set,stack,vertex1,graph);
        });
        //print the sorted
        while(stack.peek()!=null){
            System.out.print(stack.pop());
            System.out.print(" -> ");
        }
        System.out.print("\n");
        return stack;
    }

    /**
     *
     * @param set
     * @param stack
     * @param vertex
     * @param graph
     */
    private void toplogySort(final Set<Vertex<Integer>> set, final Stack<Vertex<Integer>> stack, final Vertex<Integer> vertex,final Graph<String, Integer, Integer> graph) {
        graph.getAllAdjecentVertices(vertex).stream().filter(vertex1 -> !set.contains(vertex1)).forEach(vertex1-> {
            set.add(vertex1);
            toplogySort(set,stack,vertex1,graph);
        });
        stack.push(vertex);
    }

}
