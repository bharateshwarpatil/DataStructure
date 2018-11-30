package com.datatstructure.stack;

import javax.swing.text.html.Option;
import java.util.Optional;
import java.util.regex.Pattern;

/**
 *
 *
 */
public class StackUtil {


    /**
     * @param expression
     * @return
     */
    public String doPostFix(String expression) {
        char[] op = new char[expression.length()];
        StringBuilder expressionBuilder = new StringBuilder();
        expression.getChars(0, expression.length(), op, 0);
        Stack<Character> stack = new Stack<>();
        for (char ch : op) {
            Optional<Operator> curOp = Operator.isOperator(ch);
            if (!curOp.isPresent()) {
                expressionBuilder.append(ch);
            } else {
                if (Operator.RIGHT_PARANTHESIS.getSymbol().equals(ch)) {

                    while ((Operator.LEFT_PARANTHESIS.getSymbol()!= stack.peek()) && stack.peek()!=null) {
                        expressionBuilder.append(stack.pop());
                    }
                    stack.pop();
                    continue;
                }
                while (Operator.higherPriority(curOp, stack.peek())) {
                    expressionBuilder.append(stack.pop());
                }

                stack.push(ch);
            }
        }

        while (stack.peek()!=null){
            expressionBuilder.append(stack.pop());
        }

      //   System.out.print(expressionBuilder.toString());

        return expressionBuilder.toString();
    }


     public void reverseStack(Stack stack){
        if(stack.isEmpty()) return;
         Object data=stack.pop();
         reverseStack(stack);
         recursivePushStack(stack,data);


     }


    public void recursivePushStack(Stack stack,Object data){
        if(stack.isEmpty()) {
            stack.push(data);
            return;
        }
        Object tmp=stack.pop();
        recursivePushStack(stack,data);
        stack.push(tmp);
    }



}
