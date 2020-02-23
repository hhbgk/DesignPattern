package com.hhbgk.designpattern.interpreter;

import java.util.HashMap;

/**
 * 终结符表达式(Terminal Expression)角色：是抽象表达式的子类，用来实现文法中与终结符相关的操作，
 * 文法中的每一个终结符都有一个具体终结表达式与之相对应。
 */
public class NumberExpression implements IExpression {
    private String key;
    public NumberExpression(String key) {
        this.key = key;
    }

    @Override
    public int interpret(HashMap<String, Integer> var) {
        return var.get(key);
    }
}
