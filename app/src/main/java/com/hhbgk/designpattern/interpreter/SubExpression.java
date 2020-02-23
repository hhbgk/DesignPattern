package com.hhbgk.designpattern.interpreter;

import java.util.HashMap;

public class SubExpression extends SymbolExpression {
    public SubExpression(IExpression l, IExpression r) {
        super(l, r);
    }

    @Override
    public int interpret(HashMap<String, Integer> var) {
        return left.interpret(var) - right.interpret(var);
    }
}
