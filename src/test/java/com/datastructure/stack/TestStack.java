package com.datastructure.stack;

import com.datatstructure.stack.Stack;
import com.datatstructure.stack.StackUtil;
import org.junit.Assert;
import org.junit.Test;

public class TestStack {

    @Test
    public void testStack() {
        Stack stack = new Stack();
        stack.push(10);
        stack.push(20);
        Assert.assertEquals(20, stack.pop());
        Assert.assertEquals(10, stack.pop());
    }

    @Test
    public void testStack2() {
        Stack stack = new Stack();
        stack.push(10);
        stack.pop();
        stack.push(20);
        stack.push(10);
        Assert.assertEquals(10, stack.pop());
        Assert.assertEquals(20, stack.pop());
    }

    @Test
    public void testStack3() {
        Stack stack = new Stack();
        stack.push(10);
        stack.pop();
        stack.push(20);
        stack.push(10);
        Assert.assertEquals(10, stack.peek());
        Assert.assertEquals(10, stack.pop());
        Assert.assertEquals(20, stack.pop());
    }


    @Test
    public void testStack4() {
        Stack stack = new Stack();
        stack.push(10);
        stack.push(20);
        Assert.assertEquals(20, stack.pop());
        Assert.assertEquals(10, stack.pop());
        Assert.assertEquals(null, stack.pop());
    }

     @Test
    public void testInfixToPostFix0(){
        StackUtil stackFn=new StackUtil();
        Assert.assertEquals("ab+",stackFn.doPostFix("(a+b)"));
    }
    @Test
    public void testInfixToPostFix1(){
        StackUtil stackFn=new StackUtil();
        Assert.assertEquals("ab+cd++",stackFn.doPostFix("(a+b)+(c+d)"));
    }
    @Test
    public void testInfixToPostFix2(){
        StackUtil stackFn=new StackUtil();
        Assert.assertEquals("abc*+d+",stackFn.doPostFix("a+b*c+d)"));
    }
}
