package com.hhbgk.designpattern.visitor;

import java.util.Random;

/**
 * 具体的元素类，它提供接受访问的具体实现，而这个具体的实现，通常情况下是使用访问者提供的访问该元素类的方法
 */
public class ManagerElement implements IElement {

    public String getName() {
        return name;
    }

    private String name;
    public ManagerElement(String name) {
        this.name = name;
    }

    @Override
    public void accept(IVisitor visitor) {
        visitor.visit(this);
    }

    public int getProjects() {
        return new Random().nextInt(20);
    }

    public int getNewProducts() {
        return new Random().nextInt(10);
    }

    public int getKpi() {
        return new Random().nextInt(10);
    }
}
