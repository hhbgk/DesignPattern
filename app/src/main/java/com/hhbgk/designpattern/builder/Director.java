package com.hhbgk.designpattern.builder;

/**
 * 指挥者
 */
public class Director {
    private ConcreteBuilder concreteBuilder;

    public Director(ConcreteBuilder concreteBuilder) {
        this.concreteBuilder = concreteBuilder;
    }

    //按顺序构建产品
    public Car construct(){
        concreteBuilder.buildFrame();
        concreteBuilder.buildTire();
        concreteBuilder.buildEngine();
        return concreteBuilder.getResult();
    }
}
