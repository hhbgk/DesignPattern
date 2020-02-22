package com.hhbgk.designpattern.iterator;

/**
 * 抽象聚合（Aggregate）角色：定义存储、添加、删除聚合对象以及创建迭代器对象的接口
 * @param <E>
 */
public interface IAggregate<E> {
    void add(E e);
    void remove(E e);
    IIterator<E> getIterator();
}
