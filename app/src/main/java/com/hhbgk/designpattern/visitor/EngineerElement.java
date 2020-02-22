package com.hhbgk.designpattern.visitor;

import java.util.Random;

/**
 * 具体的元素类，它提供接受访问的具体实现，而这个具体的实现，通常情况下是使用访问者提供的访问该元素类的方法
 */
public class EngineerElement implements IElement {
    private String name;

    public EngineerElement(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public void accept(IVisitor visitor) {
        visitor.visit(this);
    }

    public int getCodeLines() {
        return new Random().nextInt(100 * 1000);
    }

    public int getKpi() {
        return new Random().nextInt(10);
    }
}
