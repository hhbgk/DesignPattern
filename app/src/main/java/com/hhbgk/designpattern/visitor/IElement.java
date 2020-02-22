package com.hhbgk.designpattern.visitor;

/**
 * 元素接口或者抽象类，它定义了一个接受访问者(accept)的方法，其意义是指每一个元素都要可以被访问者访问
 */
public interface IElement {
    void accept(IVisitor visitor);
}
