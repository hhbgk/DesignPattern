package com.hhbgk.designpattern.interpreter;

import java.util.HashMap;

/**
 * 抽象表达式(Expression)角色：定义解释器的接口，约定解释器的解释操作，主要包含解释方法interpret()
 */
public interface IExpression {
    int interpret(HashMap<String, Integer> var);
}
