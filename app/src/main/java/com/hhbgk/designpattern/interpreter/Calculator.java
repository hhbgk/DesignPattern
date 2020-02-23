package com.hhbgk.designpattern.interpreter;

import android.util.Log;

import java.util.HashMap;
import java.util.Stack;

/**
 * 环境(Context)角色：通常包含各个解释器需要的数据或是公共的功能，一般用来传递被所有解释器共享的数据，
 * 后面的解释器可以从这里获取这些值。
 */
public final class Calculator {
    private IExpression expression;
    private HashMap<String, Integer> hashMap;

    public Calculator(String expressionStr) {
        Stack<IExpression> stack = new Stack<>();
        char[] chars = expressionStr.toCharArray();
        getValue(expressionStr);

        IExpression left;
        IExpression right;

        for (int i = 0; i < chars.length; i++) {
            switch (chars[i]) {
                case '+':
                    left = stack.pop();
                    right = new NumberExpression(String.valueOf(chars[++i]));
                    stack.push(new AddExpression(left, right));
                    break;
                case '-':
                    left = stack.pop();
                    right = new NumberExpression(String.valueOf(chars[++i]));
                    stack.push(new SubExpression(left, right));
                    break;
                default:
                    stack.push(new NumberExpression(String.valueOf(chars[i])));
                    break;
            }
        }
        expression = stack.pop();
    }

    public int calculate() {
        return expression.interpret(hashMap);
    }

    private void getValue(String expStr) {
        hashMap = new HashMap<>();

        for(char ch : expStr.toCharArray()) {
            if(ch != '+' && ch != '-' ) {
                Log.e("test", "key：" + ch + "," +Integer.valueOf(String.valueOf(ch)));
                hashMap.put(String.valueOf(ch), Integer.valueOf(String.valueOf(ch)));
            }
        }
    }
}
