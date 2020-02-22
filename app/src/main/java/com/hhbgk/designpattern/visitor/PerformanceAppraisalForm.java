package com.hhbgk.designpattern.visitor;

import java.util.ArrayList;
import java.util.List;

/**
 * 定义当中所提到的对象结构，对象结构是一个抽象表述，它内部管理了元素集合，并且可以迭代这些元素提供访问者访问
 */
public class PerformanceAppraisalForm {
    private List<IElement> list = new ArrayList<>();

    public void add(IElement element) {
        list.add(element);
    }

    public void remove(IElement element) {
        list.remove(element);
    }

    public void show(IVisitor visitor) {
        for (IElement e : list) {
            e.accept(visitor);
        }
    }
}
