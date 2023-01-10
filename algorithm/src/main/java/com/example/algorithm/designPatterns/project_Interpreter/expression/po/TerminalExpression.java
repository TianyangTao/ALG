package com.example.algorithm.designPatterns.project_Interpreter.expression.po;


import com.example.algorithm.designPatterns.project_Interpreter.expression.Expression;

public class TerminalExpression implements Expression {
    private String[] data;

    public TerminalExpression(String[] data) {
        this.data = data;
    }
    @Override
    public boolean interpret(String context) {
        for (String s : data) {
            if (context.contains(s)) {
                return true;
            }
        }
        return false;
    }
    // write your code here

}
