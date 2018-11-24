package com.datatstructure.stack;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Stack<T> {

    private Object[] container;
  // store some header value for the object
    private int maxCapacity = Integer.MAX_VALUE - 16;
    private int defaultCapacity = 10;
    private int top=-1;

    public Stack() {
     container=new Object[defaultCapacity];
    }

    /**
     *
     * @param data
     */
    public void push(T data) {
        ensureCapacity(top);
        container[++top]=data;
    }

    private void ensureCapacity(int currentLength) {
      if(container.length >= currentLength){
      int newCapacity = container.length + container.length >> 1;
          if (newCapacity - maxCapacity > 0)
              container = Arrays.copyOf(container, newCapacity);
      }
    }

  public T pop(){
      if (isEmpty()) return null;
      T object= (T) container[top];
       container[top]=null;
       top--;
       return object;
    }

    private boolean isEmpty() {
        if(top < 0){
            return true;
        }
        return false;
    }

    public T peek(){
        if (isEmpty()) return null;
        return (T) container[top];
    }

    public int size(){
        return top;
    }
}
