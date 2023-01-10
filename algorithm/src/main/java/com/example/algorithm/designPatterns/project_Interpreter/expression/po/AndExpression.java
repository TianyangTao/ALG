package com.example.algorithm.designPatterns.project_Interpreter.expression.po;

import com.example.algorithm.designPatterns.project_Interpreter.expression.Expression;

public class AndExpression implements Expression {

    // write your code here
    Expression e1;
    Expression e2;

    public AndExpression(Expression e1, Expression e2) {
        this.e1 = e1;
        this.e2 = e2;
    }
    @Override
    public boolean interpret(String context) {
        return e1.interpret(context) && e2.interpret(context);
    }
}
