package com.datastructure.queue;

import com.datastructure.graph.Vertex;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class BinaryHeap<T,W extends Comparable> {
   List<Node<T,W>> minHeap = new ArrayList<Node<T,W>>();
   Map<T,Integer> map = new HashMap<>();

    /***
     *
     * @param key
     * @param weight
     */
   public void add (T key, W weight){
       Node<T,W>node=new Node(key,weight);
       minHeap.add(node);
       int locIndex = minHeap.size()-1;
       map.put(node.getKey(),locIndex);
        while (locIndex>=0){
            int childIndex=locIndex;
            locIndex=  getParentIndex(locIndex);
            Node<T,W>  pnode= minHeap.get(locIndex);
            if(node.compareTo(pnode) < 0){
                swap(pnode,node);
                //updateposition(pnode,node,locIndex,childIndex);
            }else{
                break;
            }
        }

   }

    /**
     * delete min
     * @return
     */
   public Node extractMin(){
       if(minHeap.isEmpty()) return null;
       if(minHeap.size()>1){
           Node<T,W> minnode=  minHeap.get(0);
           T minnodeKey= minnode.getKey();
           Node<T,W>lastnode=  minHeap.remove(minHeap.size()-1);
           minnode.setKey(lastnode.getKey());
           minnode.setWeight(lastnode.getWeight());
       }else{
           return minHeap.remove(0);
       }

      return  null;
   }

    private void swap(Node<T,W> pnode, Node<T,W> node) {
         T keyp= pnode.getKey();
         W weightp=pnode.getWeight();
         pnode.setKey(node.getKey());
         pnode.setWeight(node.getWeight());
         node.setWeight(weightp);
         node.setKey(keyp);
    }

    /**
     * 0 1 2 ,3,4,5,6
     *   0 0 1,1,2,2
     * @param locIndex
     * @return
     */
     private  Node getParent(int locIndex){
      int index= getParentIndex(locIndex);
       if(index >= 0 && index < (minHeap.size()-1) ){
          return  minHeap.get(index);
       }
       throw  new IllegalArgumentException(String.format("Wrong Index for the queue %d",locIndex));
   }

    private int getParentIndex(int locIndex){
        return (locIndex-1)/2;
    }

    private int getRightchild(int locIndex){
        return (locIndex*2)+1;
    }

    private int getleftchild(int locIndex){
        return (locIndex*2)+2;
    }

}
