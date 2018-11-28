package com.datatstructure.stack;

import javax.swing.text.html.Option;
import java.util.Optional;

public enum Operator {

    PLUS(1, '+'), MINUS(1, '-'), MULTIPLICATION(2, '*'), DEVIDE(2, '/'), LEFT_PARANTHESIS(3, '('), RIGHT_PARANTHESIS(3, ')');

    private int priority;
    private char symbol;

    Operator(int i, char c) {
        this.priority = i;
        this.symbol = c;
    }

    public static Optional<Operator> isOperator(char ch) {
        for (Operator op : values()) {
            if (op.getSymbol() == ch) {
                return Optional.of(op);
            }
        }
        return Optional.empty();
    }

    public static boolean higherPriority(Optional<Operator> curOp, Character peek) {
        if(peek ==null) return false;
        Optional<Operator> operator = isOperator(peek);
        if (operator.isPresent()) {

           if ((!operator.get().equals(Operator.LEFT_PARANTHESIS)) && curOp.get().getPriority() <= operator.get().getPriority()){
             return true;
           }
        }
        return false;
    }


    public int getPriority() {
        return priority;
    }

    public void setPriority(int priority) {
        this.priority = priority;
    }

    public Character getSymbol() {
        return symbol;
    }

    public void setSymbol(char symbol) {
        this.symbol = symbol;
    }


}
