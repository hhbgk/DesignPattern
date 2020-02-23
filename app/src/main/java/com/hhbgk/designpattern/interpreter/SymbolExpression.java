package com.hhbgk.designpattern.interpreter;

/**
 * 非终结符表达式(Nonterminal Expression)角色：也是抽象表达式的子类，用来实现文法中与非终结符相关的操作，
 * 文法中的每条规则都对应于一个非终结符表达式。
 */
public abstract class SymbolExpression implements IExpression {
    protected IExpression left;
    protected IExpression right;

    public SymbolExpression(IExpression l, IExpression r) {
        left = l;
        right = r;
    }
}
